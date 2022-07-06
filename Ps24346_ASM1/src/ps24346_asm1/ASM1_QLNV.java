/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps24346_asm1;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class ASM1_QLNV extends javax.swing.JFrame {
    /**
     * Creates new form ASM1_QLNV
     */
     public void showClock() {
        Thread a = new Thread() {
             public void run() {
                try {
                    String gio ="";
                    String phut="";
                    String giay="";
                    while(true) {
                          //1. tạo một đối tượng
                    Calendar calendar = Calendar.getInstance();
                    int h = calendar.getTime().getHours();
                    int m = calendar.getTime().getMinutes();
                    int s = calendar.getTime().getSeconds();
                    if(h<10)
                        gio = "0" +h;
                    else 
                        gio ="" +h;
                    if(m<10)
                        phut = "0"+m;
                    else
                        phut= ""+m;
                    if(s<10)
                        giay = "0"+s;
                    else
                        giay = ""+s;
                           // hiển thị ra
                         jclock.setText(gio+":" +phut+":"+giay);
                         Thread.sleep(1000);
                    }
                  
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        a.start();
    }
    
    ArrayList<Nhanvien> list = new ArrayList<>();
    public ASM1_QLNV() {
        initComponents();
        showClock();
    }
    
    public void addNhanVien() {
        Nhanvien a = new Nhanvien();
        // gán giá trị từ các control
        a.ma = txtmanv.getText();
        a.hoTen = txthoten.getText();
        a.email = txtemail.getText();
        a.tuoi = (int) Double.parseDouble(txttuoi.getText());
        a.luong = Double.parseDouble(txtluong.getText());
        
        // thêm đối tượng vào danh sách
        list.add(a);
    }
    
    public boolean validate_data() {
        if(txtmanv.getText().trim().length() == 0) {
            // thông báo lỗi
            JOptionPane.showMessageDialog(this,"Mã nhân viên không được trống");
            // set màu nền
            txtmanv.setBackground(Color.yellow);
            txtmanv.requestFocus();
            return false; // kết thúc hàm nếu không làm các lệnh phía sau
          }
        
         if(txthoten.getText().trim().length() == 0) {
            // thông báo lỗi
            JOptionPane.showMessageDialog(this,"Họ tên không được trống");
            // set màu nền
            txthoten.setBackground(Color.yellow);
            txthoten.requestFocus();
            return false; // kết thúc hàm nếu không làm các lệnh phía sau
          }
         
          if(txttuoi.getText().trim().length() == 0) {
            // thông báo lỗi
            JOptionPane.showMessageDialog(this,"Tuổi không được trống");
            // set màu nền
            txttuoi.setBackground(Color.yellow);
            txttuoi.requestFocus();
            return false; // kết thúc hàm nếu không làm các lệnh phía sau
          }
          
           if(txtemail.getText().trim().length() == 0) {
            // thông báo lỗi
            JOptionPane.showMessageDialog(this,"Email không được trống");
            // set màu nền
            txtemail.setBackground(Color.yellow);
            txtemail.requestFocus();
            return false; // kết thúc hàm nếu không làm các lệnh phía sau
          }
            if(txtluong.getText().trim().length() == 0) {
            // thông báo lỗi
            JOptionPane.showMessageDialog(this,"Lương không được trống");
            // set màu nền
            txtluong.setBackground(Color.yellow);
            txtluong.requestFocus();
            return false; // kết thúc hàm nếu không làm các lệnh phía sau
          }
            
            try {
            int tuoi = Integer.parseInt(txttuoi.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Tuổi phải là số");
            txttuoi.setBackground(Color.yellow);
            txttuoi.requestFocus();
            return false;
        }
            
             try {
            int luong = Integer.parseInt(txtluong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Lương phải là số");
            txtluong.setBackground(Color.yellow);
            txtluong.requestFocus();
            return false;
        }
        return true;
    }
    // HIỂN THỊ LÊN BẢNG
    public void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblnhanvien.getModel();
        model.setRowCount(0);
        // dùng for duyệt danh sách sinh viên
        for(Nhanvien s : list) {
            Object[] row = new Object[]{s.ma, s.hoTen, s.tuoi, s.email, s.luong};
            // thêm vào model
            model.addRow(row);
        }
    }
        int index =0;
    public void showDetails() {
      // 1. Xác định đang click vào dòng nào 
        index = tblnhanvien.getSelectedRow();
        Nhanvien s = list.get(index);
        // hiển thị lên các control
        txtmanv.setText(s.ma);
        txthoten.setText(s.hoTen);
        txttuoi.setText(""+s.tuoi);
        txtemail.setText(s.email);
        txtluong.setText(""+s.luong);
    }
    
    public void removeNhanvien() {
        // xác định đang chọn dòng nào 
        index = tblnhanvien.getSelectedRow();
        //xóa sinh viên thứ index
        list.remove(index);
    }
    
    public void saveFile() {
        XFile1.writeObject("d://nhanvien.dat",list);
        JOptionPane.showMessageDialog(this, "Lưu file thành công");
    }
    
    public void openFile() {
        //đọc file 
        list = (ArrayList<Nhanvien>)XFile1.readObject("d://nhanvien.dat"); 
    }
    
    public void findByID() {
       //duyệt qua danh sách Nhanvien để tìm ra mã nhân viên
       for( Nhanvien emp : list) {
           // nếu tìm thấy manv
           if(emp.getMa().equalsIgnoreCase(txtmanv.getText())) {
               txthoten.setText(emp.hoTen);
               txttuoi.setText(""+emp.tuoi);
               txtemail.setText(emp.email);
               txtluong.setText(""+emp.luong);
               
               // thoát khỏi vòng lặp
               break;
           }
       }
    }
    
    public void findByName() {
        // khai báo danh sách kết quả
        ArrayList<Nhanvien> kq_list = new ArrayList<>();
        
        //duyệt qua danh sách list để tìm 
        for( Nhanvien emp :list) {
            if(emp.getHoTen().contains(txthoten.getText())){
                //thêm nhân viên vào danh sách kết quả
                kq_list.add(emp);
            }
        }
        DefaultTableModel model = (DefaultTableModel) tblnhanvien.getModel();
        model.setRowCount(0);
        // dùng for duyệt danh sách sinh viên
        for(Nhanvien s : kq_list) {
            Object[] row = new Object[]{s.ma, s.hoTen, s.tuoi, s.email, s.luong};
            // thêm vào model
            model.addRow(row);
        } 
    }
    public void Update() {
        //xác định vị trí click vào 
        index = tblnhanvien.getSelectedRow();
        // lấy ra nhân viên tại vị trí index trong danh sách nhân viên
        Nhanvien emp = list.get(index);
        // cập nhật thông tin nhân viên
        emp.setHoTen(txthoten.getText());
        emp.setTuoi(Integer.parseInt(txttuoi.getText()));
        emp.setEmail(txtemail.getText());
        emp.setLuong(Integer.parseInt(txtluong.getText()));
    }
     
    public void showRecord() {
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txttuoi = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtluong = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnfind = new javax.swing.JButton();
        btnopen = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblnhanvien = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jclock = new javax.swing.JLabel();
        jlabelRecord = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        jLabel1.setText("MÃ NHÂN VIÊN");

        jLabel2.setText("HỌ VÀ TÊN");

        jLabel3.setText("TUỔI");

        jLabel4.setText("EMAIL");

        jLabel5.setText("LƯƠNG");

        txtmanv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanvActionPerformed(evt);
            }
        });

        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps24346_asm1/Actions-document-new-icon.png"))); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps24346_asm1/Action-file-new-icon.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps24346_asm1/Action-cancel-icon.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnfind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps24346_asm1/search.png"))); // NOI18N
        btnfind.setText("Find");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        btnopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps24346_asm1/open.png"))); // NOI18N
        btnopen.setText("Open");
        btnopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopenActionPerformed(evt);
            }
        });

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps24346_asm1/exit.png"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("<<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        tblnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ));
        tblnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnhanvienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblnhanvien);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 255));
        jLabel6.setText("QUẢN LÝ NHÂN VIÊN");

        jclock.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jclock.setForeground(new java.awt.Color(255, 51, 51));
        jclock.setText("đồng hồ quả lắc");

        jlabelRecord.setText("record");

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps24346_asm1/Action-edit-icon.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txthoten)
                    .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnprev)
                                .addGap(18, 18, 18)
                                .addComponent(btnnext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnlast, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnfind, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnopen))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                        .addComponent(jclock)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(jlabelRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnfind, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnopen)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlast)
                            .addComponent(btnnext)
                            .addComponent(btnprev)
                            .addComponent(btnfirst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlabelRecord)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jclock)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmanvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanvActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (validate_data() == true) {
               addNhanVien();
               fillToTable();
               saveFile();
        }
     
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        txtmanv.setText("");
        txthoten.setText("");
        txttuoi.setText("");
        txtemail.setText("");
        txtluong.setText("");
        
    }//GEN-LAST:event_btnnewActionPerformed

    private void tblnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnhanvienMouseClicked
        // TODO add your handling code here:
         index = tblnhanvien.getSelectedRow();
         showDetails();
    }//GEN-LAST:event_tblnhanvienMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        removeNhanvien();
        // gọi lại hàm hiển thị lên bảng
        fillToTable();
    }//GEN-LAST:event_btndeleteActionPerformed
// 4 nút 
    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        // TODO add your handling code here:
        index = 0;
        tblnhanvien.setRowSelectionInterval(index, index);
        showDetails();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        if(index > 0) {
            index--;
            tblnhanvien.setRowSelectionInterval(index, index);
            showDetails();
        }
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        if(index < list.size() -1) {
            index ++;
            tblnhanvien.setRowSelectionInterval(index, index);
            showDetails();
        }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
            index = list.size()-1;
            tblnhanvien.setRowSelectionInterval(index, index);
            showDetails();
        
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        // TODO add your handling code here:
        if(txtmanv.getText().trim().length() > 0) {
            findByID();
        }
        else if(txthoten.getText().trim().length() > 0) {
            findByName();
        }
        
    }//GEN-LAST:event_btnfindActionPerformed

    private void btnopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopenActionPerformed
        // TODO add your handling code here:
        openFile();
        // hiển thị danh sách list lên bảng
        fillToTable();
    }//GEN-LAST:event_btnopenActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Update();
        fillToTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ASM1_QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASM1_QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASM1_QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASM1_QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASM1_QLNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnopen;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel jclock;
    private javax.swing.JLabel jlabelRecord;
    private javax.swing.JTable tblnhanvien;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txttuoi;
    // End of variables declaration//GEN-END:variables

    private void fillToTable(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

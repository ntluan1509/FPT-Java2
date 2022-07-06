/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_cau2;

//1. nhớ thêm thư viện này
import java.util.*;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author teo
 */
public class frmQuanLySinhVien extends javax.swing.JFrame {
    
    public frmQuanLySinhVien() {
        initComponents();
    }

    //1. khai báo danh sách sinh viên
    ArrayList<Student> list = new ArrayList<>();
    
    //2. hành động thêm sinh viên vào danh sách list
    public void addStudent()
    {
        //2. tạo 1 đối tượng Student
        Student a = new Student();
        //3. gán giá trị từ các controls cho đối tượng
        a.name = txtHoTen.getText();
        a.marks = Double.parseDouble(txtDiem.getText());
        a.major = (String)cboNganh.getSelectedItem();
        
        //4. thêm đối tượng vào danh sách
        list.add(a);
        //5. hiện thị học lưc ra 
        txtHocLuc.setText(a.getGrade());
        //6. và check vào nếu có thưởng
        chkThuong.setSelected(a.isBonus());
        
    }
    
    //2. hàm hiện thị lên bảng
    public void fillToTable()
    {
         //1. Lay model cua bang va xoa sach cac hang
        DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
        model.setRowCount(0);
        
        //2. dùng for duyệt hết danh sách sinh viên list
        for(Student s : list)
        {
            Object[] row = new Object[]{s.name, s.marks, s.major, s.getGrade(), s.isBonus()};
            //3. thêm vào model
            model.addRow(row);
        }
    }
    
    
    int index = 0;
    //3. hiện thị chi tiết thông sinh viên lên các controls
    public void showDetail()
    {
        //1. xác định đang click vào dòng nào của bảng
        index = tblStudents.getSelectedRow();
        //2. lấy sinh viên thứ index ra
        Student s = list.get(index);
        //3. hiện thị thông tin chi tiết của sinh viên lên các controls
        txtHoTen.setText(s.name);
        txtDiem.setText(""+s.marks);
        cboNganh.setSelectedItem(s.major);
        txtHocLuc.setText(s.getGrade());
        chkThuong.setSelected(s.isBonus());
    }
    
    //4. hàm xóa sv
    public void removeStudent()
    {
        //1. xác định đang click vào dòng nào của bảng
        index = tblStudents.getSelectedRow();
        
        //3. xóa sinh viên đang chọn // xóa sinh viên thứ index
        list.remove(index);
    }
    
    public void updateStudent()
    {
        int index = tblStudents.getSelectedRow();
        Student sv = list.get(index);
        
        sv.name = txtHoTen.getText();
        sv.marks = Double.parseDouble(txtDiem.getText());
        sv.major = (String)cboNganh.getSelectedItem();
        txtHocLuc.setText(sv.getGrade());
        chkThuong.setSelected(sv.isBonus());
    }
    public void orderByName()
    {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               return o1.name.compareTo(o2.name);
            }
        };
        Collections.sort(list,com);
    }
    public void orderByMarks()
    {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                Double d1 = o1.marks;
                Double d2 = o2.marks;
               return d1.compareTo(d2);
            }
        };
        Collections.sort(list,com);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        txtHocLuc = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        btnTheoTen = new javax.swing.JButton();
        btnTheoDiem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cboNganh = new javax.swing.JComboBox<>();
        chkThuong = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("HỌ VÀ TÊN");

        jLabel3.setText("ĐIỂM");

        jLabel4.setText("NGÀNH");

        jLabel5.setText("HỌC LỰC");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab3_cau2/Actions-document-new-icon.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab3_cau2/Action-cancel-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab3_cau2/Actions-document-edit-icon.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab3_cau2/Action-file-new-icon.png"))); // NOI18N
        btnNhapMoi.setText("Nhập Mới");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        btnTheoTen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab3_cau2/Action-reload-icon.png"))); // NOI18N
        btnTheoTen.setText("Sắp xếp theo tên");
        btnTheoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoTenActionPerformed(evt);
            }
        });

        btnTheoDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab3_cau2/Actions-view-refresh-icon.png"))); // NOI18N
        btnTheoDiem.setText("Sắp xếp theo điểm");
        btnTheoDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheoDiemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("QUẢN LÝ SINH VIÊN");

        cboNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ỨNG DỤNG PHẦN MỀM", "THIẾT KẾ WEB", " " }));

        chkThuong.setText("Có phần thưởng ?");

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "HỌ TÊN", "ĐIỂM", "NGÀNH", "HỌC LỰC", "THƯỞNG"
            }
        ));
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStudents);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnTheoDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDiem, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHocLuc, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHoTen)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCapNhat)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnNhapMoi)))
                            .addComponent(cboNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkThuong)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel6)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHocLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cboNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(chkThuong)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa)
                        .addComponent(btnNhapMoi)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTheoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTheoDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        //1. xóa trắng các controls
        txtHoTen.setText("");
        txtDiem.setText("");
        cboNganh.setSelectedIndex(0); // cho mặc định chọn ngành đầu tiên
        txtHocLuc.setText("");
        chkThuong.setSelected(false);
        //2. con nháy focus ở txtHoTen
        txtHoTen.requestFocus();
    }//GEN-LAST:event_btnNhapMoiActionPerformed
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //1. gọi hàm thêm
        addStudent();
        //2. gọi hàm hiện thị lên bảng
        fillToTable();
    }//GEN-LAST:event_btnThemActionPerformed
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        //1. gọi hàm xóa
        removeStudent();
        //2. gọi hàm hiện thị danh sách sinh viên
        fillToTable();
    }//GEN-LAST:event_btnXoaActionPerformed
    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
      
        
        updateStudent();
        fillToTable();
    }//GEN-LAST:event_btnCapNhatActionPerformed
    private void btnTheoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoTenActionPerformed

    orderByName();
    fillToTable();
    }//GEN-LAST:event_btnTheoTenActionPerformed
    private void btnTheoDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheoDiemActionPerformed
        orderByMarks();
        fillToTable();
    }//GEN-LAST:event_btnTheoDiemActionPerformed

    
  
    
    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        // TODO add your handling code here:
        
        //1. gọi hàm hiện thị chi tiết
        showDetail();
    }//GEN-LAST:event_tblStudentsMouseClicked

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
            java.util.logging.Logger.getLogger(frmQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLySinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTheoDiem;
    private javax.swing.JButton btnTheoTen;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboNganh;
    private javax.swing.JCheckBox chkThuong;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtHocLuc;
    // End of variables declaration//GEN-END:variables

    
}


import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luan
 */
public class jframeNHANVIEN extends javax.swing.JFrame {

    /**
     * Creates new form jframeNHANVIEN
     */
    public jframeNHANVIEN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHOTEN = new javax.swing.JTextField();
        txtNGAYSINH = new javax.swing.JTextField();
        txtLUONG = new javax.swing.JTextField();
        btnKIEMTRA = new javax.swing.JButton();
        btnstart = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Họ tên: ");

        jLabel2.setText("Ngày sinh:");

        jLabel3.setText("Lương:");

        btnKIEMTRA.setText("KIEM TRA");
        btnKIEMTRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKIEMTRAActionPerformed(evt);
            }
        });

        btnstart.setText("|<");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        btnprev.setText("<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnstart)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnKIEMTRA)
                            .addComponent(txtHOTEN, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtNGAYSINH)
                            .addComponent(txtLUONG)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnprev)
                        .addGap(18, 18, 18)
                        .addComponent(btnnext)
                        .addGap(18, 18, 18)
                        .addComponent(btnlast)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNGAYSINH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLUONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnKIEMTRA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnstart)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKIEMTRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKIEMTRAActionPerformed
        if(txtHOTEN.getText().trim().length() == 0) {
            // xuất ra câu chửi
            JOptionPane.showMessageDialog(this, "Họ tên không được rỗng");
            // set màu nền vàng
            txtHOTEN.setBackground(Color.YELLOW);
            // con nháy nằm tại vị trí txtHOTEN
            txtHOTEN.requestFocus();
            return;// kết thúc ngay lập tức.. không làm các câu lệnh phía sau
        }
        
         if(txtNGAYSINH.getText().trim().length() == 0) {
            // xuất ra câu chửi
            JOptionPane.showMessageDialog(this, "Ngày sinh không được rỗng");
            // set màu nền vàng
            txtNGAYSINH.setBackground(Color.YELLOW);
            // con nháy nằm tại vị trí txtHOTEN
            txtNGAYSINH.requestFocus();
            return;// kết thúc ngay lập tức.. không làm các câu lệnh phía sau
        }
         
          if(txtLUONG.getText().trim().length() == 0) {
            // xuất ra câu chửi
            JOptionPane.showMessageDialog(this, "LƯƠNG không được rỗng");
            // set màu nền vàng
            txtLUONG.setBackground(Color.YELLOW);
            // con nháy nằm tại vị trí txtHOTEN
            txtLUONG.requestFocus();
            return;// kết thúc ngay lập tức.. không làm các câu lệnh phía sau
        }
          
         // kiểm tra định dạng ngày
         try {
            // Khai báo một đối tượng của lớp simpaldateformat
             SimpleDateFormat formatter = new SimpleDateFormat();
             //định dạng ngày
             formatter.applyPattern("dd-MM-yyyy");
             Date ngaysinh = formatter.parse(txtNGAYSINH.getText());
        } catch (Exception e) {
             
            // xuất ra câu chửi
            JOptionPane.showMessageDialog(this, "Ngày sinh không đúng định dạng");
            // set màu nền vàng
            txtNGAYSINH.setBackground(Color.YELLOW);
            // con nháy nằm tại vị trí txtHOTEN
            txtNGAYSINH.requestFocus();
            return;// kết thúc ngay lập tức.. không làm các câu lệnh phía sau   
        }
       
         
         try {
            int luong = Integer.parseInt(txtLUONG.getText());
           
        } catch (Exception e) {
            
            // xuất ra câu chửi
            JOptionPane.showMessageDialog(this, "LƯƠNG phải là số");
            // set màu nền vàng
            txtLUONG.setBackground(Color.YELLOW);
            // con nháy nằm tại vị trí txtHOTEN
            txtLUONG.requestFocus();
            return;// kết thúc ngay lập tức.. không làm các câu lệnh phía sau
       
        }
         
         JOptionPane.showMessageDialog(this, "Nhập giá trị hợp lệ ");
    }//GEN-LAST:event_btnKIEMTRAActionPerformed

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnstartActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlastActionPerformed

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
            java.util.logging.Logger.getLogger(jframeNHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframeNHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframeNHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframeNHANVIEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframeNHANVIEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKIEMTRA;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnstart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtHOTEN;
    private javax.swing.JTextField txtLUONG;
    private javax.swing.JTextField txtNGAYSINH;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qldb;
import dbconnect.dbconnect;
import java.awt.Color;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import javax.imageio.ImageIO;




/**
 *
 * @author admin
 */

public class Profile extends javax.swing.JFrame {
private String username;


    public Profile(String username) {
        initComponents();
        this.username = username;
        loadProfileData(username);
        
        }
    
    
    @Override
public void setVisible(boolean visible) {
    super.setVisible(visible);
    if (visible) {
        loadProfileData(username); // 
    }
}
  

    public void loadProfileData(String username) {
        
    String sql = "SELECT name, age, avatar, phone, gender, email FROM account WHERE username=?";
    try {
        Connection con = dbconnect.connect();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            String name = rs.getString("name");
            int age = rs.getInt("age");
            int phone = rs.getInt("phone");
            String gender = rs.getString("gender");
            String email = rs.getString("email");
            byte[] avatarBytes = rs.getBytes("avatar");

            jTextFieldName.setText(name);
            jTextFieldAge.setText(String.valueOf(age));
            jTextFieldEmail.setText(email);
            jTextFieldPhone.setText(String.valueOf(phone));
            jTextFieldGender.setText(gender);
            
            if (avatarBytes != null) {
                try {
                    ImageIcon avatarIcon = new ImageIcon(avatarBytes);
                    Image image = avatarIcon.getImage();
                    Image scaledImage = image.getScaledInstance(jLabelAvatar.getWidth(), jLabelAvatar.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon scaledIcon = new ImageIcon(scaledImage);
                    jLabelAvatar.setIcon(scaledIcon);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
          
        }
        con.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelAvatar = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        miniB = new javax.swing.JButton();
        closeB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 20));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Vector.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 40, -1));

        jLabelAvatar.setBackground(new Color(0, 0, 0));
        getContentPane().add(jLabelAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 260, 260));

        jTextFieldName.setBackground(new Color(0,0,0,0));
        jTextFieldName.setFont(new java.awt.Font("Be Vietnam Pro", 0, 24)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldName.setBorder(null);
        jTextFieldName.setCaretColor(new Color(0, 0, 0, 0));
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 250, 30));

        jTextFieldAge.setBackground(new Color(0, 0, 0, 0));
        jTextFieldAge.setFont(new java.awt.Font("Be Vietnam Pro", 0, 18)); // NOI18N
        jTextFieldAge.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldAge.setBorder(null);
        jTextFieldAge.setCaretColor(new Color(0, 0, 0, 0));
        getContentPane().add(jTextFieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 160, 30));

        jTextFieldGender.setBackground(new Color(0, 0, 0, 0));
        jTextFieldGender.setFont(new java.awt.Font("Be Vietnam Pro", 0, 18)); // NOI18N
        jTextFieldGender.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldGender.setBorder(null);
        jTextFieldGender.setCaretColor(new Color(0, 0, 0, 0));
        getContentPane().add(jTextFieldGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 160, 30));

        jTextFieldPhone.setBackground(new Color(0, 0, 0, 0));
        jTextFieldPhone.setFont(new java.awt.Font("Be Vietnam Pro", 0, 18)); // NOI18N
        jTextFieldPhone.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldPhone.setBorder(null);
        jTextFieldPhone.setCaretColor(new Color(0, 0, 0, 0));
        jTextFieldPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 120, 30));

        jTextFieldEmail.setBackground(new Color(0, 0, 0, 0));
        jTextFieldEmail.setFont(new java.awt.Font("Be Vietnam Pro", 0, 18)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.setCaretColor(new Color(0, 0, 0, 0));
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 260, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Profile.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        miniB.setText("jButton3");
        miniB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                miniBMousePressed(evt);
            }
        });
        getContentPane().add(miniB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 30, 40));

        closeB.setText("jButton2");
        closeB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeBMousePressed(evt);
            }
        });
        closeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBActionPerformed(evt);
            }
        });
        getContentPane().add(closeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 30, 40));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1070, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPhoneActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        home ra = new home ();
        ra.setVisible(true);
        this.dispose();
             
    }//GEN-LAST:event_jButton1ActionPerformed
    int xy, xx;
    private void closeBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeBMousePressed

    private void miniBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniBMousePressed
        // TODO add your handling code here:
         Profile.this.setState(Frame.ICONIFIED);
     
    }//GEN-LAST:event_miniBMousePressed

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeBActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    String username = "admin"; 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Profile(username).setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAvatar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JButton miniB;
    // End of variables declaration//GEN-END:variables
}

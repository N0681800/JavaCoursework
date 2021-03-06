/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemssoftwarecoursework;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author Bradley Evans
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public Register() {
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

        RegisterButton = new javax.swing.JButton();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        GenderLabel = new javax.swing.JLabel();
        ProfilePictureLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PPBrowseButton = new javax.swing.JButton();
        POBLabel = new javax.swing.JLabel();
        PORLabel = new javax.swing.JLabel();
        CancelLabel = new javax.swing.JLabel();
        FirstNameTxtField = new javax.swing.JTextField();
        LastNameTxtField = new javax.swing.JTextField();
        GenderDropDownBox = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPasswordTxtField = new javax.swing.JPasswordField();
        PoBTxtField = new javax.swing.JTextField();
        PoRTxtField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        ProfilePictureShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SweetSweetMusic - New Registration");

        RegisterButton.setText("Register");

        UsernameLabel.setText("Username");

        PasswordLabel.setText("Password");

        FirstNameLabel.setText("First Name");

        LastNameLabel.setText("Last Name");

        GenderLabel.setText("Gender");

        ProfilePictureLabel.setText("Profile Picture");

        DOBLabel.setText("Date of Birth");

        UsernameTextField.setText("Enter Username");
        UsernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameTextFieldMouseClicked(evt);
            }
        });
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });

        PPBrowseButton.setText("...");
        PPBrowseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPBrowseButtonActionPerformed(evt);
            }
        });

        POBLabel.setText("Place of Birth");

        PORLabel.setText("Place of Residence");

        CancelLabel.setText("Cancel");
        CancelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelLabelMouseExited(evt);
            }
        });

        FirstNameTxtField.setText("Enter First Name");
        FirstNameTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstNameTxtFieldMouseClicked(evt);
            }
        });
        FirstNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTxtFieldActionPerformed(evt);
            }
        });

        LastNameTxtField.setText("Enter Last Name");
        LastNameTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LastNameTxtFieldMouseClicked(evt);
            }
        });
        LastNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTxtFieldActionPerformed(evt);
            }
        });

        GenderDropDownBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        GenderDropDownBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderDropDownBoxActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jPasswordTxtField.setText("EnterPassword");
        jPasswordTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordTxtFieldMouseClicked(evt);
            }
        });
        jPasswordTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordTxtFieldActionPerformed(evt);
            }
        });

        PoBTxtField.setText("Where were you born?");
        PoBTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PoBTxtFieldMouseClicked(evt);
            }
        });
        PoBTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoBTxtFieldActionPerformed(evt);
            }
        });

        PoRTxtField.setText("Where do you live?");
        PoRTxtField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PoRTxtFieldMouseClicked(evt);
            }
        });
        PoRTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PoRTxtFieldActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PORLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GenderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DOBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(POBLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PoBTxtField)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GenderDropDownBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LastNameTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FirstNameTxtField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jPasswordTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PoRTxtField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProfilePictureLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PPBrowseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProfilePictureShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CancelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPasswordTxtField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GenderDropDownBox)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addComponent(GenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(POBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PoBTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProfilePictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PPBrowseButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProfilePictureShow, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PORLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PoRTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelLabel)
                    .addComponent(RegisterButton))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void UsernameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameTextFieldMouseClicked
        // TODO add your handling code here:        
        UsernameTextField.setText("");
    }//GEN-LAST:event_UsernameTextFieldMouseClicked

    private void CancelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseEntered
        // TODO add your handling code here:
        CancelLabel.setForeground(new java.awt.Color(0, 0, 255));
    }//GEN-LAST:event_CancelLabelMouseEntered

    private void CancelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLabelMouseExited
        // TODO add your handling code here:
        CancelLabel.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_CancelLabelMouseExited

    private void FirstNameTxtFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameTxtFieldMouseClicked
        // TODO add your handling code here:
        FirstNameTxtField.setText("");
    }//GEN-LAST:event_FirstNameTxtFieldMouseClicked

    private void FirstNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTxtFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FirstNameTxtFieldActionPerformed

    private void LastNameTxtFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastNameTxtFieldMouseClicked
        // TODO add your handling code here:
        LastNameTxtField.setText("");
    }//GEN-LAST:event_LastNameTxtFieldMouseClicked

    private void LastNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTxtFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LastNameTxtFieldActionPerformed

    private void GenderDropDownBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderDropDownBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderDropDownBoxActionPerformed

    private void jPasswordTxtFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordTxtFieldMouseClicked
        jPasswordTxtField.setText("");
    }//GEN-LAST:event_jPasswordTxtFieldMouseClicked

    private void jPasswordTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordTxtFieldActionPerformed

    private void PoBTxtFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoBTxtFieldMouseClicked
        // TODO add your handling code here:
        PoBTxtField.setText("");
    }//GEN-LAST:event_PoBTxtFieldMouseClicked

    private void PoBTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoBTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoBTxtFieldActionPerformed

    private void PoRTxtFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PoRTxtFieldMouseClicked
        // TODO add your handling code here:
        PoRTxtField.setText("");
    }//GEN-LAST:event_PoRTxtFieldMouseClicked

    private void PoRTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PoRTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PoRTxtFieldActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void PPBrowseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPBrowseButtonActionPerformed
        // TODO add your handling code here:
        //locating the image
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String filelocation=f.getAbsolutePath();
        //displaying the image location in the text field
        jTextField1.setText(filelocation);
        // getting the image
        BufferedImage pp = null;
        try
        {
            pp = ImageIO.read(new File(filelocation));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        //resizing the image
        Image pp2 = pp.getScaledInstance(ProfilePictureShow.getWidth(), ProfilePictureShow.getHeight(), Image.SCALE_SMOOTH);        
        // displaying image in the location
        ImageIcon icon = new ImageIcon(pp2);
        ProfilePictureShow.setIcon(icon);
        ProfilePictureShow.setText(null);
        
    }//GEN-LAST:event_PPBrowseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CancelLabel;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameTxtField;
    private javax.swing.JComboBox<String> GenderDropDownBox;
    private javax.swing.JLabel GenderLabel;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameTxtField;
    private javax.swing.JLabel POBLabel;
    private javax.swing.JLabel PORLabel;
    private javax.swing.JButton PPBrowseButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PoBTxtField;
    private javax.swing.JTextField PoRTxtField;
    private javax.swing.JLabel ProfilePictureLabel;
    private javax.swing.JLabel ProfilePictureShow;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPasswordField jPasswordTxtField;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

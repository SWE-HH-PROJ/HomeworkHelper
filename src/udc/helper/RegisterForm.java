/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package udc.helper;

import java.awt.Color;
import java.awt.Desktop;
import java.io.FileWriter;
import java.net.URL;
import javax.swing.JFrame;

/**
 *
 * @author carlos
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int xMouse;
    int yMouse;

    public RegisterForm() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myOverlay = new udc.helper.Overlay();
        exit = new javax.swing.JPanel();
        xButton = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        min = new javax.swing.JPanel();
        minButton = new javax.swing.JLabel();
        appNameLeft = new javax.swing.JLabel();
        appNameRight = new javax.swing.JLabel();
        signUpPanel = new javax.swing.JPanel();
        passField = new javax.swing.JPasswordField();
        schoolLabel = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        firstLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        iconBanner = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        schoolField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        rePassField = new javax.swing.JPasswordField();
        rePassLabel = new javax.swing.JLabel();
        textTerms2 = new javax.swing.JLabel();
        textTerms1 = new javax.swing.JLabel();
        textTerms3 = new javax.swing.JLabel();
        logoLeft = new javax.swing.JLabel();
        logoRight = new javax.swing.JLabel();
        eclipseLeft = new javax.swing.JLabel();
        eclipseRight = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        myOverlay.setMaximumSize(new java.awt.Dimension(920, 520));
        myOverlay.setMinimumSize(new java.awt.Dimension(920, 520));
        myOverlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setBackground(new java.awt.Color(255, 255, 255));

        xButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        xButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xButton.setText("X");
        xButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(xButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        myOverlay.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 40, 40));

        bar.setBackground(new java.awt.Color(255, 255, 255));
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setPreferredSize(new java.awt.Dimension(40, 40));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });

        minButton.setBackground(new java.awt.Color(255, 255, 255));
        minButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        minButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minButton.setText("-");

        javax.swing.GroupLayout minLayout = new javax.swing.GroupLayout(min);
        min.setLayout(minLayout);
        minLayout.setHorizontalGroup(
            minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        minLayout.setVerticalGroup(
            minLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        appNameLeft.setBackground(new java.awt.Color(255, 255, 255));
        appNameLeft.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        appNameLeft.setForeground(new java.awt.Color(145, 234, 228));
        appNameLeft.setText("Homework");
        appNameLeft.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        appNameRight.setBackground(new java.awt.Color(255, 255, 255));
        appNameRight.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        appNameRight.setForeground(new java.awt.Color(122, 137, 254));
        appNameRight.setText("Helper");
        appNameRight.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(appNameLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appNameRight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appNameLeft)
                    .addComponent(appNameRight))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        myOverlay.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        signUpPanel.setBackground(new java.awt.Color(240,248,255));
        signUpPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        signUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passField.setBackground(new java.awt.Color(73, 80, 87));
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        signUpPanel.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 360, 30));

        schoolLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        schoolLabel.setForeground(new java.awt.Color(73, 80, 87));
        schoolLabel.setText("School");
        signUpPanel.add(schoolLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 50));

        signUpButton.setBackground(new java.awt.Color(85, 110, 230));
        signUpButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpButtonMouseExited(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        signUpPanel.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 360, 30));

        firstLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        firstLabel.setForeground(new java.awt.Color(73, 80, 87));
        firstLabel.setText("First Name");
        signUpPanel.add(firstLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 50));

        nameField.setForeground(new java.awt.Color(73, 80, 87));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        signUpPanel.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 30));

        iconBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/regIcon.png"))); // NOI18N
        signUpPanel.add(iconBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 70, 90));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/New_Card_Header.png"))); // NOI18N
        banner.setText("header");
        signUpPanel.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 400, -1));

        lastNameField.setForeground(new java.awt.Color(73, 80, 87));
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        signUpPanel.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 360, 30));

        schoolField.setForeground(new java.awt.Color(73, 80, 87));
        schoolField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolFieldActionPerformed(evt);
            }
        });
        signUpPanel.add(schoolField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 360, 30));

        emailField.setForeground(new java.awt.Color(73, 80, 87));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        signUpPanel.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 360, 30));

        lastNameLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(73, 80, 87));
        lastNameLabel.setText("Last Name");
        signUpPanel.add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 50));

        emailLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(73, 80, 87));
        emailLabel.setText("E-mail");
        signUpPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 50));

        passLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        passLabel.setForeground(new java.awt.Color(73, 80, 87));
        passLabel.setText("Password");
        signUpPanel.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 100, 50));

        rePassField.setBackground(new java.awt.Color(73, 80, 87));
        rePassField.setForeground(new java.awt.Color(255, 255, 255));
        rePassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePassFieldActionPerformed(evt);
            }
        });
        signUpPanel.add(rePassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 360, 30));

        rePassLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rePassLabel.setForeground(new java.awt.Color(73, 80, 87));
        rePassLabel.setText("Confirm Password");
        signUpPanel.add(rePassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 120, 50));

        textTerms2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textTerms2.setForeground(new java.awt.Color(73, 80, 87));
        textTerms2.setText("acknowledge the ");
        signUpPanel.add(textTerms2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 110, 30));

        textTerms1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textTerms1.setForeground(new java.awt.Color(73, 80, 87));
        textTerms1.setText("By clicking Sign Up, you are indicating that you have read and ");
        signUpPanel.add(textTerms1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 340, 30));

        textTerms3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        textTerms3.setForeground(new java.awt.Color(0, 153, 204));
        textTerms3.setText("Terms of Service ");
        textTerms3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textTerms3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textTerms3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textTerms3MouseExited(evt);
            }
        });
        signUpPanel.add(textTerms3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 600, 100, 30));

        myOverlay.add(signUpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 400, 640));

        logoLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/HH_icon_small.png"))); // NOI18N
        myOverlay.add(logoLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        logoRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/HH_icon_small.png"))); // NOI18N
        myOverlay.add(logoRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, -1, -1));

        eclipseLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/EllipseRegLeft.png"))); // NOI18N
        myOverlay.add(eclipseLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 290, -1));

        eclipseRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/udc/helper/icons/EllipseRegRight.png"))); // NOI18N
        myOverlay.add(eclipseRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myOverlay, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myOverlay, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xButtonMouseClicked

    private void xButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseEntered
        exit.setBackground(Color.decode("#ff6961"));
    }//GEN-LAST:event_xButtonMouseEntered

    private void xButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xButtonMouseExited
        exit.setBackground(Color.white);
    }//GEN-LAST:event_xButtonMouseExited

    private void minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseClicked
        this.setExtendedState(Main.ICONIFIED);
    }//GEN-LAST:event_minMouseClicked

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
        min.setBackground(Color.decode("#F2F2F2"));
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
        min.setBackground(Color.white);
    }//GEN-LAST:event_minMouseExited

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x;
        int y;
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barMouseDragged

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        String user = "";
        String last = "";
        String email = "";
        String school = "";
        String pass = "";
        String repass = "";
        user = nameField.getText();
        last = lastNameField.getText();
        email = emailField.getText();
        school = schoolField.getText();
        pass = passField.getText();
        repass = rePassField.getText();
        writeFile(user, last, email, school, pass);
        System.err.println(user + "\n" + pass);
        
        LogIn newLog = new LogIn();
        newLog.setVisible(true);
        newLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void signUpButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseEntered
        signUpButton.setBackground(Color.decode("#8899ed"));
    }//GEN-LAST:event_signUpButtonMouseEntered

    private void signUpButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseExited
        signUpButton.setBackground(Color.decode("#556EE6"));        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButtonMouseExited

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void schoolFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void rePassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePassFieldActionPerformed

    private void textTerms3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTerms3MouseClicked
        openWebpage("http://fitnik.tech/public/docs/terms.pdf");
    }//GEN-LAST:event_textTerms3MouseClicked

    private void textTerms3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTerms3MouseEntered
        textTerms3.setForeground(Color.decode("#003d52"));
    }//GEN-LAST:event_textTerms3MouseEntered

    private void textTerms3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTerms3MouseExited
        textTerms3.setForeground(Color.decode("#0099cc"));
    }//GEN-LAST:event_textTerms3MouseExited
    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void writeFile(String user, String last, String email, String school, String pass) {
        FileWriter newFile = null;
        try {
            newFile = new FileWriter("user/user.csv");
            newFile.append(user);
            newFile.append(",");
            newFile.append(last);
            newFile.append(",");
            newFile.append(email);
            newFile.append(",");
            newFile.append(school);
            newFile.append(",");
            newFile.append(pass);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                newFile.flush();
                newFile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appNameLeft;
    private javax.swing.JLabel appNameRight;
    private javax.swing.JLabel banner;
    private javax.swing.JPanel bar;
    private javax.swing.JLabel eclipseLeft;
    private javax.swing.JLabel eclipseRight;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel iconBanner;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel logoLeft;
    private javax.swing.JLabel logoRight;
    private javax.swing.JPanel min;
    private javax.swing.JLabel minButton;
    private udc.helper.Overlay myOverlay;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField rePassField;
    private javax.swing.JLabel rePassLabel;
    private javax.swing.JTextField schoolField;
    private javax.swing.JLabel schoolLabel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JLabel textTerms1;
    private javax.swing.JLabel textTerms2;
    private javax.swing.JLabel textTerms3;
    private javax.swing.JLabel xButton;
    // End of variables declaration//GEN-END:variables

}
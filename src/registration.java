import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class registration  extends javax.swing.JFrame {

    // Database Connection Variables
    Connection con;
    Statement st;
    private static final String DBUrl = "jdbc:mysql://localhost:3306/Velasquez_DB";
    private static final String DBUsername = "root";
    private static final String DBPassword = "";

    public registration() {
        initComponents(); 
        try {
            Connection(); 
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Connection Method
    public void Connection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DBUrl, DBUsername, DBPassword);
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // ... generated code ...    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        REG_USERNAME = new javax.swing.JTextField();
        REG_PASSWORD = new javax.swing.JPasswordField();
        jButtonSubmit = new javax.swing.JButton();
        Incase = new javax.swing.JLabel();
        jButtonLoginLink = new javax.swing.JButton();
        chkShowPass = new javax.swing.JToggleButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Username.setText("USERNAME:");

        Password.setText("PASSWORD:");

        jButtonSubmit.setText("SUBMIT");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        Incase.setText("Already have an account?");

        jButtonLoginLink.setText("LOGIN");
        jButtonLoginLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginLinkActionPerformed(evt);
            }
        });

        chkShowPass.setText("Show");
        chkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Password)
                    .addComponent(Username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Incase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLoginLink))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(REG_USERNAME)
                            .addComponent(REG_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkShowPass)))
                .addGap(0, 434, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REG_USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REG_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password)
                    .addComponent(chkShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLoginLink)
                    .addComponent(Incase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 615, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginLinkActionPerformed
   
    login loginPage = new login();
    loginPage.setVisible(true);
    loginPage.pack();
    loginPage.setLocationRelativeTo(null);
    this.dispose();
    
    }//GEN-LAST:event_jButtonLoginLinkActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
    String username = REG_USERNAME.getText();
    String password = new String(REG_PASSWORD.getPassword());

    if ("".equals(username)) {
        JOptionPane.showMessageDialog(this, "REQUIRED TO INPUT USERNAME");
    } else if ("".equals(password)) {
        JOptionPane.showMessageDialog(this, "REQUIRED TO INPUT PASSWORD");
    } else {
        String queryRegister = "INSERT INTO account (username, password) VALUES ('" + username + "', '" + password + "')";
        try {
            st.execute(queryRegister);
            REG_USERNAME.setText("");
            REG_PASSWORD.setText("");
            JOptionPane.showMessageDialog(this, "REGISTRATION SUCCESSFUL");
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void chkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassActionPerformed
        if(chkShowPass.isSelected()){
            REG_PASSWORD.setEchoChar((char)0); 
        } else {
            REG_PASSWORD.setEchoChar('*'); 
        }
    }//GEN-LAST:event_chkShowPassActionPerformed
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new registration().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Incase;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField REG_PASSWORD;
    private javax.swing.JTextField REG_USERNAME;
    private javax.swing.JLabel Username;
    private javax.swing.JToggleButton chkShowPass;
    private javax.swing.JButton jButtonLoginLink;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}

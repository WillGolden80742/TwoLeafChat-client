package View;

import ConnectionFactory.Server;
import Model.bean.Authenticated;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import util.Communication;

/**
 *
 * @author William
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     *
     * @throws java.io.IOException
     * @throws java.lang.ClassNotFoundException
     */
    public Login() throws IOException, ClassNotFoundException {
        initComponents();
        setIconTop();
        setLocation(500, 250);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logar = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        nickName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        messageLogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        singUp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        logar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logar.setText("LOGAR");
        logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });

        nickName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nickNameKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("@");
        jLabel1.setToolTipText("nickname");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/chat.png"))); // NOI18N

        messageLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        messageLogin.setForeground(new java.awt.Color(255, 51, 0));
        messageLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN");

        singUp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        singUp.setText("CADASTRAR");
        singUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singUpActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/passwordIcon.png"))); // NOI18N
        jLabel3.setToolTipText("senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(messageLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nickName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(singUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nickName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(singUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        if (evt.getKeyCode() == 10) {
            login();
        }
        messageLogin.setText("");
    }//GEN-LAST:event_passwordKeyReleased

    private void nickNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nickNameKeyReleased
        messageLogin.setText("");
        nickName.setText(nickName.getText().replaceAll("[^A-Za-z0-9_]", ""));
    }//GEN-LAST:event_nickNameKeyReleased

    private void singUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singUpActionPerformed
        SingUP sUP = new SingUP();
        sUP.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_singUpActionPerformed

    private void logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarActionPerformed
        login();
        setMessageLoginColor(new Color(255, 51, 0));
    }//GEN-LAST:event_logarActionPerformed

    public static String getHashMd5(String value) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        BigInteger hash = new BigInteger(1, md.digest(value.getBytes()));
        return hash.toString(16);
    }

    public void setMessageLogin(String value) {
        messageLogin.setText(value);
    }

    public void setMessageLoginColor(Color value) {
        messageLogin.setForeground(value);
    }

    private void login() {
        Server server;
        String replyLogin;
        String hashPassword;

        File myObj = new File("server.ini");
        Scanner myReader;
        String host = "";
        int port = 0;
        try {
            myReader = new Scanner(myObj);
            int cont = 0;
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                if (cont == 0) {
                    data = data.replaceAll(" ", "").split(":")[1];
                    host = data;
                } else if (cont == 1) {
                    data = data.replaceAll(" ", "").split(":")[1];
                    port = Integer.parseInt(data);
                }
                cont++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        server = new Server(host, port);
        Communication message = new Communication("LOGIN");
        hashPassword = getHashMd5(nickName.getText() + password.getText());
        message.setParam("nickName", nickName.getText());
        message.setParam("password", hashPassword);
        replyLogin = (String) server.outPut_inPut(message).getParam("LOGINREPLY");
        if (replyLogin.equals("OK")) {
            Authenticated auth = new Authenticated();
            auth.setLogin(nickName.getText());
            new Chat().setVisible(true);
            setVisible(false);
        } else {
            messageLogin.setText(replyLogin);
        }
    }

    private void setIconTop() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/chat.png")));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logar;
    private javax.swing.JLabel messageLogin;
    private javax.swing.JTextField nickName;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton singUp;
    // End of variables declaration//GEN-END:variables
}

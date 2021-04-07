/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ConnectionFactory.Server;
import Model.bean.Authenticated;
import Model.bean.Contact;
import Model.bean.ProfilePic;
import Model.bean.TreatFiles;
import Threads.SaveProfileImage;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import util.Communication;

/**
 *
 * @author William
 */
public class NewContact extends javax.swing.JFrame {

    private final TreatFiles treatFile = new TreatFiles();
    private Contact contact = new Contact();
    private final Authenticated Authenticated = new Authenticated();
    private final String nickName;
    private boolean emptyUser = true;

    public NewContact() {
        this.nickName = Authenticated.getLogin();
        initComponents();
        setDefaultBorder(searchNickName);
        setIconTop();
    }

    private void setDefaultBorder(JTextField label) {
        label.setBorder(BorderFactory.createCompoundBorder(
                label.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profilePicLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        nickNameLabel = new javax.swing.JLabel();
        searchNickName = new javax.swing.JTextField();
        addCotact = new javax.swing.JLabel();
        search = new javax.swing.JLabel();

        setTitle("Adicionar contato");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        profilePicLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilePicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileLarge.png"))); // NOI18N
        profilePicLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome : ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nick Name : ");

        nomeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        nickNameLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nickNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        searchNickName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        searchNickName.setToolTipText("Pesquise por nick name");
        searchNickName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        searchNickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchNickNameKeyReleased(evt);
            }
        });

        addCotact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddCLient.png"))); // NOI18N
        addCotact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCotactMouseClicked(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addCotact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nickNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profilePicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(searchNickName))
                .addGap(10, 10, 10)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(profilePicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addCotact, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nickNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchNickName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        if (checkNickName() == 1) {
            searchContact();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário inexistente");
        }
    }//GEN-LAST:event_searchMouseClicked

    private void addCotactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCotactMouseClicked
        if (checkNickName() == 1) {
            Chat chat = new Chat();
            if (checkContact() == 0 && !nickName.equals(searchNickName.getText())) {
                searchContact();
                chat.addContact(contact);
                saveProfilesPic();

            }
            chat.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário inexistente");
        }
    }//GEN-LAST:event_addCotactMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Chat chat = new Chat();
        chat.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void searchNickNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchNickNameKeyReleased
        if (evt.getKeyCode() == 10) {
            if (emptyUser) {
                Chat chat = new Chat();
                if (checkNickName() == 1) {
                    if (checkContact() == 0 && !nickName.equals(searchNickName.getText())) {
                        searchContact();
                        chat.addContact(contact);
                        saveProfilesPic();
                    }
                    chat.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário inexistente");
                    emptyUser = false;
                }
            } else {
                emptyUser = true;
            }
        }
    }//GEN-LAST:event_searchNickNameKeyReleased

    private void saveProfilesPic() {
        SaveProfileImage sPI = new SaveProfileImage(contact.getNickName(), 200, "Large");
        Thread t = new Thread(sPI);
        t.start();
        SaveProfileImage sPI1 = new SaveProfileImage(contact.getNickName());
        Thread t1 = new Thread(sPI1);
        t1.start();
    }

    private void searchContact() {
        Server server;
        server = new Server();
        Communication message = new Communication("SEARCHCONTACT");
        message.setParam("nickName", searchNickName.getText());
        Contact c = (Contact) server.outPut_inPut(message).getParam("SEARCHCONTACTREPLY");
        if (c != null) {
            nomeLabel.setText(" " + c.getNome());
            nickNameLabel.setText(" @" + c.getNickName());
            this.contact = c;
        } else {
            nomeLabel.setText("");
            nickNameLabel.setText("");
        }
        setProfilePic();
    }

    private int checkContact() {
        int i;
        Server server;
        server = new Server();
        Communication message = new Communication("CHECKCONTACT");
        message.setParam("nickName", nickName);
        message.setParam("contactNickName", searchNickName.getText());
        i = (int) server.outPut_inPut(message).getParam("CHECKCONTACTREPLY");
        return i;
    }

    private int checkNickName() {
        int i;
        Server server;
        server = new Server();
        Communication message = new Communication("CHECKCLIENT");
        message.setParam("nickName", searchNickName.getText());
        i = (int) server.outPut_inPut(message).getParam("CHECKCLIENTREPLY");
        return i;
    }

    private void setProfilePic() {
        ProfilePic profilepic;
        Server server;
        try {
            server = new Server();
            Communication communication = new Communication("PROFILEIMAGE");
            communication.setParam("nickName", searchNickName.getText());
            communication = server.outPut_inPut(communication);
            profilepic = (ProfilePic) communication.getParam("PROFILEIMAGEREPLY");
            InputStream is = new ByteArrayInputStream(profilepic.getPicture());
            BufferedImage bi = ImageIO.read(is);
            bi = treatFile.resizeImage(bi, 200);
            profilePicLabel.setIcon(new ImageIcon(bi));
        } catch (NullPointerException | IOException ex) {
            profilePicLabel.setIcon(new ImageIcon(getClass().getResource("/Images/profileLarge.png")));
        }
    }

    private void setIconTop() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/AddCLient.png")));
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCotact;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nickNameLabel;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel profilePicLabel;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchNickName;
    // End of variables declaration//GEN-END:variables
}

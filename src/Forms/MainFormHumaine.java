package Forms;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import controleurs.ApprobationControleur;
import javax.swing.ImageIcon;

public class MainFormHumaine extends javax.swing.JFrame {
    FlatDarkPurpleIJTheme darkPurpleIJTheme;
    ApprobationControleur controleur = new ApprobationControleur();
    String message1 = "Votre Demande a été approuvé,Nous vous souhaittons les bons moments de congé.";
    String message2 = "Votre Demande n est pas encore approuvé,Veiellez attendre patiemment.";
    String message3 = "Votre n avez aucune notification,vous pouvez demandé le congé.";

    public MainFormHumaine(String nom) {
        initComponents();
        show.setText(nom);
        darkPurpleIJTheme.setup();
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
        setTitle("Gestion des congé");
        controleur.demander(controleur.returnId("employeID", "employe", "employePrenom", nom), message1, message2, message3, notif);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        show = new javax.swing.JLabel();
        ajouterEmploye = new javax.swing.JButton();
        demandeConge = new javax.swing.JButton();
        listeApprobation = new javax.swing.JButton();
        approuverDemandes = new javax.swing.JButton();
        deconnexion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        notif = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        show.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setText("Bienvenu ");

        ajouterEmploye.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        ajouterEmploye.setForeground(new java.awt.Color(255, 255, 255));
        ajouterEmploye.setText("Ajouter un employé");
        ajouterEmploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterEmployeActionPerformed(evt);
            }
        });

        demandeConge.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        demandeConge.setForeground(new java.awt.Color(255, 255, 255));
        demandeConge.setText("Demander un congé");
        demandeConge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demandeCongeActionPerformed(evt);
            }
        });

        listeApprobation.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        listeApprobation.setForeground(new java.awt.Color(255, 255, 255));
        listeApprobation.setText("Liste des demandes approuvées");
        listeApprobation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeApprobationActionPerformed(evt);
            }
        });

        approuverDemandes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        approuverDemandes.setForeground(new java.awt.Color(255, 255, 255));
        approuverDemandes.setText("Approuver les demandes");
        approuverDemandes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approuverDemandesActionPerformed(evt);
            }
        });

        deconnexion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deconnexion.setForeground(new java.awt.Color(255, 255, 255));
        deconnexion.setText("se déconnecter");
        deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Liste des actions que vous pouvez faire ");

        notif.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notif.setForeground(new java.awt.Color(255, 255, 255));
        notif.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(ajouterEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(demandeConge, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(approuverDemandes, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(listeApprobation, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(deconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notif, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notif, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(ajouterEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(demandeConge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(approuverDemandes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(listeApprobation, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(deconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void demandeCongeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demandeCongeActionPerformed
        super.dispose();
        new DemandeForm(show.getText()).setVisible(true);
    }//GEN-LAST:event_demandeCongeActionPerformed

    private void listeApprobationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeApprobationActionPerformed
        super.dispose();
        new ListeApprobation().setVisible(true);
    }//GEN-LAST:event_listeApprobationActionPerformed

    private void deconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionActionPerformed
        super.dispose();
        new LoginForm(null, false).setVisible(true);

    }//GEN-LAST:event_deconnexionActionPerformed

    private void ajouterEmployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterEmployeActionPerformed
        super.dispose();
        new EmployeForm().setVisible(true);
    }//GEN-LAST:event_ajouterEmployeActionPerformed

    private void approuverDemandesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approuverDemandesActionPerformed
        super.dispose();
        new ApprobationForm(show.getText()).setVisible(true);
    }//GEN-LAST:event_approuverDemandesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(MainFormHumaine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainFormHumaine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainFormHumaine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainFormHumaine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        FlatDarkPurpleIJTheme.setup();
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainFormHumaine("").setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterEmploye;
    private javax.swing.JButton approuverDemandes;
    private javax.swing.JButton deconnexion;
    private javax.swing.JButton demandeConge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listeApprobation;
    private javax.swing.JLabel notif;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package falconsvd.gui;

import falconsvd.controller.ControllerAbout;
import falconsvd.controller.ControllerEditThreshold;
import falconsvd.controller.ControllerFalconDetection;
import falconsvd.controller.ControllerFalconMake;
import falconsvd.controller.ControllerFalconRecognition;
import falconsvd.controller.ControllerManual;
import falconsvd.controller.ControllerOpenTarget;
import falconsvd.controller.ControllerProcessMedia;
import falconsvd.controller.ControllerProcessNormal;
import falconsvd.controller.ControllerSaveLog;
import falconsvd.controller.ControllerSaveMatch;
import falconsvd.controller.ControllerSaveMedia;
import falconsvd.controller.ControllerSaveNormal;
import falconsvd.controller.ControllerSelectDB;
import falconsvd.model.LoadImagesPNM;

/**
 *
 * @author sebaxtian
 */
public class FalconSVD extends javax.swing.JFrame {

    /**
     * Creates new form FalconSVD
     */
    public FalconSVD() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupNorma = new javax.swing.ButtonGroup();
        tabbedPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panelDrawTarget = new javax.swing.JPanel();
        canvasTarget = new java.awt.Canvas();
        jPanel2 = new javax.swing.JPanel();
        panelDrawMedia = new javax.swing.JPanel();
        canvasMedia = new java.awt.Canvas();
        jPanel3 = new javax.swing.JPanel();
        panelDrawNormal = new javax.swing.JPanel();
        canvasNormal = new java.awt.Canvas();
        jPanel4 = new javax.swing.JPanel();
        panelDrawMatch = new javax.swing.JPanel();
        canvasMatch = new java.awt.Canvas();
        panelDrawTarget1 = new javax.swing.JPanel();
        canvasTarget1 = new java.awt.Canvas();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaLog = new javax.swing.JTextArea();
        progressBar = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuOpenTarget = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuThreshold = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        buttonNorma1 = new javax.swing.JRadioButtonMenuItem();
        buttonNorma2 = new javax.swing.JRadioButtonMenuItem();
        buttonNormaFrob = new javax.swing.JRadioButtonMenuItem();
        buttonNormaInf = new javax.swing.JRadioButtonMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuSelectDBSomebody = new javax.swing.JMenuItem();
        menuSelectDBPeople = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuProcessMedia = new javax.swing.JMenuItem();
        menuProcessNormal = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuFalconMake = new javax.swing.JMenuItem();
        menuFalconDetection = new javax.swing.JMenuItem();
        menuFalconRecognition = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuSaveMedia = new javax.swing.JMenuItem();
        menuSaveNormal = new javax.swing.JMenuItem();
        menuSaveMatch = new javax.swing.JMenuItem();
        menuSaveLog = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuManual = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FalconSVD");
        setMinimumSize(new java.awt.Dimension(520, 450));

        panelDrawTarget.setBackground(new java.awt.Color(254, 254, 254));
        panelDrawTarget.setPreferredSize(new java.awt.Dimension(240, 320));
        panelDrawTarget.setLayout(new java.awt.BorderLayout());
        panelDrawTarget.add(canvasTarget, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(panelDrawTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDrawTarget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Target", jPanel1);

        panelDrawMedia.setBackground(new java.awt.Color(254, 254, 254));
        panelDrawMedia.setPreferredSize(new java.awt.Dimension(240, 320));
        panelDrawMedia.setLayout(new java.awt.BorderLayout());
        panelDrawMedia.add(canvasMedia, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(panelDrawMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDrawMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Media", jPanel2);

        panelDrawNormal.setBackground(new java.awt.Color(254, 254, 254));
        panelDrawNormal.setPreferredSize(new java.awt.Dimension(240, 320));
        panelDrawNormal.setLayout(new java.awt.BorderLayout());
        panelDrawNormal.add(canvasNormal, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(panelDrawNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDrawNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Normal", jPanel3);

        panelDrawMatch.setBackground(new java.awt.Color(254, 254, 254));
        panelDrawMatch.setPreferredSize(new java.awt.Dimension(240, 320));
        panelDrawMatch.setLayout(new java.awt.BorderLayout());
        panelDrawMatch.add(canvasMatch, java.awt.BorderLayout.CENTER);

        panelDrawTarget1.setBackground(new java.awt.Color(254, 254, 254));
        panelDrawTarget1.setPreferredSize(new java.awt.Dimension(240, 320));
        panelDrawTarget1.setLayout(new java.awt.BorderLayout());
        panelDrawTarget1.add(canvasTarget1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(panelDrawMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDrawTarget1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDrawTarget1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDrawMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabbedPanel.addTab("Recognition", jPanel4);

        textAreaLog.setLineWrap(true);
        jScrollPane1.setViewportView(textAreaLog);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPanel.addTab("log", jPanel5);

        getContentPane().add(tabbedPanel, java.awt.BorderLayout.CENTER);

        progressBar.setStringPainted(true);
        getContentPane().add(progressBar, java.awt.BorderLayout.SOUTH);

        jMenu1.setText("File");

        menuOpenTarget.setText("Open Target");
        menuOpenTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenTargetActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpenTarget);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        menuThreshold.setText("Threshold");
        menuThreshold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuThresholdActionPerformed(evt);
            }
        });
        jMenu2.add(menuThreshold);

        jMenu8.setText("Norma");

        buttonGroupNorma.add(buttonNorma1);
        buttonNorma1.setText("Norma 1");
        jMenu8.add(buttonNorma1);

        buttonGroupNorma.add(buttonNorma2);
        buttonNorma2.setSelected(true);
        buttonNorma2.setText("Norma 2");
        jMenu8.add(buttonNorma2);

        buttonGroupNorma.add(buttonNormaFrob);
        buttonNormaFrob.setText("Norma Frobenius");
        jMenu8.add(buttonNormaFrob);

        buttonGroupNorma.add(buttonNormaInf);
        buttonNormaInf.setText("Norma Infinity");
        jMenu8.add(buttonNormaInf);

        jMenu2.add(jMenu8);

        jMenu6.setText("Select DB");

        menuSelectDBSomebody.setText("Somebody");
        menuSelectDBSomebody.setEnabled(false);
        menuSelectDBSomebody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSelectDBSomebodyActionPerformed(evt);
            }
        });
        jMenu6.add(menuSelectDBSomebody);

        menuSelectDBPeople.setText("People");
        menuSelectDBPeople.setEnabled(false);
        menuSelectDBPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSelectDBPeopleActionPerformed(evt);
            }
        });
        jMenu6.add(menuSelectDBPeople);

        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Process");
        jMenu3.setToolTipText("");

        menuProcessMedia.setText("Media");
        menuProcessMedia.setEnabled(false);
        menuProcessMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcessMediaActionPerformed(evt);
            }
        });
        jMenu3.add(menuProcessMedia);

        menuProcessNormal.setText("Normal");
        menuProcessNormal.setEnabled(false);
        menuProcessNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProcessNormalActionPerformed(evt);
            }
        });
        jMenu3.add(menuProcessNormal);

        jMenu7.setText("FalconSVD");

        menuFalconMake.setText("Make");
        menuFalconMake.setEnabled(false);
        menuFalconMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFalconMakeActionPerformed(evt);
            }
        });
        jMenu7.add(menuFalconMake);

        menuFalconDetection.setText("Detection");
        menuFalconDetection.setEnabled(false);
        menuFalconDetection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFalconDetectionActionPerformed(evt);
            }
        });
        jMenu7.add(menuFalconDetection);

        menuFalconRecognition.setText("Recognition");
        menuFalconRecognition.setEnabled(false);
        menuFalconRecognition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFalconRecognitionActionPerformed(evt);
            }
        });
        jMenu7.add(menuFalconRecognition);

        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Save");

        menuSaveMedia.setText("Media");
        menuSaveMedia.setToolTipText("save the media image");
        menuSaveMedia.setEnabled(false);
        menuSaveMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveMediaActionPerformed(evt);
            }
        });
        jMenu4.add(menuSaveMedia);

        menuSaveNormal.setText("Normal");
        menuSaveNormal.setToolTipText("save the normal image");
        menuSaveNormal.setEnabled(false);
        menuSaveNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveNormalActionPerformed(evt);
            }
        });
        jMenu4.add(menuSaveNormal);

        menuSaveMatch.setText("Match");
        menuSaveMatch.setEnabled(false);
        menuSaveMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveMatchActionPerformed(evt);
            }
        });
        jMenu4.add(menuSaveMatch);

        menuSaveLog.setText("log");
        menuSaveLog.setToolTipText("save the log file");
        menuSaveLog.setEnabled(false);
        menuSaveLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveLogActionPerformed(evt);
            }
        });
        jMenu4.add(menuSaveLog);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        menuManual.setText("Manual");
        menuManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManualActionPerformed(evt);
            }
        });
        jMenu5.add(menuManual);

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        jMenu5.add(menuAbout);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(NORMAL);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuOpenTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenTargetActionPerformed
        // TODO add your handling code here:
        ControllerOpenTarget.actionPerformed(evt);
    }//GEN-LAST:event_menuOpenTargetActionPerformed

    private void menuThresholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuThresholdActionPerformed
        // TODO add your handling code here:
        ControllerEditThreshold.actionPerformed(evt);
    }//GEN-LAST:event_menuThresholdActionPerformed

    private void menuProcessMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcessMediaActionPerformed
        // TODO add your handling code here:
        ControllerProcessMedia.actionPerformed(evt);
    }//GEN-LAST:event_menuProcessMediaActionPerformed

    private void menuSelectDBSomebodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSelectDBSomebodyActionPerformed
        // TODO add your handling code here:
        ControllerSelectDB.actionPerformed(evt, LoadImagesPNM.SOMEBODY);
    }//GEN-LAST:event_menuSelectDBSomebodyActionPerformed

    private void menuSelectDBPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSelectDBPeopleActionPerformed
        // TODO add your handling code here:
        ControllerSelectDB.actionPerformed(evt, LoadImagesPNM.PEOPLE);
    }//GEN-LAST:event_menuSelectDBPeopleActionPerformed

    private void menuProcessNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProcessNormalActionPerformed
        // TODO add your handling code here:
        ControllerProcessNormal.actionPerformed(evt);
    }//GEN-LAST:event_menuProcessNormalActionPerformed

    private void menuSaveMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveMediaActionPerformed
        // TODO add your handling code here:
        ControllerSaveMedia.actionPerformed(evt);
    }//GEN-LAST:event_menuSaveMediaActionPerformed

    private void menuSaveNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveNormalActionPerformed
        // TODO add your handling code here:
        ControllerSaveNormal.actionPerformed(evt);
    }//GEN-LAST:event_menuSaveNormalActionPerformed

    private void menuSaveLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveLogActionPerformed
        // TODO add your handling code here:
        ControllerSaveLog.actionPerformed(evt);
    }//GEN-LAST:event_menuSaveLogActionPerformed

    private void menuFalconMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFalconMakeActionPerformed
        // TODO add your handling code here:
        ControllerFalconMake.actionPerformed(evt);
    }//GEN-LAST:event_menuFalconMakeActionPerformed

    private void menuFalconDetectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFalconDetectionActionPerformed
        // TODO add your handling code here:
        ControllerFalconDetection.actionPerformed(evt);
    }//GEN-LAST:event_menuFalconDetectionActionPerformed

    private void menuFalconRecognitionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFalconRecognitionActionPerformed
        // TODO add your handling code here:
        ControllerFalconRecognition.actionPerformed(evt);
    }//GEN-LAST:event_menuFalconRecognitionActionPerformed

    private void menuSaveMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSaveMatchActionPerformed
        // TODO add your handling code here:
        ControllerSaveMatch.actionPerformed(evt);
    }//GEN-LAST:event_menuSaveMatchActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        // TODO add your handling code here:
        ControllerAbout.actionPerformed(evt);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManualActionPerformed
        // TODO add your handling code here:
        ControllerManual.actionPerformed(evt);
    }//GEN-LAST:event_menuManualActionPerformed

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
            java.util.logging.Logger.getLogger(FalconSVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FalconSVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FalconSVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FalconSVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FalconSVD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroupNorma;
    public static javax.swing.JRadioButtonMenuItem buttonNorma1;
    public static javax.swing.JRadioButtonMenuItem buttonNorma2;
    public static javax.swing.JRadioButtonMenuItem buttonNormaFrob;
    public static javax.swing.JRadioButtonMenuItem buttonNormaInf;
    public static java.awt.Canvas canvasMatch;
    public static java.awt.Canvas canvasMedia;
    public static java.awt.Canvas canvasNormal;
    public static java.awt.Canvas canvasTarget;
    public static java.awt.Canvas canvasTarget1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public static javax.swing.JMenuItem menuAbout;
    public static javax.swing.JMenuItem menuFalconDetection;
    public static javax.swing.JMenuItem menuFalconMake;
    public static javax.swing.JMenuItem menuFalconRecognition;
    public static javax.swing.JMenuItem menuManual;
    private javax.swing.JMenuItem menuOpenTarget;
    public static javax.swing.JMenuItem menuProcessMedia;
    public static javax.swing.JMenuItem menuProcessNormal;
    public static javax.swing.JMenuItem menuSaveLog;
    public static javax.swing.JMenuItem menuSaveMatch;
    public static javax.swing.JMenuItem menuSaveMedia;
    public static javax.swing.JMenuItem menuSaveNormal;
    public static javax.swing.JMenuItem menuSelectDBPeople;
    public static javax.swing.JMenuItem menuSelectDBSomebody;
    public static javax.swing.JMenuItem menuThreshold;
    public static javax.swing.JPanel panelDrawMatch;
    public static javax.swing.JPanel panelDrawMedia;
    public static javax.swing.JPanel panelDrawNormal;
    public static javax.swing.JPanel panelDrawTarget;
    public static javax.swing.JPanel panelDrawTarget1;
    public static javax.swing.JProgressBar progressBar;
    public static javax.swing.JTabbedPane tabbedPanel;
    public static javax.swing.JTextArea textAreaLog;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author chima
 */
public class Movie_Ticket7 extends javax.swing.JFrame {

    /**
     * Creates new form Movie_Ticket
     */
    String seatbuy ="";
    public Movie_Ticket7() {
        initComponents();
    btsave.setIcon(new ImageIcon("src\\Picture\\btsave.png"));    
    jLabel1.setIcon(new ImageIcon("src\\Picture\\Ticket_01.png"));
        
    }

    Movie_Ticket7(String seats, int total) {
        
    }

    Movie_Ticket7(String seats, int total, String usermovie1) {
        this();
        test.setText(seats);
        test1.setText(total+" Baht");
        test2.setText(usermovie1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btsave = new javax.swing.JLabel();
        wall1 = new javax.swing.JPanel();
        test2 = new javax.swing.JLabel();
        test = new javax.swing.JLabel();
        test1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btmini = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btsave.setText("save");
        btsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsaveMouseClicked(evt);
            }
        });
        getContentPane().add(btsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 50, -1));

        wall1.setBackground(new java.awt.Color(215, 35, 35));
        wall1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        test2.setFont(new java.awt.Font("LilyUPC", 0, 24)); // NOI18N
        test2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        test2.setText("TEST");
        wall1.add(test2, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 534, 130, 20));

        test.setFont(new java.awt.Font("LilyUPC", 0, 18)); // NOI18N
        test.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        test.setText("TEST");
        wall1.add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 534, 160, -1));

        test1.setFont(new java.awt.Font("LilyUPC", 0, 24)); // NOI18N
        test1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        test1.setText("TEST");
        wall1.add(test1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 604, 100, 20));

        jLabel1.setFont(new java.awt.Font("LilyUPC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        wall1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 20, 18, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/ticket07.png"))); // NOI18N
        wall1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 44, 423, 700));

        btmini.setFont(new java.awt.Font("LilyUPC", 0, 24)); // NOI18N
        btmini.setForeground(new java.awt.Color(238, 238, 238));
        btmini.setText("-");
        btmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btminiMouseClicked(evt);
            }
        });
        wall1.add(btmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 20, 24, -1));

        jLabel8.setFont(new java.awt.Font("LilyUPC", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 238, 238));
        jLabel8.setText("TICKET");
        wall1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 20, -1, 24));

        getContentPane().add(wall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btminiMouseClicked
        // Click Minisize Windows.
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btminiMouseClicked

    private void btsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsaveMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this,"Do you want to Save?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(confirm==JOptionPane.YES_OPTION){
            //Save to Files.
            String user = test2.getText();
            String SEAT = test.getText();
            String NewLine = System.getProperty("line.separator");//NewLine 
            
        try{
           //Start Writer File............................
           FileWriter Writer = new FileWriter("Movie.txt",true);
           Writer.write(user+" "+SEAT+" "+"Movie : Bad Genius "+NewLine);
           Writer.close();
           //End Writer File..............................
           JOptionPane.showMessageDialog(null,"Success");
           login call = new login();
           call.setVisible(true);
           setLocationRelativeTo(null);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           pack();
           dispose();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"Error");
       }
        if(confirm==JOptionPane.NO_OPTION){}       
        }
    }//GEN-LAST:event_btsaveMouseClicked

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
            java.util.logging.Logger.getLogger(Movie_Ticket7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movie_Ticket7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movie_Ticket7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movie_Ticket7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Movie_Ticket7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btmini;
    private javax.swing.JLabel btsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel test;
    private javax.swing.JLabel test1;
    private javax.swing.JLabel test2;
    private javax.swing.JPanel wall1;
    // End of variables declaration//GEN-END:variables
}

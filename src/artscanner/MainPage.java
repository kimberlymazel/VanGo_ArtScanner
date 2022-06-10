package artscanner;

public class MainPage extends javax.swing.JFrame {
   
    // CREATES THE NEW FORM
    public MainPage() {
        initComponents();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intro = new javax.swing.JLabel();
        intro3 = new javax.swing.JLabel();
        intro2 = new javax.swing.JLabel();
        lettersBT = new javax.swing.JButton();
        paintingBT = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        intro.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        intro.setForeground(new java.awt.Color(255, 255, 255));
        intro.setText("Welcome to Van Go!");
        getContentPane().add(intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 53));

        intro3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        intro3.setForeground(new java.awt.Color(255, 255, 255));
        intro3.setText("Select what you want to find:");
        getContentPane().add(intro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        intro2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        intro2.setForeground(new java.awt.Color(255, 255, 255));
        intro2.setText("Ready to start?");
        getContentPane().add(intro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 79, -1, -1));

        lettersBT.setBackground(new java.awt.Color(204, 204, 255));
        lettersBT.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lettersBT.setText("Letters");
        lettersBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lettersBTActionPerformed(evt);
            }
        });
        getContentPane().add(lettersBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 110, 40));

        paintingBT.setBackground(new java.awt.Color(204, 204, 255));
        paintingBT.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        paintingBT.setText("Painting");
        paintingBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paintingBTActionPerformed(evt);
            }
        });
        getContentPane().add(paintingBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artscanner/images/background.jpeg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // OPENS USER (GUI) WINDOW WHEN CLICKED
    private void paintingBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paintingBTActionPerformed
        PaintingGUI painting = new PaintingGUI();
        painting.show();
        
        dispose(); // CLOSES CURRENT WINDOW AFTER OPENING THE OTHER
    }//GEN-LAST:event_paintingBTActionPerformed

    // OPENS ADMIN (ADMININTERFACE) WINDOW WHEN CLICKED
    private void lettersBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lettersBTActionPerformed
        LetterGUI letter = new LetterGUI();
        letter.show();
        
        dispose(); // CLOSES CURRENT WINDOW AFTER OPENING THE OTHER
    }//GEN-LAST:event_lettersBTActionPerformed

    public static void main(String args[]) {
        // DISPLAYS THE FORM WHEN RUN
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel intro;
    private javax.swing.JLabel intro2;
    private javax.swing.JLabel intro3;
    private javax.swing.JButton lettersBT;
    private javax.swing.JButton paintingBT;
    // End of variables declaration//GEN-END:variables
}

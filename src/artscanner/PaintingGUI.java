package artscanner;

import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PaintingGUI extends javax.swing.JFrame {
    
    String inputPath = "";

    Painting painting = new Painting();
    ImageRecognition imagerec = new ImageRecognition();
    
    // CREATES FORM
    public PaintingGUI() {
        initComponents();
        
        // SOME ARTWORKS FOR DEMONSTRATION
        // ALL IMAGES AND INFORMATION IS FROM WIKIPEDIA
        // https://en.wikipedia.org/wiki/Vincent_van_Gogh
        painting.addArtwork("Starry Night", "1889", "Oil on canvas",
                "src/artscanner/images/starrynight.jpeg");
        painting.addArtwork("Irises", "1889", "Oil on canvas",
                "src/artscanner/images/irises.jpeg");
        painting.addArtwork("Self Portrait", "1889", "Oil on canvas",
                "src/artscanner/images/selfportrait.jpeg");
        painting.addArtwork("Potato Eaters", "1885", "Oil paint",
                "src/artscanner/images/potatoeaters.jpeg");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        nameField2 = new javax.swing.JTextField();
        goName = new javax.swing.JLabel();
        matchView = new javax.swing.JLabel();
        inputView = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        scanButton = new javax.swing.JButton();
        descLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        artSimilarity = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        findArtwork = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descField.setForeground(new java.awt.Color(102, 102, 102));
        descField.setText("Enter media");
        getContentPane().add(descField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 160, -1));

        yearField.setForeground(new java.awt.Color(102, 102, 102));
        yearField.setText("Enter year");
        getContentPane().add(yearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, -1));

        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setText("Enter artwork name");
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, -1));

        nameField2.setForeground(new java.awt.Color(102, 102, 102));
        nameField2.setText("Enter artwork name");
        getContentPane().add(nameField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 160, -1));

        goName.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        goName.setForeground(new java.awt.Color(255, 255, 255));
        goName.setText("Painting");
        getContentPane().add(goName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, -1, -1));

        matchView.setBackground(new java.awt.Color(0, 0, 0));
        matchView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matchView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artscanner/images/placeholder.jpeg"))); // NOI18N
        getContentPane().add(matchView, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 160, 160));

        inputView.setBackground(new java.awt.Color(0, 0, 0));
        inputView.setForeground(new java.awt.Color(255, 255, 255));
        inputView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artscanner/images/placeholder.jpeg"))); // NOI18N
        getContentPane().add(inputView, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, 160, 160));

        insertButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        insertButton.setText("Insert Image");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        getContentPane().add(insertButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 232, 120, -1));

        scanButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        scanButton.setText("Scan & Match");
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(scanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 262, 120, -1));

        descLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        descLabel.setForeground(new java.awt.Color(255, 255, 255));
        descLabel.setText("Media:");
        getContentPane().add(descLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 160, -1));

        backButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        backButton.setText("<<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, -1));

        artSimilarity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        artSimilarity.setForeground(new java.awt.Color(255, 255, 255));
        artSimilarity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        artSimilarity.setText("Similarity: ");
        getContentPane().add(artSimilarity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 140, -1));

        yearLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("Year:");
        getContentPane().add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 160, -1));

        nameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 160, -1));

        findArtwork.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        findArtwork.setText("Find Artwork");
        findArtwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findArtworkActionPerformed(evt);
            }
        });
        getContentPane().add(findArtwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 140, -1));

        removeButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        removeButton.setText("Remove Artwork");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 140, -1));

        addButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addButton.setText("Add Artwork");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        warningLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 255, 255));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 190, 50));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artscanner/images/background.jpeg"))); // NOI18N
        background.setText("B");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // INSERT BUTTON ACTIONS (WHEN CLICKED)
    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        warningLabel.setText("");
        JFileChooser browseInput = new JFileChooser();
        
        // FILE FILTER (ONLY ALLOWS IMAGES)
        FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGES",
                "png", "jpg", "jpeg");
        browseInput.setFileFilter(filter);
        
        int showDialogue = browseInput.showOpenDialog(null);

        if (showDialogue == JFileChooser.APPROVE_OPTION) {
            File selectInput = browseInput.getSelectedFile();
            inputPath = selectInput.getAbsolutePath();
            
            // GETTING IMAGE FROM FILE PATH
            ImageIcon img = new ImageIcon(inputPath);
            
            // RESIZE TO VIEW'S SIZE
            int width = inputView.getWidth();
            int height = inputView.getHeight();
            Image resized = img.getImage().getScaledInstance(width, height,
                    Image.SCALE_DEFAULT);
            
            // VIEW IMAGE IN INPUTVIEW
            inputView.setIcon(new ImageIcon(resized));
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    // SCAN BUTTON ACTIONS (WHEN CLICKED)
    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButtonActionPerformed
        try{
           warningLabel.setText("");
           
           // CALLING IMAGERECOGNITION FUNCTION
           imagerec.start(inputPath, painting.getPath());
           ImageIcon match = new ImageIcon(imagerec.getMatch());
           
           // SETTING THE IMAGE TO MATCHVIEW'S SIZE
           int matchWidth = matchView.getWidth(); // MATCHVIEW WIDTH
           int matchHeight = matchView.getHeight(); // MATCHVIEW HEIGHT
           Image resizeMatch = match.getImage().getScaledInstance(matchWidth,
                   matchHeight, Image.SCALE_DEFAULT); // RESIZEING TO DIMENSIONS
           
           // SETTING IMAGE AND INFORMATION OF MATCHED ARTWORK
           matchView.setIcon(new ImageIcon(resizeMatch));
           artSimilarity.setText("Similarity: " + imagerec.getSimilarity() + "%");
           nameLabel.setText("Name: " + painting.getName(imagerec.getIndex()));
           yearLabel.setText("Year: " + painting.getYear(imagerec.getIndex()));
           descLabel.setText("Media: " + painting.getDesc(imagerec.getIndex()));
        }
        catch(IOException e){
        }
        
    }//GEN-LAST:event_scanButtonActionPerformed

    // BACK BUTTON TO RETURN TO USERADMIN PAGE
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainPage home = new MainPage();
        home.show();
        
        // CLOSES CURRENT PAGE AFTER OPENING NEW ONE
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       // ASSIGN INPUT VALUES TO VARIABLES
        String name = nameField.getText();
        String year = yearField.getText();
        String desc = descField.getText();
        
        // MESSAGES TO INFORM THE USER ON THE ACTIONS CARRIED OUT
        if (painting.addArtwork(name, year, desc, inputPath)==false){
            warningLabel.setText("Artwork already exists!");
        }
        
        // ADD ARTWORK IF IT DOES NOT EXIST IN ARRAYLIST YET
        else{
            painting.addArtwork(name, year, desc, inputPath);
            warningLabel.setText("Artwork added.");  
        }
        
        // RESETS LAYOUT
        ResetField();
        ResetInfo();

    }//GEN-LAST:event_addButtonActionPerformed

    // REMOVE ARTWORK BUTTON
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // ASSIGN USER INPUT TO VARIABLE
        String name = nameField2.getText();
        
        // INFORMS USER ON ACTIONS
        // IF ARTWORK NOT FOUND
        if (painting.removeArtwork(name)==false){
            warningLabel.setText("Artwork not found.");
        }
        
        // IF ARTWORK FOUND AND REMOVED
        else{
            painting.removeArtwork(name);
            warningLabel.setText("Artwork removed.");
        }
        
        // RESETS LAYOUT
        ResetInfo();
        nameField2.setText("Enter name");
        
    }//GEN-LAST:event_removeButtonActionPerformed

    // FIND ARTWORK BUTTON
    private void findArtworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findArtworkActionPerformed
        String name = nameField2.getText();
        ResetInfo();
        
        // IF ARTWORK IS NOT FOUND IN ARRAY
        if(painting.findArtwork(name)==false){
            // SEND WARNING LABEL THAT IT'S NOT FOUND
            warningLabel.setText("Artwork not found.");
        }
        
        // IF ARTWORK IS FOUND IN ARRAY
        else{
            warningLabel.setText("");
            painting.findArtwork(name); // FINDS ARTWORK

            // SET INFO FIELD WITH INFORMATION
            nameLabel.setText("Name: " + painting.getName(painting.getArt()));
            yearLabel.setText("Year: " + painting.getYear(painting.getArt()));
            descLabel.setText("Media: " + painting.getDesc(painting.getArt()));

            // SETS MATCHVIEW WITH IMAGE
            ImageIcon find = new ImageIcon(painting.getPathIdx(painting.getArt()));
            int matchWidth = matchView.getWidth();
            int matchHeight = matchView.getHeight();
            Image resize = find.getImage().getScaledInstance(matchWidth,
                    matchHeight, Image.SCALE_DEFAULT);

            matchView.setIcon(new ImageIcon(resize));
        }
        
        nameField2.setText("Enter name");
    }//GEN-LAST:event_findArtworkActionPerformed

    // RESET INPUT FIELDS
    public void ResetField(){
        nameField.setText("Enter name");
        yearField.setText("Enter year");
        descField.setText("Enter media");
    }
    
    // RESET INFO 
    public void ResetInfo(){
        // RESETS INFORMATION LABELS
        artSimilarity.setText("Similarity: ");
        nameLabel.setText("Name: ");
        descLabel.setText("Media: ");
        yearLabel.setText("Year: ");
        
        // RESET MATCHVIEW TO PLACEHOLDER
        ImageIcon placeholder = new ImageIcon("src/artscanner/images/placeholder.jpeg");
        matchView.setIcon(placeholder);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel artSimilarity;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JTextField descField;
    private javax.swing.JLabel descLabel;
    private javax.swing.JButton findArtwork;
    private javax.swing.JLabel goName;
    private javax.swing.JLabel inputView;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel matchView;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton scanButton;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JTextField yearField;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}

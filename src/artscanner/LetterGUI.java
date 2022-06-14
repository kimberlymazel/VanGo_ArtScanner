package artscanner;

import javax.swing.JFileChooser;
import java.io.File;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.io.IOException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class LetterGUI extends javax.swing.JFrame {

    // VARIABLE FOR INPUTTED IMAGE PATH
    String inputPath = "";

    // OBJECT INSTANTATION
    Letter letter = new Letter();
    ImageRecognition imagerec = new ImageRecognition();
    
    public LetterGUI() {
        initComponents();
        
        // FOR DEMONSTRATION
        // ALL IMAGES AND INFORMATION IS FROM WIKIPEDIA
        //https://en.wikipedia.org/wiki/The_Letters_of_Vincent_van_Gogh
        letter.addLetter("Sunflower Triptych", "1889", "Theo (Brother)",
                "529", "src/artscanner/images/sunflowertriptych.jpeg");
        letter.addLetter("Public Soup Kitchen", "1883", "Unknown",
                "271", "src/artscanner/images/publicsoupkitchen.jpeg");
        letter.addLetter("Letter to John", "1888", "John Russell",
                "Unknown", "src/artscanner/images/lettertojohn.jpeg");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        nameField2 = new javax.swing.JTextField();
        recField = new javax.swing.JTextField();
        goName = new javax.swing.JLabel();
        matchView = new javax.swing.JLabel();
        inputView = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        scanButton = new javax.swing.JButton();
        numLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        recLabel = new javax.swing.JLabel();
        artSimilarity = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        findLetter = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numField.setForeground(new java.awt.Color(102, 102, 102));
        numField.setText("Enter letter number");
        getContentPane().add(numField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 180, -1));

        yearField.setForeground(new java.awt.Color(102, 102, 102));
        yearField.setText("Enter year");
        getContentPane().add(yearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        nameField.setForeground(new java.awt.Color(102, 102, 102));
        nameField.setText("Enter letter name");
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, -1));

        nameField2.setForeground(new java.awt.Color(102, 102, 102));
        nameField2.setText("Enter letter name");
        getContentPane().add(nameField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 240, -1));

        recField.setForeground(new java.awt.Color(102, 102, 102));
        recField.setText("Enter receiver");
        getContentPane().add(recField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, -1));

        goName.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        goName.setForeground(new java.awt.Color(255, 255, 255));
        goName.setText("Letters");
        getContentPane().add(goName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, -1, -1));

        matchView.setBackground(new java.awt.Color(0, 0, 0));
        matchView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matchView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artscanner/images/placeholder.jpeg"))); // NOI18N
        getContentPane().add(matchView, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, 160));

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

        numLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        numLabel.setForeground(new java.awt.Color(255, 255, 255));
        numLabel.setText("Letter No:");
        getContentPane().add(numLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 240, -1));

        backButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        backButton.setText("<<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, -1));

        recLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        recLabel.setForeground(new java.awt.Color(255, 255, 255));
        recLabel.setText("Receiver:");
        getContentPane().add(recLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 230, -1));

        artSimilarity.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        artSimilarity.setForeground(new java.awt.Color(255, 255, 255));
        artSimilarity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        artSimilarity.setText("Similarity: ");
        getContentPane().add(artSimilarity, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 140, -1));

        yearLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("Year:");
        getContentPane().add(yearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 230, -1));

        nameLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        getContentPane().add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 240, -1));

        findLetter.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        findLetter.setText("Find Letter");
        findLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findLetterActionPerformed(evt);
            }
        });
        getContentPane().add(findLetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 140, -1));

        removeButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        removeButton.setText("Remove Letter");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 140, -1));

        addButton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addButton.setText("Add Artwork");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        warningLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 13)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 255, 255));
        warningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 160, 50));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/artscanner/images/background.jpeg"))); // NOI18N
        background.setText("B");
        background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // INSERT BUTTON ACTIONS WHEN CLICKED
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

    // SCAN BUTTON ACTION WHEN CLICKED
    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButtonActionPerformed
        try{
            // RESETS WARNING LABELS
            warningLabel.setText("");
            
            // CALLS IMAGERECOGNITION FUNCTION
            imagerec.start(inputPath, letter.getPath());
            ImageIcon match = new ImageIcon(imagerec.getMatch());

            // SETS IMAGE TO MATCHVIEW'S WIDTH AND HEIGHT
            int matchWidth = matchView.getWidth(); // GETS MATCHVIEW'S WIDTH
            int matchHeight = matchView.getHeight(); // GETS MATCHVIEW'S HEIGHT
            
            // RESIZES IMAGE TO MATCHVIEW'S DIMENSIONS
            Image resizeMatch = match.getImage().getScaledInstance(matchWidth,
                    matchHeight, Image.SCALE_DEFAULT);

            // SETTING LABELS AND INFORMATION TO MATCHED IMAGE'S
            matchView.setIcon(new ImageIcon(resizeMatch));
            artSimilarity.setText("Similarity: " + imagerec.getSimilarity() + "%");
            nameLabel.setText("Name: " + letter.getName(imagerec.getIndex()));
            yearLabel.setText("Year: " + letter.getYear(imagerec.getIndex()));
            recLabel.setText("Receiver: " + letter.getDesc(imagerec.getIndex()));
            numLabel.setText("Letter No: " + letter.getNum(imagerec.getIndex()));
        }
        catch(IOException e){
        }

    }//GEN-LAST:event_scanButtonActionPerformed

    // BACK BUTTON ACTION WHEN CLICKED
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       // RETURNS TO MAIN PAGE
        MainPage home = new MainPage();
        home.show();

        // CLOSES CURRENT PAGE AFTER OPENING NEW ONE
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    // FIND LETTER BUTTON ACTION WHEN CLICKED
    private void findLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findLetterActionPerformed
        ResetInfo();
        String name = nameField2.getText();

        // IF LETTER NOT FOUND IN ARRAYLIST
        if(letter.findArtwork(name)==false){
            warningLabel.setText("Letter not found.");
        }

        // IF LETTER FOUND IN ARRAYLIST
        else{
            letter.findArtwork(name);
            nameField2.setText("Enter name");

            nameLabel.setText("Name: " + letter.getName(letter.getArt()));
            yearLabel.setText("Year: " + letter.getYear(letter.getArt()));
            recLabel.setText("Receiver: " + letter.getDesc(letter.getArt()));
            numLabel.setText("Letter No: " + letter.getNum(letter.getArt()));

            ImageIcon find = new ImageIcon(letter.getPathIdx(letter.getArt()));
            int matchWidth = matchView.getWidth();
            int matchHeight = matchView.getHeight();
            Image resize = find.getImage().getScaledInstance(matchWidth,
                matchHeight, Image.SCALE_DEFAULT);

            matchView.setIcon(new ImageIcon(resize));
        }
        nameField2.setText("Enter name");
    }//GEN-LAST:event_findLetterActionPerformed

    // REMOVE BUTTON ACTION WHEN CLICKED
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String name = nameField2.getText();

        // IF LETTER IS NOT FOUND IN THE ARRAYLIST
        if (letter.removeArtwork(name)==false){
            warningLabel.setText("Letter not found.");
        }

        // IF LETTER IS FOUND IN THE ARRAYLIST
        else{
            letter.removeArtwork(name); // REMOVE ARTWORK FROM ARRAYLIST
            warningLabel.setText("Letter removed."); // SEND MESSAGE TO USER
        }
        
        // RESETS FIELDS AND INFO
        ResetInfo();
        nameField2.setText("Enter name");

    }//GEN-LAST:event_removeButtonActionPerformed

    // ADD BUTTON ACTION WHEN CLICKED
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // VARIABLES WITH ASSIGNED INPUT VALUES
        String name = nameField.getText();
        String year = yearField.getText();
        String num = numField.getText();
        String rec = recField.getText();

        // IF LETTER ALREADY EXISTS, MESSAGE IS SHOWN
        if (letter.addLetter(name, year, rec, num, inputPath)==false){
            warningLabel.setText("Letter already exists.");
        }

        // ELSE, ADD LETTER 
        else{
          letter.addLetter(name, year, rec, num, inputPath);
          warningLabel.setText("Letter added.");
        }
        
        // RESET FIELDS AND INFOS
        ResetField();
        ResetInfo();
    }//GEN-LAST:event_addButtonActionPerformed

    // RESET INPUT FIELDS
    public void ResetField(){
        nameField.setText("Enter letter name");
        yearField.setText("Enter year");
        recField.setText("Enter receiver");
        numField.setText("Enter letter number");
    }
    
    // RESET INFO 
    public void ResetInfo(){
        artSimilarity.setText("Similarity: ");
        nameLabel.setText("Name: ");
        recLabel.setText("Receiver: ");
        yearLabel.setText("Year: ");
        numLabel.setText("Letter No: ");
        
        // RESET MATCHVIEW TO PLACEHOLDER
        ImageIcon placeholder = new ImageIcon("src/artscanner/images/placeholder.jpeg");
        matchView.setIcon(placeholder);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel artSimilarity;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton findLetter;
    private javax.swing.JLabel goName;
    private javax.swing.JLabel inputView;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel matchView;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numField;
    private javax.swing.JLabel numLabel;
    private javax.swing.JTextField recField;
    private javax.swing.JLabel recLabel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton scanButton;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JTextField yearField;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}

package artscanner;

import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageRecognition {
    
    // IMAGES THAT WILL BE COMPARED
    BufferedImage input = null;
    BufferedImage compared = null;

    // PATH OF IMAGES THAT WILL BE COMPARED
    String inputpath = "";
    String comparepath = "";
    String matchpath = "";
    
    // DIMENSIONS
    int inputWidth = 0;
    int inputHeight = 0;
    int compareWidth = 0;
    int compareHeight = 0;
    
    int matchIndex = 0;
    
    double similarity = 0;

    public void setInput(String path) throws IOException{
        inputpath = path;
        File inputimg = new File(inputpath);
        input = ImageIO.read(inputimg);
        inputWidth = input.getWidth();
        inputHeight = input.getHeight();
    } 
            
    public void setCompare(String compPath) throws IOException{
        comparepath = compPath;
        File comparedimg = new File(comparepath);
        compared = ImageIO.read(comparedimg);
        compareWidth = compared.getWidth();
        compareHeight = compared.getHeight();
    }
    
    // REFERENCES FROM GEEKSFORGEEKS
    // https://www.geeksforgeeks.org/image-processing-in-java-comparision-of-two-images/?ref=lbp
    
    public double compareImage(){
        // IF WIDTH AND HEIGHT IS DIFFERENT, SIMILARITY IS 0
        // CANNOT COMPARE PIXELS IF WIDTH AND HEIGHT IS DIFFERENT
        if((inputWidth != compareWidth) || (inputHeight != compareHeight)){
            similarity = 0;
        }
        
        // ELSE COMPARE THE IMAGES
        else{
            
            // DIFFERENCE OF PIXELS IN IMAGES
            long difference = 0;
            
            // FOR ALL PIXELS IN HEIGHT OF IMAGE
            for(int i=0; i < inputHeight; i++){
                
                // FOR ALL PIXELS IN WIDTH OF IMAGE
                for(int j=0; j < inputWidth; j++){
                    
                    // RGB OF INPUT AND COMPARED IMAGE
                    int rgbInput = input.getRGB(j, i);
                    int rgbCompared = compared.getRGB(j, i);
                    
                    // INPUTTED IMAGE
                    int redInput = (rgbInput >> 16) & 0xff; // RED OF INPUT
                    int greenInput = (rgbInput >> 8) & 0xff; // GREEN OF INPUT
                    int blueInput = (rgbInput)&0xff; // BLUE OF INPUT
                    
                    // COMPARED IMAGE
                    int redCompared = (rgbCompared >> 16) & 0xff; // RED OF COMPARED
                    int greenCompared = (rgbCompared>> 8) & 0xff; // GREEN OF COMPARED
                    int blueCompared = (rgbCompared)&0xff; // BLUE OF COMPARED
  
                    // DIFFERENCES OF RED GREEN AND BLUE PIXELS
                    difference += Math.abs(redInput - redCompared);
                    difference += Math.abs(greenInput - greenCompared);
                    difference += Math.abs(blueInput - blueCompared);
                }
            }
        
        // CALCULATE THE TOTAL PIXELS AND DIFFERENCES
        double totalPixels = inputWidth * inputHeight * 3;
        double averageDifference = difference / totalPixels;

        // PERCENTAGE OF DIFFERENCE
        double percentage = (averageDifference / 255) * 100;

        // PERECENTAGE OF SIMILARITY TO 2 DECIMAL PLACE
        similarity = 100-percentage;
        }
        
        return similarity;
    }
    
    public boolean findCompare(ArrayList<String> pathArray) throws IOException {
        for(int i=1; i<pathArray.size(); i++){
            setCompare(pathArray.get(i));
            compareImage();
            
            if(similarity>=85){
                matchpath = pathArray.get(i);
                matchIndex = i;
                return true;
            }
        }
        return false;
    }
    
    // GETTER METHODS
    public String getMatch(){
        return matchpath;
    }
    
    public int getIndex(){
        return matchIndex;
    }
    
    public String getSimilarity(){
        return String.format("%.2f", similarity);
    }
    
    // METHOD TO START IMAGE RECOGNITION
    public void start(String inputPath, ArrayList<String> path) throws IOException{
        // CAKLS METHODS
        setInput(inputPath); // SET INPUT BASED ON PATH FROM JFORM
        findCompare(path); // FINDS IMAGE WITH SAME DIMENSIONS AND SIMILARITY > 85
        
        // IF IMAGE IS NOT FOUND
        if(findCompare(path)!=true){
            matchpath = "src/artscanner/images/nomatches.jpeg";
            matchIndex = 0;
        }
    }
}

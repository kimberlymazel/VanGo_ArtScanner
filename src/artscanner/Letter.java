package artscanner;

import java.util.ArrayList;

public class Letter extends Artworks {
    
    private ArrayList<String> receivers; // LETTER RECEIVERS
    private ArrayList<String> letterNumber; // LETTER NUMBERS
    
    public Letter(){
        
       receivers = new ArrayList<String>();
       receivers.add("N/A"); // FOR ARTWORKS NOT AVAILABLE
       
       letterNumber = new ArrayList<String>();
       letterNumber.add("N/A"); // FOR ARTWORKS NOT AVAILABLE
       
    }
    
    @Override
    // GET RECEIVER OF IMAGE
    public String getDesc(int idx){
        return receivers.get(idx);
    }
    
    // GET NUMBER OF LETTER
    public String getNum(int idx){
        return letterNumber.get(idx);
    }
    
    public boolean addLetter(String name, String date,
            String rec, String num, String path){
        // IF ARTWORK ALREADY EXISTS, RETURN FALSE
        if(titles.contains(name) == true){
            return false;
        }
        
        // IF ARTWORK DOES NOT EXIST, RETURN TRUE AND ADD TO ARRAY
        else{
            titles.add(name); // ADDS TITLE
            years.add(date); // ADDS YEAR
            receivers.add(rec); // ADDS RECEIVER
            letterNumber.add(num); // ADDS LETTER NUMBER
            imagePaths.add(path); // ADDS IMAGE PATH

            artworkNum++; // NUMBER OF ARTWORKS + 1
            
            return true;
        }
    }
    
    @Override
    public boolean removeArtwork(String name){
        // IF ARTWORK IS NOT AVAILABLE RETURN FALSE
        if(titles.contains(name) == false){
            return false;
        }
        
        // IF ARTWORK IS AVAILABLE, RETURN TRUE AND REMOVE
        else{
            // FIND INFORMATION BASED ON INDEX
            index = titles.indexOf(name);
            
            // REMOVE INFORMATION FROM ARRAYLISTS
            titles.remove(name);
            years.remove(years.get(index));
            receivers.remove(receivers.get(index));
            letterNumber.remove(letterNumber.get(index));
            imagePaths.remove(imagePaths.get(index));
 
            // ARTWORK NUMBER - 1
            artworkNum--;  
            
            return true;
        }
    }
    
}

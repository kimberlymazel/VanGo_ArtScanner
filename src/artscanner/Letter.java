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
    
    // ADD LETTER METHOD
    public boolean addLetter(String name, String date,
            String rec, String num, String path){
        // IF ARTWORK ALREADY EXISTS, RETURN FALSE
        // toUpperCase() used so that it is case insensitive
        if(titles.contains(name.toUpperCase()) == true){
            return false;
        }
        
        // IF ARTWORK DOES NOT EXIST, RETURN TRUE AND ADD TO ARRAY
        else{
            // toUpperCase() used so that it is case insensitive
            titles.add(name.toUpperCase()); // ADDS TITLE
            years.add(date); // ADDS YEAR
            receivers.add(rec); // ADDS RECEIVER
            letterNumber.add(num); // ADDS LETTER NUMBER
            imagePaths.add(path); // ADDS IMAGE PATH

            artworkNum++; // NUMBER OF ARTWORKS + 1
            
            return true;
        }
    }
    
    // OVERRIDES REMOVEARTWORK METHOD
    // REMOVES FROM RECEIVERS AND LETTERNUMBER ARRAYLISTS
    @Override
    public boolean removeArtwork(String name){
        // IF ARTWORK IS NOT AVAILABLE RETURN FALSE
        // toUpperCase() used so that it is case insensitive
        if(titles.contains(name.toUpperCase()) == false){
            return false;
        }
        
        // IF ARTWORK IS AVAILABLE, RETURN TRUE AND REMOVE
        else{
            // FIND INFORMATION BASED ON INDEX
            // toUpperCase() used so that it is case insensitive
            index = titles.indexOf(name.toUpperCase());
            
            // REMOVE INFORMATION FROM ARRAYLISTS
            // toUpperCase() used so that it is case insensitive
            titles.remove(name.toUpperCase());
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

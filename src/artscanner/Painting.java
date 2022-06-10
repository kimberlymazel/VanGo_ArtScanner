package artscanner;

import java.util.ArrayList;

public class Painting extends Artworks {
    
    private ArrayList<String> artMedia; // ART MEDIA
    
    public Painting(){
  
       artMedia = new ArrayList<String>();
       artMedia.add("N/A"); // FOR ARTWORKS NOT AVAILABLE
       
    }
    
    @Override
    // GET MEDIA OF IMAGE
    public String getDesc(int idx){
        return artMedia.get(idx);
    }
    
    // POLYMORPHISM OF ADDARTWORK
    // INSTEAD OF DESCRIPTION WE USE MEDIA
    @Override
    public boolean addArtwork(String name, String date, String media, 
            String img){
        // IF ARTWORK ALREADY EXISTS, RETURN FALSE
        if(titles.contains(name) == true){
            return false;
        }
        
        // IF ARTWORK DOES NOT EXIST, RETURN TRUE AND ADD TO ARRAY
        else{
            titles.add(name); // ADDS TITLE
            years.add(date); // ADDS YEAR
            artMedia.add(media); // ADDS MEDIA
            imagePaths.add(img); // ADDS IMAGE PATH

            artworkNum++; // NUMBER OF ARTWORKS + 1
            
            return true;
        }
    }
    
    // POLYMORPHISM OF REMOVEARTWORK
    // INSTEAD OF DESCRIPTION WE USE MEDIA
    @Override
    public boolean removeArtwork(String name){
        // IF ARTWORK IS NOT AVAILABLE RETURN FALSE
        if(titles.contains(name) == false){
            return false;
        }
        
        // IF ARTWORK IS AVAILABLE, RETURN TRUE AND REMOVE
        
        // FIND INFORMATION BASED ON INDEX
        index = titles.indexOf(name);

        // REMOVE INFORMATION FROM ARRAYLISTS
        titles.remove(index);
        years.remove(index);
        artMedia.remove(index);
        imagePaths.remove(index);

        // ARTWORK NUMBER - 1
        artworkNum--;  
            
        return true;
    }
    
}

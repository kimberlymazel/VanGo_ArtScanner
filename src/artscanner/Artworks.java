package artscanner;

import java.util.ArrayList;

public class Artworks {
    
    // ARRAYLIST FOR INFORMATIONS
    protected ArrayList<String> titles;
    protected ArrayList<String> years; // YEARS
    protected ArrayList<String> description; // DESCRIPTIONS
    protected ArrayList<String> imagePaths; // IMAGE PATHS
    
    protected int artworkNum = 0; // NUMBER OF ARTWORKS
    protected int index = 0; // INDEX OF INFORMATION 
    
    public Artworks(){
       // ARRAYLIST FOR TITLES
       titles = new ArrayList<String>();
       titles.add("Artwork N/A"); // FOR ARTWORKS NOT AVAILABLE
       
       // ARRAYLIST FOR YEARS
       years = new ArrayList<String>();
       years.add("N/A"); // FOR ARTWORKS NOT AVAILABLE
       
       //ARRAYLIST FOR DESCRIPTION
       description = new ArrayList<String>();
       description.add("N/A"); // FOR ARTWORKS NOT AVAILABLE
       
       // ARRAYLIST FOR IMAGE PATHS
       imagePaths = new ArrayList<String>();
       imagePaths.add(""); // FOR ARTWORKS NOT AVAILABLE
  
       index++; // AT INDEX 0 IS INFORMATION FOR IF ARTWORK IS NOT AVAILABLE
    }
    
    // GET NAME OF IMAGE
    public String getName(int idx){
        return titles.get(idx);
    }
    
    // GET YEAR OF IMAGE
    public String getYear(int idx){
        return years.get(idx);
    }
    
    // GET DESCRIPTION OF IMAGE
    public String getDesc(int idx){
        return description.get(idx);
    }
    
    // GET ONE PATH
    public String getPathIdx(int idx){
        return imagePaths.get(idx);
    }
     
    // GET ALL PATHS
    public ArrayList<String> getPath(){
        return imagePaths;
    }
    
    // GET INDEX
    public int getArt(){
        return index;
    }
    
    // ADD ARTWORK
    public boolean addArtwork(String name, String date, String desc,
            String img){
        // IF ARTWORK ALREADY EXISTS, RETURN FALSE
        if(titles.contains(name) == true){
            return false;
        }
        
        // IF ARTWORK DOES NOT EXIST, RETURN TRUE AND ADD TO ARRAY
        else{
            titles.add(name); // ADDS TITLE
            years.add(date); // ADDS YEAR
            description.add(desc); // ADDS DESCRIPTION
            imagePaths.add(img); // ADDS IMAGE PATH
            
            artworkNum++; // NUMBER OF ARTWORKS + 1
            
            return true;
        }
    }
    
    // FIND ARTWORK
    public boolean findArtwork(String name){
        // IF ARTWORK IS NOT AVAILABLE IN DATABASE RETURN FALSE
        if(titles.contains(name) == false){
            return false;
        }
        
        // IF ARTWORK IS AVAILABLE, RETURN TRUE AND INFORMATION
        else{
            // GETS INFORMATION BASED ON INDEX
            index = titles.indexOf(name);
            return true;
        }
    }
    
    // REMOVE ARTWORK
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
            description.remove(description.get(index));
            imagePaths.remove(imagePaths.get(index));
            
            // ARTWORK NUMBER - 1
            artworkNum--;  
            
            return true;
        }
    }
}

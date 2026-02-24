import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files; //field 
    
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /** 
     *  It takes a single integer parameter and 
     * checks whether it is a valid index for the current state of the collection. To be valid, the parameter must 
     * lie in the range 0 to size()–1 (inclusive).
     */
    public void checkIndex(int index){
        if (!(index >= 0 && index < files.size())) {
            System.out.println("invalid index" +(files.size()-1));
        }
    }

    /** It takes an integer parameter and returns a boolean result.
     * It does not print anything, but returns true if the parameter’s 
     * value is a valid index for thecurrent state of the collection and false otherwise.
     */
    public boolean validIndex(int index){ 
        if (index >= 0 && index < files.size()){
            return true;
        }
         else {
             return false;
            }
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        
        if(validIndex(index)){ //internal variable
            
            String filename = files.get(index);
            System.out.println(filename);
        }
        else {
            System.out.println("invalid");
        }
        
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if (validIndex(index)){ //to make sure the position exist 
            files.remove(index);
        }
    }
    
    /** Implement the listAllFiles method in your version of the music-organizer project
     * 
     */
    public void listAllFiles(){
        int position = 0;
        for (String filename : files){
                System.out.println(position + ": " + filename);
                position++;
        }
        }
    }
    

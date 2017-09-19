import java.io.*;
import java.util.*;

/*
 *  NoteSystem Class
 */
public class NoteSystem {
 
  HashMap<String,Note> notes = new HashMap<String,Note>();
  
  // Constructor
  public NoteSystem(String directory) {
    System.out.println("Loading notes from directory: " + directory);
    File folder = new File(directory);
    File[] listOfFiles = folder.listFiles();
    for (int i = 0; i < listOfFiles.length; i++) {
      if (listOfFiles[i].isFile() && listOfFiles[i].getName().contains(".txt")) {
        Note note = new Note(listOfFiles[i]);
        notes.put(note.getName(),note);
      }
    }
  }
  
  // Generate report of notes containing one or more mentions
  public void report1() {
    System.out.println("Notes containing one or more mentions:");
    for (String noteName: notes.keySet()) {
      Note note = notes.get(noteName);
      if (note.hasMentions()) {
        System.out.println(noteName);
      }
    }
  }
  
  
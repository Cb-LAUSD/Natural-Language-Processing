import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicFileReader {
    public static List<String> eng_list = new ArrayList<>(); // the English Array List
    public static List<String> esp_list = new ArrayList<>(); // the Spansih Array List
    public static List<String> kor_list = new ArrayList<>(); // the Korean Array List
    public static List<String> arm_list = new ArrayList<>(); // the Armenian Array List
    public static List<String> ita_list = new ArrayList<>(); // the Italian Array List 


 // this function breaks up the file into 5 seperate Array Lists 
    public static void readFile() {
          String fileName = "translations.txt";
          try (Scanner scanner = new Scanner(new File(fileName))) {   //Allows program to move over a possible error found in the code. 
              while (scanner.hasNextLine()) {
                  String line = scanner.nextLine(); // Gets input from the Use and sets it equal to the variable line 
                  String[] words = line.split(","); // splits up the String from the text file into diefferent substrings based on commas 
                  eng_list.add(words[0].trim()); // Adds words from the first substring to the English Array List 
                  esp_list.add(words[1].trim()); // Adds words from the second substring to the Spanish Array List
                  kor_list.add(words[2].trim()); // Adds words from the third substring to the Korean Array List
                  arm_list.add(words[3].trim()); // Adds words from the fourth substring to the Armenian Array List
                  ita_list.add(words[4].trim()); // Adds words from the fifth substring to the Italian Array List
              }
        } catch (FileNotFoundException e) { // the part of the program that allows for the code to move over an error in the code if found
            System.out.println("Error reading the file: " + e.getMessage()); // Prints out an error method that 
        }
    } 


  
    // Getter Functions 
    public static List<String> getEngList() {
      return eng_list;
    }

    public static List<String> getEspList() {
      return esp_list;
    }

    public static List<String> getKorList() {
      return kor_list;
    }

    public static List<String> getArmList() {
      return arm_list;
    }

    public static List<String> getItaList() {
      return ita_list;
    }

}

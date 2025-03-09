import java.util.List;
import java.util.Scanner;



public class main{





    public static void main(String[] args){
        
        BasicFileReader.readFile(); //  reads file. 
       

        List<String> engList = BasicFileReader.getEngList(); // sets engList equal to the Enlish list
        List<String> espList = BasicFileReader.getEspList(); // sets espList equal to the Spanish list
        List<String> korList = BasicFileReader.getKorList(); // sets korList equal to the Korean list
        List<String> armList = BasicFileReader.getArmList(); // sets armList equal to the Armenian list
        List<String> itaList = BasicFileReader.getItaList(); // sets itaList equal to the Italian list


        String selectedLanguage=LanguageChecker.getLanguage(); // gets chosen language 
        String wordTranslate=LanguageChecker.getWord(); // Gets user word wanting to be translated
       


      for(int i = 0; i<engList.size(); i++){
          if(engList.get(i).compareTo(wordTranslate) == 0){  // compares the word chosen to all the words in the English Array List
       
              if(selectedLanguage.compareTo("Spanish") == 0){ // checks if user chose to translate to spanish
                System.out.println(espList.get(i));} 
              else if(selectedLanguage.compareTo("Korean") == 0){ // checks if user chose to translate to Korean
                System.out.println(korList.get(i));}
              else if(selectedLanguage.compareTo("Armenian") == 0){ // checks if user chose to translate to Armenian
                System.out.println(armList.get(i));}
                else if(selectedLanguage.compareTo("Italian") == 0){ // checks if user chose to translate to Italian
                System.out.println(itaList.get(i));}
                return;  // exits the method. 
            }           
          }
        
        System.out.println("word does not exist in the dictionary"); // If word does not exist it prints the error code. 

    }
  
}


  



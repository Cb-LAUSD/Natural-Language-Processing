import java.util.List;
import java.util.Scanner;




public class LanguageChecker {

    //  Returns true if the given String matches one of the valid languages.
    public static boolean checkLanguage(String lang) {
        switch (lang) {
            case "Spanish":
                return true;
            case "Korean":
                return true;
            case "Armenian":
                return true;
            case "Italian":
                return true;
            default:
                return false;
        }
    }

    // Keeps prompting until the user enters a valid language, then returns it.
    public static String getLanguage() {
        Scanner myObj = new Scanner(System.in); // Scanner object to gather User input 

 // Starts the user with an empty string
        String initLang = "";

        // Continues running the loop until !checkLanguage(intLang) is equal to true
        while (!checkLanguage(initLang)) {
            System.out.println("Pick a language you would like to translate to (caution: leading capitalization): (Spanish, Korean, Armenian, Italian)");
            initLang = myObj.nextLine(); // Reads the users input
        }

      // returns the valid selected language if checkLanguage(intLang) = true
        return initLang;
    }

    public static String getWord(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter an English word you would like to translate to:");
        String translateWord = myObj.nextLine(); // Reads the users input
        return translateWord.toLowerCase(); // returns the word we want to be translated in all lowercase form in order to match the txt file. 
    }
    

}

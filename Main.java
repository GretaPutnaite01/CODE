import uulib.Console;
import uulib.ArrayUtils;

public class Main {

    // Challenge question 1
    public static void countdown(int x) {
        // complete this method

        // creating an array
        char letters[] = { 'C','O','D','E'};

        // initialise with 0
        int arrayLetters = 0;                                           // initialise arrayLetters with 0 

        while (x > 0) {                                                 // ensure x is greater than 0
      
            System.out.println(x + " " + letters[arrayLetters]);        // print the number and the array letters with a new line

            x = x - 1;                                                  // decrement x by 1
            arrayLetters = arrayLetters + 1;                            // increment arrayLetters by 1

            if (arrayLetters == letters.length) {                       // if arrayLetters is equal to letters.length          
                arrayLetters = 0;                                       // initialise arrayLetters with 0
            }
        }
    }

    public static void question1() {
        // COMPLETE THIS METHOD

        int enterNumber = Console.getInt("Enter number: ");
        countdown(enterNumber);
    }

    public static void main(String[] args) {
        
        question1();
        
    }
}
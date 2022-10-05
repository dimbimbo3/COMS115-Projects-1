import java.util.Scanner;

public class VowelsConsonantsDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a string:");
        String user = input.nextLine();
        VowelsConsonants test = new VowelsConsonants(user);
        
        char choice = '.';
        
        while(choice != 'e' && choice != 'E'){
            System.out.println("Please select one of the following...");
            System.out.println("a. Count the number of vowels in the string");
            System.out.println("b. Count the number of consonants in the string");
            System.out.println("c. Count both the vowels and consonants in the string");
            System.out.println("d. Enter another string");
            System.out.println("e. Exit the program");
            System.out.print("Enter:");
            choice = input.nextLine().charAt(0);
            switch(choice){
                case 'a':
                case 'A':
                    System.out.println("\nThere are " + test.getVowels() + 
                            " vowels in the string.\n");
                    break;
                case 'b':
                case 'B':
                    System.out.println("\nThere are " + test.getConsonants() + 
                            " consonants in the string.\n");
                    break;
                case 'c':
                case 'C':
                    System.out.println("\nThere are " + test.getVowels() + " vowels "
                            + "and " + test.getConsonants() + " consonants " 
                            + "in the string.\n");
                    break;
                case 'd':
                case 'D':
                    System.out.print("\nPlease enter another string:");
                    user = input.nextLine();
                    test = new VowelsConsonants(user);
                    System.out.println("");
                    break;
                case 'e':
                case 'E':
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }
}

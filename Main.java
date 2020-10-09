import java.util.Scanner;
/**
 * Creata black jack game that tells you count after 5 cards are drawn
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to enter in 5 card values
    System.out.println("Please enter the value of 5 cards:");

    // create a constant for 5 spots in array
    final int NUMB_CARDS = 5;
    
    // create an array
    int[] cards = new int[NUMB_CARDS];

    // put values into the array using a loop
    for(int i = 0; i < NUMB_CARDS; i++){
      cards[i]= input.nextInt();
    }
    
  }
}

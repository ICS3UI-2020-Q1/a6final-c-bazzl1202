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

    // create count variable
    int count = 0;

    // put values into the array using a loop
    for(int i = 0; i < NUMB_CARDS; i++){
      cards[i]= input.nextInt();
    }
    
    // checks values to see if a one should be added or subtracted
    for(int i = 0; i < NUMB_CARDS; i++){
      if(cards[i] >= 2 && cards[i] <= 6){
        count++;
      } else if(cards[i] >= 10 && cards[i] <= 14){
        count--;
      } 
    }
    // tell the user the count
    System.out.println("The count would be " + count);
  }
}

import java.util.Scanner;
import java.util.Random;


class guessnumber
{
  public static void main(String []args)
  {
    System.out.println("Welcome to Guess Number.");
    int max = 10;
    Random rnobject = new Random();
    if (args.length > 0) {
      try{
        max = Integer.parseInt(args[0]);
      }
      catch(NumberFormatException e) {
          //We just want to prevent erroring out of the application.
      }
    }
    boolean exitNum = true;
    Scanner in = new Scanner(System.in);
    //game loop
    while(exitNum) {
      int myGuess = 0;
      int answer = rnobject.nextInt(max) + 1;
      //System.out.println("We guessed " + answer);
      System.out.println("Please enter a number between 1 through "+ max + ":");
      if (in.hasNextLine()) {
        try {
          String inputString = in.nextLine();
          myGuess = Integer.parseInt(inputString);
        } catch(NumberFormatException e) {
            myGuess = 0;
            System.out.println("You didn't enter an integer, try again.");
            continue;
          //  System.out.println("You broke me by not entering a proper number between 1 through " + max +".");
          //  break;
        }
      }
      System.out.println("You entered " + myGuess);
      if(myGuess==answer) {
        System.out.println("You guessed correctly.");
      }
      else {
        System.out.println("You did not guess " + answer);
      }
      //Game exit control;
      System.out.println("Would you like to play again? (Y/n)");
      String inputPlayAgain = in.nextLine();
      if(inputPlayAgain.equals("n")) {
        exitNum = false;
      } else {
        System.out.println("Playing again . . .");
      }
    }
    //end game loop
  }
}

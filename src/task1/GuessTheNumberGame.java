package task1;
import java.util.*;
class NumberGame {
    public int inputNumber;
    public int number;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    NumberGame() {
        Random rand = new Random();
        this.number = rand.nextInt(1, 101);
    }

    void getUserGuess() {
        System.out.println("Guess The Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }


    boolean checkGuess() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.println(" Congratulations! You guessed the number, it was " + number + " in " + noOfGuesses + " attempts!! ");
            return true;

        } else if (inputNumber < number) {
            System.out.println("Your guess is smaller than the number. Try again!");
        } else if (inputNumber > number) {
            System.out.println("Your guess is larger than the number. Try again!");
        }
        return false;
    }
}

public class GuessTheNumberGame {
    public static void main(String[] args) {
        NumberGame g = new NumberGame();
        boolean b = false;
        while (!b) {
            g.getUserGuess();
            b = g.checkGuess();
//            System.out.println(b);
        }
    }
}

import java.util.Random;
import java.util.Scanner;
class Game {
    public int number;
    public int inputnumber;
    public int noOfGuess;

    public int getNoOfGuess(){
        return noOfGuess;
    }

     public void setNoOfGuesses(int noOfGuess){
        this.noOfGuess = noOfGuess;
     }
     
     Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
     }

     void takeUserInput(){
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
     }
     
      boolean isCorrect (){
        noOfGuess++;
       

        if(inputnumber == number){
            System.out.format("Yes! You Guess the right %d/\n number and in it %d attemps" , noOfGuess , number);
            return true;

        } else if(inputnumber <  number){
            System.out.println("Too low......");
        } else {
            System.out.println("Too high....");
        }
        return false;
     }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrect();

        }
    }
    
}

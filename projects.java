import java.util.Scanner;
import java.util.Random;
//project 1
//Code for rock paper scissor
// public class projects {    
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter the number for: 0 Rock, 1 Paper, 2 Scissor");
//             int userInput = sc.nextInt();
//             Random r = new Random();
//             System.out.println("Your choice: "+userInput);
//             int computerInput = r.nextInt(3);
//             System.out.println("Computer choice: "+computerInput);
//             if(userInput==computerInput){
//                 System.out.println("Draw");
//             }
//             else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
//                 System.out.println("You Win! ");
//             }
//             else{
//                 System.out.println("You Lose! ");
//             }
//         } 
// }

//project 2
//Code of a game for predicting random number and match it with random compuraterised number
public class projects {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b){ 
        g.takeInput();
        b = g.isCorrectNumber();
        System.out.println(b);
        }
    }
}
class game{
    int number;
    int inputNumber;
    int guesses;
    game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    public void setguesses(){
        this.guesses = guesses;
    }
    public int getguesses(){
        return guesses;
    }

    void takeInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt(); 
    }
    boolean isCorrectNumber(){
        if(inputNumber==number){
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too Less: ");
        }
        else if(inputNumber>number){
            System.out.println("Too High: ");
        }
        return false;
    }
}

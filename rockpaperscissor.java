//project 1
import java.util.Scanner;
import java.util.Random;
//Code for rock paper scissor
//project 1
//Code for rock paper scissor
public class projects {    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number for: 0 Rock, 1 Paper, 2 Scissor");
            int userInput = sc.nextInt();
            Random r = new Random();
            System.out.println("Your choice: "+userInput);
            int computerInput = r.nextInt(3);
            System.out.println("Computer choice: "+computerInput);
            if(userInput==computerInput){
                System.out.println("Draw");
            }
            else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
                System.out.println("You Win! ");
            }
            else{
                System.out.println("You Lose! ");
            }
        } 
}

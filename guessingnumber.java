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
    int guesses = 0;
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
        guesses++;
        if(inputNumber==number){
            System.out.println("Yes u guessed it right: "+number);
            System.out.println("Number of attempts are: "+guesses);
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

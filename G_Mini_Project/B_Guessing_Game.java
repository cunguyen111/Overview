package Java_Basic_And_OOP.G_Mini_Project;
import java.util.Scanner;
import java.lang.Math;

public class B_Guessing_Game {
    public static void main(String[] args) {
        //Guessing game
        //Enable user enter a number from 1-10
        //If the user doesn't want to continue playing, enter 0 to end this game
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int human;
        System.out.println("---------------GUESSING GAME----------------");
        while(flag){
            int computer = (int)(Math.random() * 10 + 1);
            System.out.println();
            do{
                System.out.println("Enter a number from 1 to 10");
                System.out.print("Enter: ");
                if(sc.hasNextInt()){ //Ensure that the user enters a valid integer
                    human = sc.nextInt();
                    if(human > computer){
                        System.out.println("Try again, enter a smaller number");
                    }
                    else if(human < computer){
                        System.out.println("Try again, enter a larger number");
                    }
                    else{
                        System.out.println("Congratulation, you guessed correctly!");
                        flag = false;
                    }
                }
            } while(flag);
                
                System.out.println();
                System.out.println("Do you want to play again?|(Enter Y for Yes, Enter N for No)");
                System.out.print("Enter: ");
                char playAgain = sc.next().charAt(0);
                if(playAgain == 'Y'){
                    System.out.println();
                    System.out.println("Let's play again!!!");
                    flag = true;
                }
                else if(playAgain == 'N'){
                    System.out.println("HAVE A GOOD DAY, BRO!!!");
                    flag = false;
                }
            }
            sc.close(); //You should put the sc.close() in here
    }
}

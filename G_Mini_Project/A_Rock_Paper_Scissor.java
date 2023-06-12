package Java_Basic_And_OOP.G_Mini_Project;
import java.util.Scanner;
import java.lang.Math;

public class A_Rock_Paper_Scissor {
    public static void main(String[] args) {
        //Rock-Paper-Scissor Game
        Scanner sc = new Scanner(System.in);
        boolean flag = true; //We use this to break the loop
        int humanScore = 0, computerScore = 0;

        while(flag){
            System.out.println("------**********------**********------**********------");
            System.out.println();
            System.out.println("Enter \"1\" for rock | \"2\" for scissor | \"3\" for paper");
            int human = sc.nextInt();
            int computer = (int)(Math.random() * 3 + 1); //Random from 1 to 3
            char playAgain; //Press Y for Yes or N for No
            switch(human){
                case 1:
                    if(computer == 1){
                        System.out.println("Draw!!!");
                    }
                    else if(computer == 2){
                        System.out.println("You have won, congratulation!");
                        humanScore++;
                    }
                    else{
                        System.out.println("You have lost, try again!");
                        computerScore++;
                    }
                    break;
                case 2:
                    if(computer == 1){
                        System.out.println("You have lost, try again!");
                        computerScore++;
                    }
                    else if(computer == 2){
                        System.out.println("Draw!!!");
                    }
                    else{
                        System.out.println("You have won, congratulation!");
                        humanScore++;
                    }
                    break;
                case 3:
                    if(computer == 1){
                        System.out.println("You have won, congratulation!");
                        humanScore++;
                    }
                    else if(computer == 2){
                        System.out.println("You have lost, try again!");
                        computerScore++;
                    }
                    else{
                        System.out.println("Draw!!!");
                    }
                    break;
                default:
                    System.out.println();
                    System.out.println("Do you want to play again?");
                    System.out.println("Press \'Y\' for Yes | Press \'N\' for No");
                    playAgain = sc.next().charAt(0);
                    if(playAgain == 'Y'){
                        humanScore = 0;
                        computerScore = 0;
                        System.out.println("Let's start again!");
                        continue;
                    }
                    else if(playAgain == 'N'){
                        System.out.println();
                        System.out.println("-----------------------*");
                        System.out.println("Your score: " + humanScore + "          *");
                        System.out.println("Your opponent score: " + computerScore + " *");
                        System.out.println("-----------------------*");
                        System.out.println();
                        flag = false;
                        sc.close();
                    }
                    break;
            }
            System.out.println();
            System.out.println("------**********------**********------**********------");
            System.out.println();
        }
    }
}

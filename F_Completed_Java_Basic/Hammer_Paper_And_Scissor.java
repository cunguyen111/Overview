import java.util.Scanner;
import java.lang.Math;

public class Hammer_Paper_And_Scissor {
    /*Trong dự án này, chúng ta sẽ tạo một trò chơi oẳn tù tì đơn giản.

Cách chơi
Cách chơi trò oẳn tù tì:

Bao gồm hai người chơi.
Mỗi người chơi có thể chọn kéo hoặc búa hoặc bao.
Nếu hai người chơi ra cùng một hình, đó là một trận hòa.
Tuy nhiên, nếu hai người chơi chọn các hình khác nhau, một người thắng và người kia sẽ thua. Quy tắc như sau:

1. búa - kéo: búa thắng (búa đập kéo)

2. búa - bao: bao thắng (bao vây búa)

3. kéo - bao: kéo thắng (kéo cắt bao)

Cách chương trình hoạt động:

Trò chơi được chơi giữa máy tính và người dùng.
Máy tính chọn ngẫu nhiên kéo hoặc búa hoặc bao. Người dùng sẽ không biết máy tính chọn hình gì.
Người dùng được yêu cầu chọn kéo hoặc búa hoặc bao.
So sánh lựa chọn của máy tính với lựa chọn của người dùng và quyết định người dùng thắng hoặc thua hoặc hòa. */

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int countHuman = 0, countComputer = 0;
        while(flag){
            System.out.println("Please choose: \"1\" for rock, \"2\" for scissor, \"3\" for paper, \"0\" for reset!");
            int human = sc.nextInt(); //Enable user input 
            int computer = (int)(Math.random() * 3 + 1);
            switch(human) {
                case 1:
                    if(computer == 1) {
                        System.out.println("Draw!");
                    } else if(computer == 2) {
                        System.out.println("Congratulations!!! You won<3");
                        countHuman++;
                    } else {
                        System.out.println("Oh no, you lost. Try again!!!");
                        countComputer++;
                    }
                    break;
                case 2:
                    if(computer == 1) {
                        System.out.println("Oh no, you lost. Try again!!!");
                        countComputer++;
                    } else if(computer == 2) {
                        System.out.println("Draw!");
                    } else {
                        System.out.println("Congratulations!!! You won<3");
                        countHuman++;
                    }
                    break;
                case 3:
                    if(computer == 1) {
                        System.out.println("Congratulations!!! You won<3");
                        countHuman++;
                    } else if(computer == 2) {
                        System.out.println("Oh no, you lost. Try again!!!");
                        countComputer++;
                    } else {
                        System.out.println("Draw!");
                    }
                    break;
                default:
                    System.out.println("Do you want to play again? (\"Y\" for Yes, \"N\" for No)");
                    char playAgain = sc.next().charAt(0);
                    if(playAgain == 'Y'){
                        countHuman = 0; // Reset value of countHuman
                        countComputer = 0; // Reset value of countComputer
                        continue;
                    } else if(playAgain == 'N'){
                        System.out.println("Your score is: " + countHuman);
                        System.out.println("Opponent score is: " + countComputer);
                        System.out.println("Have a good day!!!");
                        flag = false;
                        sc.close();
                    }
                    break;
            }
        }
    }
}

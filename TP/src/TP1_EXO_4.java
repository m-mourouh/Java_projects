import java.util.Scanner;

public class TP1_EXO_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (10 * Math.random());
        int userNumber;
        int i = 0 ; //iterations
        do {
            System.out.println("Enter an integer btw 0 and 10 : ");
            userNumber = scanner.nextInt();
            i++;
        }while(userNumber != randomNumber);
        System.out.println("Congrats: you found the random number which is " + randomNumber + ", after " + i + " tries");
    }
}

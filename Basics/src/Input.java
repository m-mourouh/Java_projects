import java.util.*;
public class Input {
    public static void main(String[] args) {
        final int pinCode = 1234;
        int tries = 0 ;
        for(int i = 0; i < 3;i++){
            System.out.println("Please enter your pin code");
            Scanner scanner = new Scanner(System.in);
            int userPinCode = scanner.nextInt();

            if(userPinCode != pinCode){
                System.out.println("Invalid pin code \n" + (3 - (i + 1)) + " tries remains!");
            }else {
                break;
            }
            tries++;
        }
        if(tries == 3) System.out.println("Your device is blocked! ):");
        else  System.out.println("Valid pin Code :)");

    }
}

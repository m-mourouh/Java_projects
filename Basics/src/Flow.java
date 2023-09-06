import java.text.NumberFormat;
import java.util.Scanner;

public class Flow {
    public static void main(String[] args) {
        //if statements
        Scanner scanner = new Scanner(System.in);
        int income = scanner.nextInt();
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        if(income > 1000000) {
            System.out.println("Your income is " + currency.format(income) +  " so you are a rich person :)");
        }else if(income > 1000 && income < 1000000) {
            System.out.println("Your income is " + currency.format(income) +  " so you are a normal person ~)");
        }else {
            System.out.println("Your income is " + currency.format(income) +  " so you are a poor person ):");
        }

        //Switch
        //For loop
        //While loop
        //Do while loop
        //For each loop
        int[] numbers = {1,2,3,4,5,6,8,9,10};
        for (int number : numbers){
            System.out.println(number);
        }
    }

}

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] t = new double[5];
        for(int i = 0; i < t.length; i++){
            System.out.println("Enter t[" + i + "] : \t");
            t[i] = scanner.nextDouble();
        }
        System.out.println("Min = " + min(t));
        System.out.println("Max = " + max(t));
        System.out.println("Avg = " + avg(t));

    }
    public static double min(double[] t ){
        double min = Arrays.stream(t).min().getAsDouble();
        return min;
    }
    public static double max(double[] t ){
        double max = Arrays.stream(t).max().getAsDouble();
        return max;
    }
    public static double avg(double[] t ){
        double avg = Arrays.stream(t).average().getAsDouble();
        return avg;
    }
}
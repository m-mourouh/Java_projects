import java.util.Scanner;

public class TP1_EXO_3 {
    public static void main(String[] args) {
        String sentence;
        String seq;
        String chunk;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        sentence = scanner.nextLine();
        //toUperCase
        System.out.println(sentence.toUpperCase());
        //replace a with * in the setence
        System.out.println(sentence.replace("a", "*"));
        //find a match

        if (sentence.length() >= 12) {
            System.out.println("Enter your sequence: ");
            seq = scanner.nextLine();
            chunk = sentence.substring(4, 12);
            System.out.println(chunk);
            if (chunk.contains(seq)) {
                System.out.println("Yes: " + chunk + " contains " + seq);
            } else {
                System.out.println("No: " + chunk + " doesn't contains " + seq);
            }
        }
    }
}
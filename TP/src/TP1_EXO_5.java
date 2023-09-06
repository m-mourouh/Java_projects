public class TP1_EXO_5 {
    public static void main(String[] args) {
        Point A = new Point('A',25);
        Point B = new Point('B',35);
        System.out.println(A);
        System.out.println(B);
        A.translate(10);
        //After translation
        System.out.println(A);
    }
}

public class Variables {
    public static void main(String[] args){
        //Primitive Types: 8 => byte, short, int, long, float, double, char, boolean (store value)
        byte myByte = 12;  // -128 to 127
        int n = 12 ;
        long l = 156698452658L;
        double d = 17.8;  // 15 decimal digits
        float f = 18.07F; // 6 decimal digits
        char c = 'A';
        boolean isActive = true;
        //Reference types: String, arrays...  => store reference (@add) in the memory and need memory location with new keyword
        int[] t  = new int[2];
        t[0] = 1;
        t[1] = 2;
       // multi-dimensional arrays
        int[][] matrix = {
                {1,2,3}, {1,2,3}, {1,2,3}, {1,2,3},
        };
        //Strings
        String name = "James Gosling";
        int length = name.length();
        String nameUpper = name.toUpperCase();
        String nameLower = name.toLowerCase();
        //Casting
        //1. implicit casting : happens when we try to store small value in large data type
        short x = 1 ;
        int y = x ;  //implicitly cast x to integer bcz  int is larger than short
        //2. explicit casting : manual casting
        int i = 10;
        short v = (short) i;

        //Constant or final variables (final) => use CAPITAL_LETTERS
        final double INTEREST_RATE = 0.5;

    }
}

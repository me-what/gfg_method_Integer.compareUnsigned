public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(Integer.compareUnsigned(a, b));

        int x = 28;
        int y = 28;
        System.out.println(Integer.compareUnsigned(x, y));

        int w = 15;
        int z = 8;
        System.out.println(Integer.compareUnsigned(w, z));


        int m = 15;
        int n = -8;
        System.out.println(Integer.compareUnsigned(m, n)+"\n");


        int x2 = -100;
        int y2 = 200;
        System.out.println(Integer.compareUnsigned(x2, y2));

        int result = Integer.compareUnsigned(x2, y2);
        if (result < 0) {
            System.out.println(
                    "x is less than y"); // print statement
        }
        else if (result > 0) {
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("x is equal to y");
        }
    }
}
public class Count {

    public static void main(String []args) {
        System.out.println(divideByTwo(1));
        System.out.println(divideByTwo(2));
        System.out.println(divideByTwo(4));
        System.out.println(divideByTwo(8));
        System.out.println(divideByTwo(16));
        System.out.println(divideByTwo(32));
        System.out.println(divideByTwo(64));
    }

    public static int divideByTwo(int n) {
        int countIterations = 0;
        while (n > 1) {
            n = n / 2;
            countIterations++;
        }
        return countIterations;
    }

}
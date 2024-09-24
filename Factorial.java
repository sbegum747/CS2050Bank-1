public class Factorial {

    public static void main(String[] args) {

        final double BILLION = 1_000_000_000;
        int n = 25;

        long begin = System.nanoTime();
        System.out.println(iterativeFactorial(n));
        long stop = System.nanoTime();
        long totalTime = stop - begin;

        double elapsedTimeInSecond = totalTime / BILLION;
        System.out.println("Total time for " + n + " stack frames in recursive factorial: " +
                elapsedTimeInSecond + " seconds.");

        begin = System.nanoTime();
        System.out.println(recursiveFactorial(n));
        stop = System.nanoTime();
        totalTime = stop - begin;

        elapsedTimeInSecond = totalTime / BILLION;
        System.out.println("Total time for " + n + " iterations in iterative factorial: " +
                elapsedTimeInSecond + " seconds.");
    } // end of main method

    public static long iterativeFactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static long recursiveFactorial(int n) {
        if (n < 0) {
            System.out.println("Error: n less than or equal to zero. Exiting...");
            System.exit(1);
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }
}
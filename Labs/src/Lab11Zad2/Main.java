public class Main {

    static int[] array;
    static int x = 0;
    static int iteracji = 100;

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < 3; i++) {
            System.out.println("\n---Test for " + iteracji + " iterations...");
            tryCatchTestArrayMinus();
            throwTestArrayMinus();

            System.out.println();
            tryCatchTestArrayOutOfBound();
            throwTestArrayOutOfBound();

            System.out.println();
            tryCatchTestDivideOnZero();
            throwTestDivideOnZero();
            iteracji = iteracji * 10;
        }
    }

    public static void throwTestArrayMinus() {
        long t;
        t = System.nanoTime();
        for (int i = 0; i < iteracji; i++) {
            try {
                exceptionThrowsArrayMinus();
            } catch (Exception e) {
            }
        }
        t = System.nanoTime() - t;
        System.out.printf("ThrowTestArrayMinus    took %20d ns\n", t);
    }

    private static void exceptionThrowsArrayMinus() throws NegativeArraySizeException{
            array = new int[-10];
    }

    public static void tryCatchTestArrayMinus() {
        long t;
        t = System.nanoTime();
        for (int i = 0; i < iteracji; i++) {
            try {
                exceptionTryCatchArrayMinus();
            } catch (NegativeArraySizeException e) {
            }
        }
        t = System.nanoTime() - t;
        System.out.printf("tryCatchTestArrayMinus took %20d ns\n", t);
    }

    private static void exceptionTryCatchArrayMinus() {
        try {
            array = new int[-10];
        } catch (NegativeArraySizeException e) {
        }
    }

    public static void throwTestArrayOutOfBound() {
        long t;
        t = System.nanoTime();
        for (int i = 0; i < iteracji; i++) {
            try {
                exceptionThrowsArrayOutOfBound();
            } catch (Exception e) {
            }
        }
        t = System.nanoTime() - t;
        System.out.printf("ThrowTestArrayOutOfBound    took %20d ns\n", t);
    }

    private static void exceptionThrowsArrayOutOfBound() {
        int[] x = new int[10];
        x[10] = 7;
    }

    public static void throwTestDivideOnZero() {
        long t;
        t = System.nanoTime();
        for (int i = 0; i < iteracji; i++) {
            try {
                exceptionThrowsDivideOnZero();
            } catch (Exception e) {
            }
        }
        t = System.nanoTime() - t;
        System.out.printf("ThrowTestDivideOnZero    took %20d ns\n", t);
    }

    private static void exceptionThrowsDivideOnZero() {
        int x = 3 / 0;
    }

    public static void tryCatchTestDivideOnZero() {
        long t;
        t = System.nanoTime();
        for (int i = 0; i < iteracji; i++) {
            try {
                exceptionTryCatchTestDivideOnZero();
            } catch (Exception e) {
            }
        }
        t = System.nanoTime() - t;
        System.out.printf("tryCatchTestDivideOnZero took %20d ns\n", t);
    }

    private static void exceptionTryCatchTestDivideOnZero() {
        try {
            int x = 3 / 0;
        } catch (Exception e) {
        }
    }


    private static void tryCatchTestArrayOutOfBound() {

        long t;
        t = System.nanoTime();
        for (int i = 0; i < iteracji; i++) {
            try {
                exceptionTryCatchArrayOutOfBound();
            } catch (Exception e) {
            }
        }
        t = System.nanoTime() - t;
        System.out.printf("tryCatchTestArrayOutOfBound took %20d ns\n", t);
    }

    private static void exceptionTryCatchArrayOutOfBound() {
        int[] y = new int[10];
        try {
            y[10] = 7;
        } catch (Exception e) {
        }
    }
}
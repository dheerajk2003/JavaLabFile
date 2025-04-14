class ExceptionHandling {

    public static int Divide() {
        int a = 10, b = 0, c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
            System.out.println("Caught in Divide(): " + e.getMessage());
            b = b + 1;
            c = a / b;
        } finally {
            return c;  // finally is always executed
        }
    }

    public static int Divide2() throws ArithmeticException {
        int a = 10, b = 0;
        if(b == 0)
            throw new ArithmeticException("Divide by zero");
        return a / b;  // This will throw ArithmeticException
    }

    public static void main(String args[]) {
        System.out.println("Result of Divide(): " + Divide());

        try {
            System.out.println("Result of Divide2(): " + Divide2());
        } catch (ArithmeticException e) {
            System.out.println("Caught in main(): " + e.getMessage());
        }
    }
}
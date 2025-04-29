public class Calculator {
    public static void main(String[] args){

        double a=12;
        double b=27;
        System.out.println("Addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplication "+(a*b));
        System.out.println("Division "+(a/b));

        // Calculate square root
        System.out.println("Square root of a: " + Math.sqrt(a));
        System.out.println("Square root of b: " + Math.sqrt(b));

        // Calculate cube root
        System.out.println("Cube root of a: " + Math.cbrt(a));
        System.out.println("Cube root of b: " + Math.cbrt(b));

        // Calculate power (a^b and b^a)
        System.out.println("a raised to the power b: " + Math.pow(a, b));
        System.out.println("b raised to the power a: " + Math.pow(b, a));


    }
}


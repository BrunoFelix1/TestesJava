package upe.br.sobreGitTestes;

public class MatematicaBasica {
    public static void main( String[] args ) {
        int num1 = 13;
        int num2 = 17;
        System.out.println( num1 + " + " + num2 + " = " + add(num1, num2) );
        System.out.println( num1 + " - " + num2 + " = " + subtract(num1, num2) );
        System.out.println( num1 + " * " + num2 + " = " + multiplicate(num1, num2) );
        System.out.println( num1 + " / " + num2 + " = " + divide(num1, num2) );
        System.out.println( num1 + " % " + num2 + " = " + mod(num1, num2) );
        System.out.println( num1 + " ^ " + num2 + " = " + exponent(num1, num2) );
    }

    public static int add (int a, int b) {
        return a+b;
    }

    public static int subtract (int a, int b) {
        return a-b;
    }

    public static int multiplicate (int a, int b) {
        return a*b;
    }

    public static int divide (int a, int b) {
        return a/b;
    }

    public static int mod (int a, int b) {
        return a%b;
    }

    public static int exponent(int a, int b) {
        return (int) Math.pow(a, b);
        }

}

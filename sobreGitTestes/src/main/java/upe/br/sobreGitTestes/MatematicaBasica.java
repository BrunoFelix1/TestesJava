package upe.br.sobreGitTestes;

public class MatematicaBasica {
    public static void main( String[] args ) {
        int num1 = 13;
        int num2 = 17;
        System.out.println( num1 + " + " + num2 + " = " + add(num1, num2) );
    }

    public static int add (int a, int b) {
        return a+b;
    }
}

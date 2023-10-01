//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
package Guia5;

public class E3 {

    public static void main(String[] args) {

        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10110);
        }
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        for (int i : vector) {
            num = Integer.toString(i).length();
            switch (num) {
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                    break;
                case 5:
                    num5++;
                    break;
            }

        }
        System.out.println("Números de 1 digito:  " + num1);
        System.out.println("Números de 2 digitos: " + num2);
        System.out.println("Números de 3 digitos: " + num3);
        System.out.println("Números de 4 digitos: " + num4);
        System.out.println("Números de 5 digitos: " + num5);
    }

}

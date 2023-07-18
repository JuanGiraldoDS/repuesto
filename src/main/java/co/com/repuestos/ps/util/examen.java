package co.com.repuestos.ps.util;

public class examen {
    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros
        int[] numeros;
        numeros = new int[5];


        // Asignación de valores a los elementos del arreglo
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        for (int i = 4; i < numeros.length; i--) {
            System.out.println("Elemento en la posición 0: " + numeros[0]);
        }
    }
}



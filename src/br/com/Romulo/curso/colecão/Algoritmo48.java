package src.br.com.Romulo.curso.colecão;
 
public class Algoritmo48 {
    public static void main(String[] args) {

        int[][] matriz = {
            {20, 50, 80},
            {45, 60, 90},
            {45, 67, 89}
        };

        IO.println("Diagonal principal:");

        for (int i = 0; i < 3; i++) {
            IO.println(matriz[i][i]);
        }
    }
}
    //Considere  a matriz quadrada
    /*
    20,50,80
    45,60,90
    45,67,89
     */
    //faca um algoritmo que mostre os valores
    //da diagonal principal.


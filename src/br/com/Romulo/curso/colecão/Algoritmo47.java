package src.br.com.Romulo.curso.colecão;

public class Algoritmo47 {
    
      public static void main(String[] args) {

        int[] valores = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            IO.println("Digite o " + (i + 1) + "º valor:");
            valores[i] = Integer.parseInt(IO.readln());
            soma += valores[i];
        }

        double media = soma / 10.0;

        IO.println("A média dos valores é: " + media);
    }
}
    //Faça um vetor que armazene 10 valores inteiros
    //IO.println()  IO.readln()
    //imprime a média so valores.


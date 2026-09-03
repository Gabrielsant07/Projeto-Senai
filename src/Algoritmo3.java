public class Algoritmo3 {

    void main() {

        // números inteiros de 0 a 100
        int nota1, nota2, nota3;

        // média é real (double)
        double media;

        // operadores: +, -, *, /, %

        // ENTRADA DAS NOTAS DOS ALUNOS
        nota1 = Integer.parseInt(IO.readln("Digite a primeira nota: "));
        nota2 = Integer.parseInt(IO.readln("Digite a segunda nota: "));
        nota3 = Integer.parseInt(IO.readln("Digite a terceira nota: "));

        // SOMA DAS NOTAS
        int soma = nota1 + nota2 + nota3;

        // MÉDIA DAS NOTAS
        media = soma / 3.0;

        // SAÍDA DAS NOTAS, SOMA E MÉDIA
        IO.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        IO.println("Soma: " + soma);
        IO.println("Média: " + media);
    }
}
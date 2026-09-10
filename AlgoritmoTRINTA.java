public class AlgoritmoTRINTA {

  public static void main(String[] args) {

    AlgoritmoTRINTA alg = new AlgoritmoTRINTA();

    for(int i = 0; i <= 10; i++) {

     long resultado = alg.calcularFatorial(i);

      System.out.println("Fatorial de " + i + " é: " + resultado);
    }
  }

    public long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
        return 1;
        } else {
        return numero * calcularFatorial(numero - 1);
        }
    }
    int[] numeros = new int[10];
}

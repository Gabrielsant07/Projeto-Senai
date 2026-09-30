package src.br.com.Romulo.curso.arquivo;

public class Algoritmo50 {
    void main(){

        try{
            int idade = Integer.parseInt(
                         IO.readln("Qual a sua idade"));
                         String resultado =(idade>=18)?"maior" : "menor";
                         IO.print(resultado);
        }catch(NumberFormatException e){
            IO.println("😎😎" + e.getMessage()+"Valor inválido.digite um número");
        }finally{

            IO.println("😎- Encerramento SystemSys!");
        }
    }
}

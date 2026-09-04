 public class AlgoritmoQUATRO {
    public static void main(String[] args){
        //Qual é os dias da semana atualmente?
        int dias = Integer.parseInt(IO.readln("Digite os dias atuais (1 a 7):"));
        IO.println("Os dias atuais da semana é" + dias);
        switch (dias) {
            case 1:
                IO.println("segunda-feira");
                break;
            case 2:
                IO.println("terça-feira");
                break;
            case 3:
                IO.println("quarta-feira");
                break;
            case 4:
                IO.println("quinta-feira");
                break;
            case 5:
                IO.println("sexta-feira");
                break;
            case 6:
                IO.println("sabado");
                break;
            case 7:
                IO.println("domingo");
                break;                  
            default:
                IO.println("dia invalido");
                break;
        }
    } 
}

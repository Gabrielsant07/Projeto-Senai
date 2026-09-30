package src.br.com.Romulo.curso.colecão;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo46 {
    
    public void main(){

        //List (Lista) - 100,40,50,56
        //Dictionary (Dicionário) - 100:Maria,40:Jp,50:Daniel,56:Cassio
        //Pesquisa
        /*
          GPT ou Google (Collections Java)
          4 Interfaces
          4 Classes
    
        */
       //ArrayList implementa List(lista)
       //HashSet implementa set

       List<String> frutas = new ArrayList<>();

       frutas.add("Goiaba");
       frutas.add("Amora");
       frutas.add("Melancia");
       frutas.add("Mamão");

       IO.println("primeira fruta:"+frutas.get(0));
       frutas.set(1, "Uva");
       for(String fruta:frutas){
        IO.println("elemento"+frutas);
       }
       IO.println("total de frutas"+frutas.size());
       frutas.remove("Mamão");
       IO.println("total de frutas"+frutas.size());
       IO.println("Lista"+frutas);
       frutas.add("Laranja");
       frutas.add("Morango");
       IO.println("Lista"+frutas);
       frutas.remove(1);
       IO.println("lista"+frutas);
       

    }
}

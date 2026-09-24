package src;

import java.util.ArrayList;
import java.util.List;


public class Algoritmo42 {
    
    public void main(){
        //Java 5
        //James Gosling
        //Coleção/Coleções (figurinhas)
        //Collections
        //Antes do Java 5 - Calça normal
        //A partir do Java 5- Calça Lycra
        //Primeira voz (Bruno):interface (contrato)
        //Segunda voz (Marrone): Classe (implementa)
        List<String> linguagens = 
          List.of("Rust","Python","GO","Java","C","C++","C#");
        for(String linguagem:linguagens){
            IO.println(linguagens);
        }
    }
}

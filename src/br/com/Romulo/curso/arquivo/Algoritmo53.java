package src.br.com.Romulo.curso.arquivo;
import java.util.HashMap; //Pacote
import java.util.Map; //pacote
//pacote e util
//classe ou interface dentro do pacote
/*
   um pacote e um cojunto de classe e ou interfaces.
   
   voce pode criar o seu pacote*/
public class Algoritmo53 {

    void main(){
        //Aurelio (dicionario)
        //chave - valor
        //manga - "fruta tropical"
        //teclado -"instrumento musical"
        //java - "arquipelago na indonesia"
        //Dictionary - dicionario
        //JSON - (chave, valor) - javascript
        //dictionary (absoleta) - legado
        //Map<String, Aluno> dicionarioAlunos = new hashMap();
        //Generics - definir qualquer tipo <T> - generico
        // toda a classe object

        Map<String, Estudante> estudantes =new HashMap<>();

    IO.println("Java Doctor - Escola de Programação");    
    Estudante e1 =new Estudante ("jp","ADS", 2025);
    estudantes.put("MAT-1223", e1);
    Estudante e2 = new Estudante("Elias", "Ciência da Computação", 2023);
    estudantes.put("MAT-1234", e2);
    Estudante e3 = new Estudante("Daniel", "Publicidade e Propagando", 2023);
    estudantes.put("MAT-1345", e3);
    Estudante e4 = new Estudante("Cassio", "ADS", 2015);
    estudantes.put("MAT-1456", e4);
    Estudante e5 = new Estudante("Natalia", "ciêcia da Computação", 2027);
    estudantes.put("MAT-1567", e5);
    Estudante e6 = new Estudante("Maria Eduarda", "ADS", 2028);
    estudantes.put("MAT-1678", e6);
    Estudante e7 = new Estudante("Julio cesar", "TSI", 2028);
    estudantes.put("MAT-1789", e7);
    Estudante e8 = new Estudante("Gabriel I", "AutodiData", 2028);
    estudantes.put("MAT-1890", e8);
    Estudante e9 = new Estudante("fabio pio", "Marketing", 2026);
    estudantes.put("MAT-1990", e9);
    Estudante e10 = new Estudante("Carlos", "ADS", 2016);
    estudantes.put("MAT-1200", e10);
    Estudante e11 = new Estudante("Gabriel II", "Engenharia de software", 2028);
    estudantes.put("MAT-1333", e11);
    Estudante e12 = new Estudante("Thalita", "ADS", 2026);
    estudantes.put("MAT-1444", e12);
    estudantes.put("MAT-5555", new Estudante("Romulo","GTI", 2012));

    //listar todos os estudantes cadastrados
    for(Estudante e : estudantes.values()) {
        IO.println(e);
    }

    //Buscar um estudate pela matricula
    //listar todos os estudantes com a matricula

    for (String matricula : estudantes.keySet()) {
        Estudante e = estudantes.get(matricula);
        IO.println(matricula +"->" + e);

        //Buscar pela matricula
        IO.println("digite a matricula");
        String busca;
    }

    
}
    
}
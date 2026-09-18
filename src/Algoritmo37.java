package src;

public class Algoritmo37 {
    void main(){
        /*
        Exemplo Didátíco
        -Herança
        -super()
        -Redefinição do construtor
        -Polimorfismo
        -Sobrescrita (overvide)
        -Sobrecarga

        
         */
        Cachorro c =new Cachorro("Gracinha",
                                  "auau.mp3");
        IO.println("nome:"+c.getNome());                          
        c.comer();
        c.tocarSom();
        
        Gato g = new Gato ("Bicho",
            "miau.mp3");
        IO.println("nome:"+g.getNome());
        g.comer();
        g.tocarSom();
    }
}

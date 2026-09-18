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
                                  "latido.waw");
        IO.println("nome:"+c.getNome());                          
        c.comer();
        c.tocarSom();
        
        Gato g = new Gato ("Bicho",
            "miado.waw");
        IO.println("nome:"+g.getNome());
        g.comer();
        g.tocarSom();

        Porco p = new Porco ("Aura porco",
            "porco.waw");
        IO.println("nome:"+p.getNome());
        p.comer();
        p.tocarSom();
    }
}

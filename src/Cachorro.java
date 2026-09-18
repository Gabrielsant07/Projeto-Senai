package src;

public class Cachorro extends Animal {

    public Cachorro(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
       IO.println("Racao Camil pra Caes");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
       IO.println("tocando auau.mp3");
    }
    
}
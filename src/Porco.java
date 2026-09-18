package src;

public class Porco  extends Animal{
    

    public Porco(String nome, String arquivoSom) {
        super(nome, arquivoSom);
       
    }

    @Override
    public void comer() {
       IO.println("bicho");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
       IO.println("porco.waw");  
    
    }
}


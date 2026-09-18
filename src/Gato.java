package src;

public class Gato extends Animal {

    public Gato(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
       IO.println("Miau Milk pra gatos");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
       IO.println("miado.waw");  
    
    }
}
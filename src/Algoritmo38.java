package src;

import javax.swing.JOptionPane;

public class Algoritmo38 {
    public void main(){
     JOptionPane.showMessageDialog( null ,  "Agencia Senaicar");
     Carro c = new Carro("DGE-5678",220,"Hibrido Flex", "Azul" , 4);
     JOptionPane.showMessageDialog( null,c.getPlaca());
     JOptionPane.showMessageDialog(null,c.getCor());
     JOptionPane.showMessageDialog(null,c.getTipoCombustivel());
     JOptionPane.showMessageDialog(null,c.getNumPortas());
     JOptionPane.showMessageDialog(null,c.getVelocidadeMax());
     c.mover();
    }
}


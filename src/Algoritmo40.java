package src;

class Algoritmo40 {

    public void main(){
        // vetor - matriz unidmensional
        //acadêmico - progranação simples básico
        /*
        tabela - matriz bidimensional
        //banco de dados, planilha Excel

        3D - matriz tridimensional
        // Cinema, Séries, Desenho, Animações, Games
        // AutoCAD , Revit, Sketchup
        // Humanoide - Software 3D Simulação
        // Minecraft X, Y e Z (jogar)
        */
        // Vetor ou matriz unidimesional
        // https:// www.somatematica.com.br/emedio/matrizes/ma
        // matriz linha ou matriz coluna
        //            0 1 2  3 4
       int[] notas = {7,9,5,10,6};
       int maior = notas [0];
       IO.println(maior);
       // Muitos util para Big Data
       for(int i=1; i<notas.length;i++){
        if (notas[i] > maior){
            maior = notas[i];
        }
       }
       IO.println("Maior nota:"+maior); 
    
    }
    
}
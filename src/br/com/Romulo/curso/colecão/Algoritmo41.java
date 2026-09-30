package src.br.com.Romulo.curso.colecão;

public class Algoritmo41 {
    
    public void main(){
        //matrizes
        //matrizes bidimensional (2D)
        //3 linhas e 2 colunas = 3x2
        //2x2(matriz quadrada)- mesma qtde de L,C
        int[][] m ={{21,25},{33,35}            
        };
        int soma=0;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                soma += m[i][j];
            }
        }
        IO.print(soma);
    }
}

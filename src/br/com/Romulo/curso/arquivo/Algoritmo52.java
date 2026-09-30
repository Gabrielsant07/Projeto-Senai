package src.br.com.Romulo.curso.arquivo;

import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; // data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
      
    void main(){

         int r = 0; //1 - continuar o loop 0 - sair do loop
         do{// inicio do loop

            // O formato do carimbo; dia/més/ano  as horas:minutos:segundos
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            //codigo para mostrar a mensagem para o usuario
            
            //amanha - manipular aqui...
            IO.print("Digite uma dúvida?");
            //É uma variavel para amazenar a duvida.
            String duvida= IO.readln();
            // caribom capturado no momento do registro
            // Hora do sistema
            String carimbo = LocalDateTime.now().format(formato);//Dia:Mes:Ano:Horas:Minutos:Segundos
            
            
            try(FileWriter arquivo = new FileWriter("registro.txt", true)) {
                arquivo.write("[" + carimbo + "] " + duvida + "\n");
                IO.println(" Registrado: [" +carimbo + "]" + duvida);
                IO.println("Deseja registrar nova mensagem 1-sim 0-não: ");
                r = Integer.parseInt(IO.readln());
             }catch(IOException e){
               IO.println("Erro ao salvar a sua duvida:" + e.getMessage());
             }

            IO.println("adicionar msg:1 [sim] 0[nao]");
            r = Integer.parseInt(IO.readln());

         }while(r==1);
    }
    

    
}
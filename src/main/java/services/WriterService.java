
package services;

import domain.Log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterService {
    
    public static void novoLog (Log log, String caminho){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho, true))){
            writer.write(log.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Arquivo inexistente");
        }
    }
    
}

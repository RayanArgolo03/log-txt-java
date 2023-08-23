package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CounterService {

    public static int countLines(String caminho){
        int count = 0;
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            while (leitor.readLine() != null){
                count++;
            }
        } catch (IOException e) {
            System.out.println("Arquivo inexistente!");
        }
        return count;
    }

}

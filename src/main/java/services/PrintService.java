
package services;

import exceptions.*;

public class PrintService {
    
    public static void printCount (int count){
        if (count == 0) throw new PrinterException("Não existem logs!");
        System.out.println();
        System.out.println("Quantidade de acessos ao site: " +count);
    }
    
}

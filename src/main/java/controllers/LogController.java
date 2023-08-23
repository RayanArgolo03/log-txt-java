
package controllers;

import domain.Log;
import domain.Usuario;
import java.time.LocalDateTime;


public class LogController {
    
    private static LogController instancia;

    private LogController() {}
    
    public static LogController getInstance(){
        if (instancia == null) instancia = new LogController();
        return instancia;
    }
    
    
    public Log gerarLog (Usuario usuario){
        return new Log(usuario.getNome(), LocalDateTime.now());
    }
    
}

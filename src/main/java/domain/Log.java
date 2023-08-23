
package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
 
    private String nomeUsuario;
    private LocalDateTime instanceAcesso;

    public Log(String nomeUsuario, LocalDateTime instanceAcesso) {
        this.nomeUsuario = nomeUsuario;
        this.instanceAcesso = instanceAcesso;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public LocalDateTime getInstanceAcesso() {
        return instanceAcesso;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String instante = dtf.format(instanceAcesso);
        return nomeUsuario + ", acessou às" +instante;
    }
}

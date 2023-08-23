
package services;

import domain.Usuario;
import exceptions.UsuarioException;
import java.util.Scanner;


public class UsuarioService {
    
    public Usuario novoUsuario(){

        System.out.print("Digite nome do usuário: ");
        String nome = new Scanner(System.in).next();
        
        if (!nomeValido(nome)) throw new UsuarioException("Nome inválido! Apenas caracteres alfabéticos!");
        nome = formatarNome (nome);
        
        return new Usuario(nome);
    }
    
    private boolean nomeValido (String nome){
        return nome.matches("[a-zA-Z0-9 ]+");
    }
    
    
    private String formatarNome (String nome){
        return nome.substring(0, 1).toUpperCase().concat(nome.substring(1));
    }
}

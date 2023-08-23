
package controllers;

import domain.Usuario;
import exceptions.UsuarioException;
import java.util.*;
import services.UsuarioService;

public class UsuarioController {
    
    private static UsuarioController instance;
    private UsuarioService usuarioService;
    
    private Set<Usuario> usuarios = new HashSet<>();

    private UsuarioController() {}
    
    public static UsuarioController getInstance(){
        if (instance == null) instance = new UsuarioController();
        return instance;
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }
    
    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    public Usuario criarUsuario (){
        Usuario usuario = getUsuarioService().novoUsuario();
        boolean adicionou = addUsuario(usuario);
        if (!adicionou) throw new UsuarioException("Usuário já existente!");
        return usuario;
    }
    
    public Set<Usuario> getUsuarios(){
        return Collections.unmodifiableSet(usuarios);
    }
    
    private boolean addUsuario (Usuario usuario){
        return usuarios.add(usuario);
    }
    
}

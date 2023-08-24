
package controllers;

import services.UserService;

public class UsuarioController {
    
    private static UsuarioController instance;
    private UserService userService;

    private UsuarioController() {}
    
    public static UsuarioController getInstance(){
        if (instance == null) instance = new UsuarioController();
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }
    
    public void setUserService(UserService usuarioService) {
        this.userService = usuarioService;
    }
    
}

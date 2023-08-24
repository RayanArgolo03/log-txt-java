package services;

import domain.User;
import exceptions.UserException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserService {

    private Set<User> usuarios = new HashSet<>();

    public Set<User> getUsers() {
        return Collections.unmodifiableSet(usuarios);
    }

    private boolean addUser(User usuario) {
        return usuarios.add(usuario);
    }

    public User createUser() {

        System.out.print("Digite nome do usuário: ");
        String nome = new Scanner(System.in).next();

        if (!nomeValido(nome)) {
            throw new UserException("Nome inválido! Apenas caracteres alfabéticos!");
        }
        nome = formatarNome(nome);
        
        User user = new User(nome);
        
        if (!addUser(user)){
            throw new UserException("Usuário já existe!");
        } 

        return user;
    }

    private boolean nomeValido(String nome) {
        return nome.matches("[a-zA-Z0-9 ]+");
    }

    private String formatarNome(String nome) {
        return nome.substring(0, 1).toUpperCase().concat(nome.substring(1));
    }
}

package app;

import controllers.*;
import domain.*;
import java.util.*;
import services.*;

public class Teste {

    private static String path = "C:\\Users\\Acer\\Documents\\NetBeansProjects\\Exercicios\\src\\main\\java\\domain\\logs.txt";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opc = 1;

        UsuarioController usuarioController = UsuarioController.getInstance();
        usuarioController.setUserService(new UserService());

        LogController logController = LogController.getInstance();
        logController.setLogService(new LogService());

        enquanto:
        while (opc > 0 && opc < 3) {

            printMenu();

            System.out.println("Sua escolha: ");

            try {
                opc = Integer.parseInt(sc.next());

                switch (opc) {
                    case 1:
                        User user = usuarioController.getUserService().createUser();
                        Log log = logController.getLogService().createLog(user);
                        WriterService.novoLog(log, path);
                        break;

                    case 2:
                        int count = CounterService.countLines(path);
                        PrintService.printCount(count);
                        break;

                    case 3:
                        System.out.println("Saiu");
                        break enquanto;

                    default:
                        throw new RuntimeException("Opção inválida!");
                }
            }
            
            catch (RuntimeException e) {
                System.out.println("Erro: " + e.getMessage());
                break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("1 - Acessar site");
        System.out.println("2 - Imprimir quantidade de acessos");
        System.out.println("3 - Sair");
    }

}

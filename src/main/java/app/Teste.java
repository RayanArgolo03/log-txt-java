package app;

import controllers.LogController;
import controllers.UsuarioController;
import domain.Log;
import domain.Usuario;
import java.util.Scanner;
import services.CounterService;
import services.PrintService;
import services.UsuarioService;
import services.WriterService;

public class Teste {

    private static String caminho = "C:\\Users\\Acer\\Documents\\NetBeansProjects\\Exercicios\\src\\main\\java\\domain\\logs.txt";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opc = 1;

        UsuarioController usuarioController = UsuarioController.getInstance();
        usuarioController.setUsuarioService(new UsuarioService());

        LogController logController = LogController.getInstance();

        enquanto:
        while (opc > 0 && opc < 3) {

            printMenu();

            System.out.println("Sua escolha: ");

            try {
                opc = Integer.parseInt(sc.next());

                switch (opc) {
                    case 1:
                        Usuario usuario = usuarioController.criarUsuario();
                        Log log = logController.gerarLog(usuario);
                        WriterService.novoLog(log, caminho);
                        break;

                    case 2:
                        int count = CounterService.countLines(caminho);
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

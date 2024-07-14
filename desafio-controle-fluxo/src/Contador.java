import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        /*No bloco try coloco o código que será monitorado para possíveis exceções. 
        Se uma exceção ocorrer dentro do bloco try, a execução do bloco try é 
        interrompida, e o controle é passado para o bloco catch.
       */
        try {
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
        
        // catch (TipoDaExcecao nomeDaVariavel)
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

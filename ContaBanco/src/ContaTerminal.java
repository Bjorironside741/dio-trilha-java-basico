import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Olá, aqui é o banco BrasiDescon! \n");
       System.out.print("Para Iniciarmos, precisaremos de algumas informações! \n");
       System.out.print("------------------------------------ \n"); 

       System.out.println("Por favor, digite o número da Agência: \n");
       String agencia = scanner.nextLine();  

       System.out.println("Por favor, digite seu Nome Completo:  \n");
       String nome = scanner.nextLine();

       System.out.println("Por favor, digite o número de Usuário:  \n");
       int usuario = scanner.nextInt(); 

       System.out.println("Por favor, digite seu saldo na conta:  \n");
       float saldo = scanner.nextFloat();

       System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + usuario + " e seu saldo " + saldo + " já está disponível para saque! \n");
    }
}

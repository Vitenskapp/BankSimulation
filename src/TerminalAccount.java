import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        //Conhecer e importar a classe Scanner
        Scanner input = new Scanner(System.in);

        //Exibir as mensagens para nosso usuário
        Display("Por favor, digite o nome da agência: ");
        String agency = input.next();

        Display("Por favor, digite o número da Agência !");
        int agencyID = input.nextInt();

        Display("Digite seu nome: ");
        String name = input.next();

        Display("Digite sua idade: ");
        int age = input.nextInt();
        if(age < 18) {
            Display("A criação de conta está disponível apenas para maiores de idade !");
            return;
        }

        Display("Digite sua senha: ");
        int password = input.nextInt();

        Display("Confirme sua senha: ");
        int confirmPassword = input.nextInt();

        Display("Digite seu saldo: ");
        double balance = input.nextDouble();

        //Exibir mensagem de conta criada
        if(confirmPassword == password) {
            Display("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + agencyID + " e seu saldo " + "R$" + balance + " já está disponível para saque.");
        } else {
            Display("Senhas não coincidem");
        }
    }

    public static void Display(String message){
        System.out.println(message);
    }

}
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da Agencia: ");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome: ");
        String Nome = scanner.next();

        System.out.println("Por favor, digite o Numero: ");
        String Numero = scanner.next();

        System.out.println("Por favor, digite o Saldo: ");
        String Saldo = scanner.next();


        System.out.println("Ola " +Nome+", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta "+Numero+" e seu saldo " +Saldo+ " ja esta disponivel para saque");
    }
}
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o numero");
        numero = Integer.parseInt(scan.nextLine());

        System.out.println("Digite a agencia");
        agencia = scan.nextLine();

        System.out.println("Digite o nome");
        nomeCliente = scan.nextLine();

        System.out.println("Digite o saldo");
        saldo = Double.parseDouble(scan.nextLine());

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponivel para saque");
        scan.close();
    }

}

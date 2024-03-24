import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: R$ ");
        double valorDivida = scanner.nextDouble();

        System.out.println("\nTabela de Parcelamento:");
        System.out.println("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela");

        for (int parcelas = 1; parcelas <= 12; parcelas += 3) {
            double valorJuros = 0.0;
            switch (parcelas) {
                case 3:
                    valorJuros = valorDivida * 0.10;
                    break;
                case 6:
                    valorJuros = valorDivida * 0.15;
                    break;
                case 9:
                    valorJuros = valorDivida * 0.20;
                    break;
                case 12:
                    valorJuros = valorDivida * 0.25;
                    break;
                default:
                    break;
            }

            double valorTotalDivida = valorDivida + valorJuros;
            double valorParcela = valorTotalDivida / parcelas;

            System.out.printf("%.2f | %.2f | %d | %.2f%n", valorTotalDivida, valorJuros, parcelas, valorParcela);
        }

        scanner.close();
    }
}

package application;

import model.Contrato;
import model.Parcela;
import service.ServicoContrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        int numero = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);
        System.out.println("Valor do contrato: ");
        double valorTotal = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);
        System.out.println(contrato);

        System.out.println("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ServicoContrato servicoContrato = new ServicoContrato(null);

        servicoContrato.contratoProcessado(contrato, n);

        for (Parcela parcela : contrato.getParcelas())
            System.out.println(parcela);

        sc.close();
    }
}

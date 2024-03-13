package application;

import java.util.Locale;
import java.util.Scanner;

import Services.MethodPaymentBankAccount;
import Services.MethodPaymentCard;
import Services.PaymentMethod;
import entites.Account;
import entites.BankAccount;
import entites.Card;

import entites.Product;
import exceptions.ExceptionsTratament;

public class Program {
	public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("--Comecando cadastro--");


        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Endereco: ");
        String address = sc.nextLine();
        System.out.print("CPF: ");
        double cpf = sc.nextDouble();

        System.out.println("Codigo da agencia do banco: ");
        int cod = sc.nextInt();
        System.out.print("Valor do banco: ");
        double balance = sc.nextDouble();


        System.out.println("Codigo do cartao: ");
        int codCard = sc.nextInt();
        System.out.print("Limite do cartao: ");
        double limit = sc.nextDouble();
        System.out.print("Senha do cartao: ");
        int password = sc.nextInt();
        Account account = new Account(name, address, cpf, new BankAccount(cod, balance, new Card(codCard, limit, password)));

        System.out.print("Deseja realizar um saque? (y/n) ");
        char withdrawn = sc.next().charAt(0);
        if (withdrawn == 'y') {
            System.out.println("Quantia: ");
            double amount = sc.nextDouble();
            account.getBankAccount().withdrawnAccount(amount);
        }

        System.out.println(account.toString());

		sc.next();
        System.out.print("Nome: ");
        String nameProduct = sc.nextLine();
        System.out.print("preco: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantity = sc.nextInt();
        System.out.println("Qual o tipo do produto? ");
        String typeProduct = sc.nextLine();

        Product product = new Product(nameProduct, price, quantity, typeProduct);


        System.out.println("Deseja realizar o pagamento no cartao ou no pix? (c/p)");
        char method = sc.next().charAt(0);
        double amount = 0;
        if (method == 'c') {
            PaymentMethod mCard = new MethodPaymentCard();

            System.out.println("Cartão: ");
            amount = product.calc();
            mCard.processPayment(account, amount);
        } else if (method == 'p') {
			PaymentMethod mBoleto = new MethodPaymentBankAccount();
			mBoleto.processPayment(account, amount);
		}

		sc.close();
    }
}

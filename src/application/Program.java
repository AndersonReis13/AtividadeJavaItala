package application;

import java.util.Locale;
import java.util.Scanner;

import Services.MethodPaymentCard;
import Services.MethodPaymentTicket;
import Services.PaymentMethod;
import entites.Card;
import entites.Client;
import exceptions.ExceptionsTratament;

public class Program {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("--Comecando cadastro--");

		System.out.print("nome: ");
		String name = sc.nextLine();
		System.out.print("endereco: ");
		String addres = sc.nextLine();
		System.out.print("cpf: ");
		double cpf = sc.nextDouble();
		System.out.print("Bag: ");
		double bag = sc.nextDouble();

		System.out.println("--Comecando cadastro cartao--");

		System.out.print("Codigo do cartao: ");
		int cod = sc.nextInt();
		System.out.print("Limite: ");
		Double limit = sc.nextDouble();

		//Client client = new Client(name, addres, cpf, bag, new Card(cod, limit));

		System.out.println("--Comecando metodo de pagamento--");

		System.out.print("Ecolha um metodo de pagamento: (Card - c / Boleto - b)");
		char letter = sc.next().charAt(0);
		try {
		if (letter == 'c') {
			PaymentMethod methodCard = new MethodPaymentCard();

			System.out.println("Qual o valor de pagamento? ");
			double payment = sc.nextDouble();

			methodCard.processPayment(client, payment);
			
			System.out.println("novo valor do cartão: " + client.getCard().getLimit());
		} else if (letter == 'b') {
			PaymentMethod methodTicket = new MethodPaymentTicket();

			System.out.println("Qual o valor de pagamento? ");
			double payment = sc.nextDouble();

			methodTicket.processPayment(client, payment);
			System.out.println("valor total: " + client.getBag());
			}
		}catch(ExceptionsTratament e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}

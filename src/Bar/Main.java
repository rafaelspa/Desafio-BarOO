package Bar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELAT�RIO:");
		System.out.printf("Consumo = R$ %.2f%n" , bill.feeding());
		if (bill.cover() != 0.0) {
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());			
		}else {
			System.out.println("Isento de Couvert");
		}
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());
		
		sc.close();
	}

}

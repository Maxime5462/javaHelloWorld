package javaHelloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		double nb1 = 80000;
		double nb2 = 3_000;
		double result;
		result = nb1 - nb2;
		System.out.println(result);
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le texte:");
		String response = sc.nextLine();
		System.out.println("Vous avez saisi le texte suivant:");
		System.out.println(response);
		sc.close();
	}

}

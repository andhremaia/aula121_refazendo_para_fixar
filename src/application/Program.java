package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {
	
	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client client = new Client();
		
		
		System.out.println("Enter cliente data: \n");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		//sc.nextLine();
		String email = sc.nextLine();
		
		
		
		
		
		sc.close();
	
		
	}
}

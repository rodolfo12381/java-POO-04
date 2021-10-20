package application;
import java.util.Scanner;
import entities.Estudantes;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Estudantes []vetor = new Estudantes [10];
		Estudantes e = new Estudantes();
		System.out.print("How many rooms will be rented? ");
		int N = sc.nextInt();
		while (N>10 || N<1) {
			N = sc.nextInt();
		}
		for (int i=1; i<=N; i++) {
		
		System.out.println("");
		System.out.println("Rent #"+i+":");
		sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Room: ");
		int numQuarto = sc.nextInt();
		vetor[numQuarto] = new Estudantes(name,email);
		}
		System.out.println("");
		System.out.println("Busy rooms:");
		for (int j=0; j<vetor.length; j++) {
			if (vetor[j] != null) {
				System.out.println(j+": "+vetor[j].getName()+", "+vetor[j].getEmail());
			}
		}
	}

}

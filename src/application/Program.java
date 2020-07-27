package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante[] vect = new Estudante[10];
		
		System.out.print("Digite qtos quartos serao alugados: ");
		int n = sc.nextInt();
		int i;
		for (i = 0;i < n; i++) {
			
			sc.nextLine();
			System.out.println("Estudante: #" + (i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			sc.nextLine();
			
			if (vect[quarto] == null) {
			    vect[quarto] = new Estudante(nome,email);
			}else { 
				for (int x=0;x < vect.length;x++) {
					if (vect[x] == null)
						System.out.println("Quarto " + x + " livre.");
					else System.out.println("Quarto " + x + " ocupado.");
				}
				System.out.println("Quarto ocupado, digite outro ! ");
			    i--;
			}
			
		}
		
		for (i = 0;i < vect.length; i++) {
			if (vect[i] != null)
			    System.out.println("Quarto " + i + " ocupado por: " + vect[i]);	
		}
		
        sc.close();
        
	}

}

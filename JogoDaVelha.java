package projetosJogos;
import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		int opc = 0, cont = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//Menu
		menu();
		while(cont == 0) {
			System.out.print("\n\nSua resposta: ");
			opc = scan.nextInt();
			switch(opc) {
				case 1:
						pulaLinha20();
						tabuleiro();
						pulaLinha3();
						pulaLinha3();
						cont++;
					break;
				case 2:
					cont++;
					break;
				default:
					System.out.print("\nDigite uma opcao valida");
			}
		}
		scan.close();
	}
	
	public static void menu() {
		System.out.println("\nSeja bem-vindo ao jogo da velha!");
		System.out.println("\n1 - Jogar!");
		System.out.println("\n2 - Definir os nomes dos jogadores");
		System.out.println("\n3 - Sair ;-; :(");
	}
	
	public static void pulaLinha3() {
		for(int i = 0; i < 3; i++) {
			System.out.println();
		}
	}
	
	public static void pulaLinha20() {
		for(int i = 0; i < 20; i++) {
			System.out.println();
		}
	}
	
	public static void tabuleiro() {
		int cont = 0;
		
		String tab[][] = new String[3][3];
		
		while(cont <=  9) {
			System.out.println("Digite as coordenadas de onde deseja jogar: ");
			
			for(int i = 0; i < tab.length; i++) {
				for(int j = 0; j < tab[i].length; j++) {
					if(j != 0) {
						System.out.print(" |");
					}
				}
				if(i != (tab[i].length - 1)) {
					System.out.print("\n-----");
				}
				System.out.println();
			}
			cont++;
		}
	}
}

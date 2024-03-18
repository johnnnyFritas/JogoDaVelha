package jogos;
import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		int opc = 0, cont = 0;
		
		int x, y;
		
		Scanner scan = new Scanner(System.in);
		
		//Menu
		menu();
		while(cont == 0) {
			System.out.print("\n\nSua resposta: ");
			opc = scan.nextInt();
			switch(opc) {
				case 1:
						pulaLinha20();
						cont++;
					break;
				case 2:
					cont++;
					break;
				default:
					System.out.print("\nDigite uma opcao valida");
			}
		}
		
		String[][] tab = new String[3][3];
		
		for(int i = 0; i < 9; i++) {
			pulaLinha3();
			
			if(i % 2 == 0) {
				System.out.println("Vez do jogador 1:");
				System.out.println("Digite as coordenadas para sua jogada:");
				x = scan.nextInt();
				y = scan.nextInt();
				
				tab[x][y] = "x";
			
				tabuleiro(tab, x, y);
			}else {
				System.out.println("Vez do jogador 2:");
				System.out.println("Digite as coordenadas para sua jogada:");
				x = scan.nextInt();
				y = scan.nextInt();
				
				tab[x][y] = "y";
			
				tabuleiro(tab, x, y);
			}
		}
		scan.close();
	}
	
	public static void menu() {
		System.out.println("\nSeja bem-vindo ao jogo da velha!");
		System.out.println("\n1 - Jogar!");
		System.out.println("\n2 - Sair ;-; :(");
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
	
	public static void tabuleiro(String[][] tab, int x, int y) {
		
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				if(j != 0) {
					System.out.print(tab[x][y] + "|");
				}
			}
			if(i != tab[i].length - 1) {
				System.out.print("\n-----");
			}
			System.out.println();
		}
	}
}

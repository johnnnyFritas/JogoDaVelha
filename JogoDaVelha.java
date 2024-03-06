package pastaDeAtv;
import java.util.Random;
import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		int opc = 0, cont = 0, contJogo = 0, contJogadores = 0, inicio = 0, x = 0, y = 0;
		
		int tab[][] = new int[x][y];
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//Menu
		menu();
		while(cont == 0) {
			System.out.print("\n\nSua resposta: ");
			opc = scan.nextInt();
			switch(opc) {
				case 1:
					inicio = bomJogo(contJogo, scan);
					if(inicio != 0) {
						cont++;
						tab = mostraTabuleiro(x, y, scan);
					}
					break;
				case 2:
					jogadores(scan, contJogadores);
					contJogo++;
					inicio++;
					break;
				case 3:
					cont++;
					break;
				case 4:
					pulaLinha20();
					menu();
					break;
				default:
					System.out.print("\nDigite uma opcao valida");
			}
		}

	}
	
	public static void menu() {
		System.out.println("\nSeja bem-vindo ao jogo da velha!\n(Selecione uma opcao,\ndigite o numero que deseja)");
		System.out.println("\n1 - Jogar!");
		System.out.println("\n2 - Definir os nomes dos jogadores e simbolos");
		System.out.println("\n3 - Sair ;-; :(");
	}
	
	public static int bomJogo(int contJogo, Scanner scan) {
		int contJogadores = 0;
		
		if(contJogo == 0) {
			contJogo++;
			contJogadores++;
			jogadores(scan, contJogadores);
			
			return contJogo;
		} else {
			pulaLinha20();
			System.out.println("\nBom jogo!");
			
			return contJogo;
		}
	}
	
	public static void jogadores(Scanner scan, int contJogadores) {
		String jogador1, jogador2;
		
		System.out.println("\n-Digite o nome do primeiro jogador:");
			jogador1 = scan.next();
		System.out.println("\n-Digite o nome do segundo jogador:");
			jogador2 = scan.next();
		
		if(contJogadores == 0) {
			System.out.println("\nDigite (4) para o menu");
		}
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
	
	public static int[][] mostraTabuleiro(int x, int y, Scanner scan) {
		System.out.println("\nInforme o tamanho do tabuleiro,\nprimeiro no eixo x, depois no eixo y");
		System.out.print("\neixo x: ");
		x = scan.nextInt();
		System.out.print("\neixo y: ");
		y = scan.nextInt();
		
		int[][] tab = new int[x][y];
		
		pulaLinha20();
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				if(j != (tab.length - 1) && i != (tab.length - 1)) {
					System.out.print("_|");
				} else if(i == (tab.length - 1) && j != (tab.length - 1)) {
					System.out.print(" |");
				}
			}
			if(i != (tab.length - 1)) {
				System.out.println("_");
			}
		}
		
		atualizaTabuleiro(tab, x, y);
		
		return tab;
	}
	
	public static void atualizaTabuleiro(int[][] tab, int x, int y) {
		
	}

}

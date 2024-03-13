package jogos;
import java.util.Scanner;
public class JogoDaVelha {

	public static void main(String[] args) {
		int opc = 0, cont = 0;
		
		Scanner scan = new Scanner(System.in);
		Jogadores jog = new Jogadores();
		Tabuleiro tabu = new Tabuleiro();
		
		//Menu
		menu();
		while(cont == 0) {
			System.out.print("\n\nSua resposta: ");
			opc = scan.nextInt();
			switch(opc) {
				case 1:
					if(jog.getJogador1() == null || jog.getJogador2() == null) {
						jogadores(jog);
						pulaLinha20();
						menu();
					}else {
						defineTamanho(tabu);
						pulaLinha3();
						tabu.mostraTabuleiro();
						cont++;
					}
					break;
				case 2:
					jogadores(jog);
					pulaLinha20();
					menu();
					break;
				case 3:
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
	
	public static void jogadores(Jogadores jog) {
		System.out.print("\nDigite o nome do primeiro jogador: ");
		jog.setJogador1();
		System.out.print("\nDigite o nome do segundo jogador: ");
		jog.setJogador2();
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

	public static void defineTamanho(Tabuleiro tabu) {
		pulaLinha3();
		System.out.println("\nDigite o tamanho\n");
		pulaLinha3();
		System.out.print("Eixo x: ");
		tabu.setX();
		System.out.println();
		System.out.print("Eixo y: ");
		tabu.setY();
	}
}

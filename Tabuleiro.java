package projetosJogos;

import java.util.Scanner;

public class Tabuleiro {
	
	Scanner scan = new Scanner(System.in);
	
	int x;
	
	int y;
	
	int jogadaX;
	
	int jogadaY;
	
	public void setX() {
		this.x = scan.nextInt();
	}
	
	public void setY() {
		this.y = scan.nextInt();
	}
	
	public void mostraTabuleiro() {
		String[][] tab = new String[this.x][this.y];
		
		for(int i = 0; i < tab.length; i++) {
			for(int j = 0; j < tab[i].length; j++) {
				if(j != 0) {
					System.out.print(" |");
				}
			}
			if(i != (tab[i].length - 1)) {
				System.out.println();
				System.out.print("-----");
			}
			System.out.println();
		}
		jogadas(tab);
	}
	
	public void jogadas(String[][] tabAt) {
		int cont = 0;
		
		while(cont < this.x * this.y) {
			System.out.println();
			this.jogadaX = scan.nextInt();
			this.jogadaY = scan.nextInt();
			System.out.println();
			for(int i = 0; i < tabAt.length; i++) {
				for(int j = 0; j < tabAt[i].length; j++) {
					tabAt[this.jogadaX][this.jogadaY] = "x";
					if(j != 0) {
						System.out.print(tabAt[this.jogadaX][this.jogadaY]);
						System.out.print("|");
					}
				}
				if(i != (tabAt[i].length - 1)) {
					System.out.print("\n-----");
				}
				System.out.println();
			}
			cont++;
		}
	}
}

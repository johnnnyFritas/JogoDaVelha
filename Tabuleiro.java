package jogos;

import java.util.Scanner;

public class Tabuleiro {
	
	Scanner scan = new Scanner(System.in);
	
	int x;
	
	int y;
	
	public void setX() {
		this.x = scan.nextInt();
	}
	
	public void setY() {
		this.y = scan.nextInt();
	}
	
	public void mostraTabuleiro() {
		
		int[][] tab = new int[this.x][this.y];
	
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
	}
}

package projetosJogos;

import java.util.Scanner;

public class Jogadores {
	
	Scanner scan = new Scanner(System.in);
	
	String jogador1;
	
	String jogador2;
	
	public void setJogador1() {
		this.jogador1 = scan.nextLine();
	}
	
	public String getJogador1() {
		return this.jogador1;
	}
	
	public void setJogador2() {
		this.jogador2 = scan.nextLine();
	}
	
	public String getJogador2() {
		return this.jogador2;
	}
}

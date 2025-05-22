package SisProva;
import java.util.Scanner;

public class Guerreiro extends Personagem {

	Scanner leia = new Scanner (System.in);

	public Guerreiro(String nome, int nivel, int pontosVida, String tipoArma) {
		super(nome, nivel, pontosVida);
		this.setTipoArma(tipoArma);
	}
	
	public void setTipoArma(String tipoArma) {
		do{
			if(tipoArma == "") {
				System.out.println("\nInsira o tipo de arma: ");
				leia.next(tipoArma);
			} else {
				this.tipoArma = tipoArma;
			}
		} while (tipoArma == "");

	}

	@Override
	public void exibirStatus() {
		System.out.println("\nNome: " +getNome() +"\nNivel: " +getNivel() +"\nPontos de vida: " +getPontosVida() +"\nTipo de arma: " +getTipoArma());

	}

	private String tipoArma;

	public String getTipoArma() {
		return tipoArma;
	}

	

	public void exibirStatus (String escudo) {
		System.out.println("ESCUDO DE NOME.....  " +escudo);
	}



}

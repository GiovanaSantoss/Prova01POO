package SisProva;

import java.util.Scanner;

public abstract class Personagem {

    Scanner leia = new Scanner(System.in);

    private String nome;
    private int nivel;
    private int pontosVida;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        do {
            if (nome == "") {
                System.out.println("Insira um nome: ");
                leia.next(nome);
            } else {
                this.nome = nome;
            }
        } while (nome == "");

    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        do {
            if (nivel <= 0) {
                System.out.println("\nInsira um valor maior que zero para o nível: ");
                leia.nextInt(nivel);
            } else {
                this.nivel = nivel;
            }
        } while (nivel <= 0);
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        do {
            if (pontosVida <= 0) {
                System.out.println("\nInsira um valor maior que zero para pontos de vida: ");
                leia.nextInt(pontosVida);
            } else {
                this.pontosVida = pontosVida;
            }
        } while (pontosVida <= 0);

    }

    public Personagem(String nome, int nivel, int pontosVida) {
        super();
        setNome(nome);
        setNivel(nivel);
        setPontosVida(pontosVida);
    }

    public abstract void exibirStatus();

    public final void identificar() {
        System.out.println("Nome: " + getNome() + "\nPontos de vida: " + getPontosVida());
    }

}

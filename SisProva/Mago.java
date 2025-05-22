package SisProva;

public class Mago extends Personagem implements Combatente {

    public Mago(String nome, int nivel, int pontosVida, int mana) {
        super(nome, nivel, pontosVida);
        this.setMana(mana);
    }

    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        do {
            if (mana < 0) { //Amanda - indentação
                System.out.println("\nMana deve ser um valor maior que zero: ");
                leia.nextInt(mana);

            } else {
                this.mana = mana;
            }//Amanda - indentação
        } while (mana < 0);

    }

    @Override
    public void atacar() {
        mana = mana - 5;
    }

    @Override
    public void defender() {
        mana = mana - 3;
    }

    @Override
    public void exibirStatus() {
        System.out.println("Nome: " + getNome() + "\nNivel: " + getNivel() + "\nPontos de vida: " + getPontosVida() + "\nMana: " + getMana());
    }

    public void atacar(String feitiço) {
        System.out.println("O feitiço usado foi: " + feitiço);
        mana = mana - 10;
    }

}

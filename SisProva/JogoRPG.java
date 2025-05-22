package SisProva;

public class JogoRPG { //Amanda - final

    public static void main(String[] args) {
        Mago pers1 = new Mago("ISI", 10, 200, 0);
        Guerreiro pers2 = new Guerreiro("DOBBY", 15, 250, "VARINHA");

        pers1.setMana(5);
        pers1.exibirStatus();
        pers1.atacar("OKOS");
        pers1.identificar();
        pers1.atacar();
        pers1.defender();

        System.out.println("\n------------------------");

        pers2.exibirStatus();
        pers2.setTipoArma("VARINHA");
        pers2.exibirStatus("LEVIOSA!!!");
        pers2.identificar();

    }

}

import java.util.Scanner;

public final class Crocodilo extends Repteis {
    Scanner scan= new Scanner(System.in);
    String sexo;
    int idade;
    String clima;
    String especie;

    public Crocodilo(String tipo, String ordem, boolean oviparo, String sexo, int idade, String clima, String especie) {
        super(tipo, ordem, oviparo);
        this.oviparo=true;
        this.sexo=sexo;
        this.idade=idade;
        this.clima=clima;
        this.especie=especie;
    }

    public void tipoInfo(String tipo) {
        System.out.println("\nIndependente do tipo do crocodilo ser "+super.tipo+", este animal pode viver tanto na água como na terra, devido às suas características.");
    }
    public void regiao(String especie) {
        System.out.println("Em qual hemisfério ele vive:"); //Ex: Sul
        String lugar= scan.next();
        System.out.println("\nO crocodilo da espécie "+especie+" vive no hemisfério "+lugar);
    }
    public void regiao(String especie, String clima) {
        System.out.println("Em qual hemisfério ele vive:"); //Ex: Norte
        String lugar= scan.next();
        System.out.println("\nO crocodilo da espécie "+especie+" vive no hemisfério "+lugar+", em um ambiente "+clima);
    }

    @Override
    public final void possuiCasca() {
        System.out.println("\nNenhuma espécie de crocodilo possui casca, sua pele é composta por placas e escamas.");
    }
}
    
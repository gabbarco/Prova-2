import java.util.Scanner;

public abstract class Repteis {
    String tipo; //Terrestre ou Aquatico
    String ordem; //uma das quatro ordem de répteis
    boolean oviparo; // oviparo ou nao
    
    public Repteis(String tipo, String ordem, boolean oviparo) {
        this.tipo=tipo;
        this.ordem=ordem;
        this.oviparo=oviparo;
    }

    public void possuiCasca() {
    Scanner scan= new Scanner(System.in);
    System.out.println("O réptil possui algum tipo de casca? 1-Sim 2-Não");
    int casca= scan.nextInt();
    if (casca==1) {
        System.out.println("O réptil em questão não possui casca!");
    } else {
        System.out.println("O réptil em questão possui casca!");
    }
    scan.close();
    }
}

public class Principal {
    public static void main(String[] args) {
        String tipo="Aquático" ;
        String ordem="Crocodylia";
        boolean oviparo=true;
        String sexo="Macho";
        int idade=34;
        String clima= "tropical";
        String especie="Crocodilo-do-nilo";
        Crocodilo croco= new Crocodilo(tipo, ordem, oviparo, sexo, idade, clima, especie);   
        croco.tipoInfo(tipo);
        croco.regiao(especie);
        croco.regiao(especie, clima);
        croco.possuiCasca();
    }
}

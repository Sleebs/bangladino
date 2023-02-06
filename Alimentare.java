public class Alimentare extends Oggetto {
    double prezzo = 0;
    String nome = null;
    String scadenza;

    public Alimentare(String nome, String scadenza, double prezzo) {
        this.nome = nome;
        this.scadenza = scadenza;
        this.prezzo = prezzo;
    }

}

public class Bangladino {

    private static Bangladino instance = null;
    Oggetto[] magazzino = new Oggetto[2];
    String nome = "Giuse";

    private Bangladino(Oggetto[] arr) {
        magazzino = arr;

    }

    public static Bangladino getInstance(Oggetto[] arr) {
        if (instance == null)
            instance = new Bangladino(arr);
        return instance;
    }

    public Oggetto vende(int numeroOggettInMagazzino) {
        return magazzino[numeroOggettInMagazzino];
    }

    public String has(String nome, double prezzo, int tipo) {
        for (int i = 0; i < magazzino.length; i++) {
            if (magazzino[i].nome == nome)
                return "E' gia' in magazzino";
        }
        addToMagazzino(compraDalFornitore(nome, prezzo, tipo));
        return "non c'era, ma l'ho comprato per te";
    }

    private Oggetto compraDalFornitore(String nome, double prezzo, int tipo) {
        if (tipo == 0) {
            return new Alimentare(nome, "1/Gennaio", prezzo);
        }
        return new Pulizia(nome, prezzo);
    }

    private void addToMagazzino(Oggetto oggetto) {
        Oggetto[] arr = new Oggetto[magazzino.length + 1];
        for (int i = 0; i < magazzino.length; i++)
            arr[i] = magazzino[i];
        arr[arr.length - 1] = oggetto;
        this.magazzino = arr;

    }
}

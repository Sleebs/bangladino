public class Main {
    public static void main(String[] args) {
        System.out.println("Ciao");
        Oggetto[] arr = {
                new Alimentare("Acqua", "mai", 1.0),
                new Alimentare("Cocacola", "mai", 3.0),
                new Pulizia("Cif", 3.2)
        };
        Bangladino andrea = Bangladino.getInstance(arr);
        System.out.println(andrea.has("fonzies", 4, 0));
        System.out.println(andrea.has("fonzies", 4, 0));

    }
}
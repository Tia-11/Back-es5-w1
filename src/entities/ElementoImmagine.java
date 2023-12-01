package entities;

public class ElementoImmagine extends ElementoMultimediale {
    private int luminosita;

    public ElementoImmagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void show() {
        String titolo = getTitolo();
        System.out.println(titolo);

        for (int i = 0; i < luminosita; i++) {
            System.out.println("*");
        }
    }
}
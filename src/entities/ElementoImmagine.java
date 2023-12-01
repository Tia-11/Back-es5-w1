package entities;

public class ElementoImmagine extends ElementoMultimediale {
    private int luminosita;

    public ElementoImmagine(int titolo, int luminosita) {
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
        // Logica per mostrare l'immagine
    }
}
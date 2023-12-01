package entities;
import interfaces.Brightness;

public class ElementoImmagine extends ElementoMultimediale implements Brightness {
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

    @Override
    public int aumentaLuminosita() {
        return ++luminosita;
    }

    @Override
    public int diminuisciLuminosita() {
        return --luminosita;
    }

    public void show() {
        String titolo = getTitolo();
        System.out.println(titolo);

        for (int i = 0; i < luminosita; i++) {
            System.out.println("*");
        }
    }
}
package entities;
import interfaces.reproducible;

public class ElementoVideo extends ElementoMultimediale implements reproducible {
    private int luminosita;
    private int volume;

    public ElementoVideo(int titolo, int luminosita, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
    }

    @Override
    public void play() {
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
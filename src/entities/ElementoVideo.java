package entities;
import interfaces.reproducible;

public class ElementoVideo extends ElementoMultimediale implements reproducible {
    private int luminosita;
    private int volume;
    private int durata;

    public ElementoVideo(int titolo, int durata, int luminosita, int volume) {
        super(titolo);
        this.durata = durata;
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

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }
}
package entities;
import interfaces.reproducible;

public class ElementoAudio extends ElementoMultimediale implements reproducible {
    private int volume;

    private int durata;

    public ElementoAudio(int titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void play() {
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
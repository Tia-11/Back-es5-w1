package entities;
import interfaces.reproducible;

public class ElementoAudio extends ElementoMultimediale implements reproducible {
    private int volume;

    public ElementoAudio(int titolo, int volume) {
        super(titolo);
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
}
package entities;
import interfaces.Reproducible;
import interfaces.Volume;

public class ElementoAudio extends ElementoMultimediale implements Reproducible, Volume {
    private int volume;

    private int durata;

    public ElementoAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public void play() {
        String titolo = getTitolo();
        int durata = getDurata();

        for (int i = 0; i < durata; i++) {
            System.out.print(titolo);

            for (int j = 0; j < getVolume(); j++) {
                System.out.print(" ! ");
            }

            System.out.println();
        }
    }

    @Override
    public int aumentaVolume() {
        return ++volume;
    }

    @Override
    public int diminuisciVolume() {
        return --volume;
    }
}
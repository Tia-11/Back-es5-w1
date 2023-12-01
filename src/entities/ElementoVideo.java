package entities;
import interfaces.Brightness;
import interfaces.Reproducible;
import interfaces.Volume;


public class ElementoVideo extends ElementoMultimediale implements Reproducible, Volume, Brightness {
    private int luminosita;
    private int volume;
    private int durata;

    public ElementoVideo(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
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

    @Override
    public void play() {
        String titolo = getTitolo();
        int durata = getDurata();

        for (int i = 0; i < durata; i++) {
            System.out.println(titolo);
        }

        for (int i = 0; i < volume; i++) {
            System.out.println("!");
        }

        for (int i = 0; i < luminosita; i++) {
            System.out.println("*");
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

    @Override
    public int aumentaLuminosita() {
        return ++luminosita;
    }

    @Override
    public int diminuisciLuminosita() {
        return --luminosita;
    }
}
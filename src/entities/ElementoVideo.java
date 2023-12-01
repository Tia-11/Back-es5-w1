package entities;
import interfaces.reproducible;

public class ElementoVideo extends ElementoMultimediale implements reproducible {
    private int luminosita;
    private int volume;
    private int durata;

    public ElementoVideo(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
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
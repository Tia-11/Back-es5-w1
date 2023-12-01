import entities.ElementoAudio;
import entities.ElementoImmagine;
import entities.ElementoVideo;

public class Main {
    public static void main(String[] args) {

        ElementoAudio primaCanzone = new ElementoAudio("Beatles", 5, 3);

        ElementoVideo primoVideo = new ElementoVideo("Star Wars", 4,5,4);

        ElementoImmagine primaImmagine = new ElementoImmagine("Poster",3);

        primoVideo.play();

        primaCanzone.play();

        primaImmagine.show();
    }
}
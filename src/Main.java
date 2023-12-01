import entities.ElementoAudio;
import entities.ElementoImmagine;
import entities.ElementoVideo;
import entities.LettoreMultimediale;

public class Main {
    public static void main(String[] args) {

        ElementoAudio primaCanzone = new ElementoAudio("Let It Be", 5, 3);

        ElementoVideo primoVideo = new ElementoVideo("Star Wars", 4,5,4);

        ElementoImmagine primaImmagine = new ElementoImmagine("Poster",3);

        ElementoVideo[] rap00 = {
                new ElementoVideo("Whitout Me", 4, 3, 5),
                new ElementoVideo("Mockingbird", 6, 6, 5),
                new ElementoVideo("Lose Yourself", 4, 7, 3),
                new ElementoVideo("21 Questions", 3, 4, 2),
                new ElementoVideo("Get Rich or Die Tryin", 10, 9, 1)
        };

        ElementoVideo[] italiana = {
                new ElementoVideo("La cura",3,4,5),
                new ElementoVideo("Emozioni",7,2,10),
                new ElementoVideo("Senza Fine",7,2,2),
                new ElementoVideo("Abbronzatissima",4,4,4),
                new ElementoVideo("Vagabondo",7,9,1),
        };

        LettoreMultimediale rap = new LettoreMultimediale(rap00);

        LettoreMultimediale musicaItaliana = new LettoreMultimediale(italiana);

        primoVideo.play();

        primaCanzone.play();

        primaImmagine.show();

        primoVideo.aumentaLuminosita();

        primoVideo.diminuisciVolume();

        primoVideo.play();

        primaCanzone.aumentaVolume();

        primaCanzone.play();

        primaImmagine.diminuisciLuminosita();

        primaImmagine.show();

        musicaItaliana.esegui();
    }

}


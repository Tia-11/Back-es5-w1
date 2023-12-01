package entities;
import java.util.Scanner;

public class LettoreMultimediale {
    private ElementoVideo[] video;
    public LettoreMultimediale(ElementoVideo[] elementi) {
        this.video = elementi;
    }
    public void esegui() {
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;

        while (scelta != 0) {
            System.out.println("Inserisci un numero compreso tra 1 e 5 o inserisci 0 per chiudere il programma:");
            scelta = scanner.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elementoScelto = video[scelta - 1];
                if (elementoScelto instanceof ElementoVideo) {
                    ((ElementoVideo) elementoScelto).play();
                }
            } else if (scelta == 0) {
                System.out.println("Programma chiuso.");
            } else {
                System.out.println("Errore nell' inserimento del numero!");
            }
        }
        scanner.close();
    }
}


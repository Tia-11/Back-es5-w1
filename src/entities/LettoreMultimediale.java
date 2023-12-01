package entities;
import java.util.Scanner;

public class LettoreMultimediale {
    private ElementoVideo[] elementi;

    public LettoreMultimediale() {
        elementi = new ElementoVideo[5];
        elementi[0] = new ElementoVideo("Whitout Me",4,3,5);
        elementi[1] = new ElementoVideo("Mockingbird",6,6,5);
        elementi[2] = new ElementoVideo("Lose Yourself",4,7,3);
        elementi[3] = new ElementoVideo("21 Questions",3,4,2);
        elementi[4] = new ElementoVideo("Get Rich or Die Tryin",10,9,1);
    }

    public void esegui() {
        Scanner scanner = new Scanner(System.in);
        int scelta = -1;

        while (scelta != 0) {
            System.out.println("Inserisci un numero compreso tra 1 e 5 o inserisci 0 per chiudere il programma:");
            scelta = scanner.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elementoScelto = elementi[scelta - 1];
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

package entities;

public abstract class ElementoMultimediale  {
    private String titolo;

    public ElementoMultimediale(int titolo) {
        this.titolo = String.valueOf(titolo);
    }

    public String getTitolo() {
        return titolo;
    }
}

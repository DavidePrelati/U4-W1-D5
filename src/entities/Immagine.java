package entities;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    private int luminosita;


    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLum() {
        if (luminosita < 10) {
            luminosita++;
        }
    }

    @Override
    public void abbassaLum() {
        if (luminosita > 1) {
            luminosita--;
        }
    }

    public void show() {
        System.out.println(getTitolo());
        for (int i = 0; i < luminosita; i++) {
            System.out.println(" *");
        }
    }
}

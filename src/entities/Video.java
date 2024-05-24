package entities;

import interfaces.Luminosita;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosita {

    private int luminosita;

    public Video(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLum() {

    }

    @Override
    public void abbassaLum() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}

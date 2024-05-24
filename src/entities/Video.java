package entities;

import interfaces.Luminosita;
import interfaces.Riproducibile;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosita, Riproducibile {

    private int luminosita;
    private int volume;
    private int durata;

    public Video(String titolo, int luminosita, int volume, int durata) {
        super(titolo);
        this.luminosita = luminosita;
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void aumentaLum() {

    }

    @Override
    public void abbassaLum() {

    }

    @Override
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
        }

    }

    @Override
    public void abbassaVolume() {
        if (volume > 1) {
            volume--;
        }

    }


    @Override
    public void play() {

    }
}

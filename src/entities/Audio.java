package entities;

import interfaces.Riproducibile;
import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume, Riproducibile {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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

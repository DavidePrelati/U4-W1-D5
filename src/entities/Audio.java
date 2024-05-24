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

    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void durata() {

    }

    @Override
    public void play() {

    }
}

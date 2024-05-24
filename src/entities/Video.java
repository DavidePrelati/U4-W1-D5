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
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo());
            for (int j = 0; j < volume; j++) {
                System.out.println(" !");
            }
            for (int k = 0; k < luminosita; k++) {
                System.out.println(" *");
            }
        }

    }
}

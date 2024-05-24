package entities;

import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume {
    public Audio(String titolo) {
        super(titolo);
    }

    @Override
    public void alzaVolume() {
        
    }

    @Override
    public void abbassaVolume() {

    }
}

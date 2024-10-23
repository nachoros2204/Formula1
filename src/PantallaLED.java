package src;

import src.interfaces.INombreParaLED;

public class PantallaLED {

    private INombreParaLED objeto;

    //constructor
    public PantallaLED(INombreParaLED objeto) {
        this.objeto = objeto;
    }

    //get
    public INombreParaLED getObjeto() {
        return objeto;
    }

    //set
    public void setObjeto(INombreParaLED objeto) {
        this.objeto = objeto;
    }

    

}

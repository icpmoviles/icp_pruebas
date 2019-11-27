package es.icp.libreriapruebas;

import com.zebra.rfid.api3.Readers;

public class Init {

    public String test(){return "Hola mundo";}


    public void testZebra()
    {
        Readers readers = new Readers();
        test();
    }
}

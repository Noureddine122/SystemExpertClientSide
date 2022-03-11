package fstm.projet.model;

import java.io.Serializable;
import java.util.Vector;

public class Socketinter  implements Serializable {
    public Vector<Symptoms> Mysymtoms;
    public Client MyClient;

    public Socketinter(Vector<Symptoms> mysymtoms, Client myClient) {
        Mysymtoms = mysymtoms;
        MyClient = myClient;
    }

}

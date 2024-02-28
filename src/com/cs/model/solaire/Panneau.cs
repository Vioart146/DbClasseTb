using System;
namespace src.com.cs.models {
public class Panneau {
 {
    private int idpanneau;
    private string nompanneau;
    private object puissance;

    public Panneau(int idpanneau, string nompanneau, object puissance) {
        this.idpanneau = idpanneau;
        this.nompanneau = nompanneau;
        this.puissance = puissance;
    }
    public int Idpanneau {
        get { return idpanneau; }
        set { idpanneau = value; }
    }
    public string Nompanneau {
        get { return nompanneau; }
        set { nompanneau = value; }
    }
    public object Puissance {
        get { return puissance; }
        set { puissance = value; }
    }
}
    }
}
using System;
namespace src.com.cs.models {
public class Meteo {
 {
    private object jour;
    private object heure;
    private object indice;

    public Meteo(object jour, object heure, object indice) {
        this.jour = jour;
        this.heure = heure;
        this.indice = indice;
    }
    public object Jour {
        get { return jour; }
        set { jour = value; }
    }
    public object Heure {
        get { return heure; }
        set { heure = value; }
    }
    public object Indice {
        get { return indice; }
        set { indice = value; }
    }
}
    }
}
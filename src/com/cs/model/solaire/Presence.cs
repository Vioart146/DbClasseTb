using System;
namespace src.com.cs.models {
public class Presence {
 {
    private object idbatiment;
    private object datepresence;
    private object tranchehoraire;
    private object nbreleve;

    public Presence(object idbatiment, object datepresence, object tranchehoraire, object nbreleve) {
        this.idbatiment = idbatiment;
        this.datepresence = datepresence;
        this.tranchehoraire = tranchehoraire;
        this.nbreleve = nbreleve;
    }
    public object Idbatiment {
        get { return idbatiment; }
        set { idbatiment = value; }
    }
    public object Datepresence {
        get { return datepresence; }
        set { datepresence = value; }
    }
    public object Tranchehoraire {
        get { return tranchehoraire; }
        set { tranchehoraire = value; }
    }
    public object Nbreleve {
        get { return nbreleve; }
        set { nbreleve = value; }
    }
}
    }
}
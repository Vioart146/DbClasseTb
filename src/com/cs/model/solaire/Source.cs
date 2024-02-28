using System;
namespace src.com.cs.models {
public class Source {
 {
    private int idsource;
    private string nomsource;
    private object idpanneau;
    private object idbatterie;

    public Source(int idsource, string nomsource, object idpanneau, object idbatterie) {
        this.idsource = idsource;
        this.nomsource = nomsource;
        this.idpanneau = idpanneau;
        this.idbatterie = idbatterie;
    }
    public int Idsource {
        get { return idsource; }
        set { idsource = value; }
    }
    public string Nomsource {
        get { return nomsource; }
        set { nomsource = value; }
    }
    public object Idpanneau {
        get { return idpanneau; }
        set { idpanneau = value; }
    }
    public object Idbatterie {
        get { return idbatterie; }
        set { idbatterie = value; }
    }
}
    }
}
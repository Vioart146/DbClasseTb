using System;
namespace src.com.cs.models {
public class Batiment {
 {
    private int idbatiment;
    private string nombatiment;
    private object idsource;

    public Batiment(int idbatiment, string nombatiment, object idsource) {
        this.idbatiment = idbatiment;
        this.nombatiment = nombatiment;
        this.idsource = idsource;
    }
    public int Idbatiment {
        get { return idbatiment; }
        set { idbatiment = value; }
    }
    public string Nombatiment {
        get { return nombatiment; }
        set { nombatiment = value; }
    }
    public object Idsource {
        get { return idsource; }
        set { idsource = value; }
    }
}
    }
}
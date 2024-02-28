using System;
namespace src.com.cs.models {
public class Batterie {
 {
    private int idbatterie;
    private string nombatterie;
    private object capacite;

    public Batterie(int idbatterie, string nombatterie, object capacite) {
        this.idbatterie = idbatterie;
        this.nombatterie = nombatterie;
        this.capacite = capacite;
    }
    public int Idbatterie {
        get { return idbatterie; }
        set { idbatterie = value; }
    }
    public string Nombatterie {
        get { return nombatterie; }
        set { nombatterie = value; }
    }
    public object Capacite {
        get { return capacite; }
        set { capacite = value; }
    }
}
    }
}
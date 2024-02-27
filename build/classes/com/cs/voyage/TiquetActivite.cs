public class TiquetActivite {
 {
    private int id;
    private object id_activite;
    private object duree;
    private object prix;
    private object quantite;

    public TiquetActivite(int id, object id_activite, object duree, object prix, object quantite) {
        this.id = id;
        this.id_activite = id_activite;
        this.duree = duree;
        this.prix = prix;
        this.quantite = quantite;
    }
    public int Id {
        get { return id; }
        set { id = value; }
    }
    public object Id_activite {
        get { return id_activite; }
        set { id_activite = value; }
    }
    public object Duree {
        get { return duree; }
        set { duree = value; }
    }
    public object Prix {
        get { return prix; }
        set { prix = value; }
    }
    public object Quantite {
        get { return quantite; }
        set { quantite = value; }
    }
}
    }
}
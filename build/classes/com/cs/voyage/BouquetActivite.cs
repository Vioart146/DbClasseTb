public class BouquetActivite {
 {
    private int id;
    private object id_activite;
    private object id_bouquet;
    private object quantite;
    private object duree_activite;

    public BouquetActivite(int id, object id_activite, object id_bouquet, object quantite, object duree_activite) {
        this.id = id;
        this.id_activite = id_activite;
        this.id_bouquet = id_bouquet;
        this.quantite = quantite;
        this.duree_activite = duree_activite;
    }
    public int Id {
        get { return id; }
        set { id = value; }
    }
    public object Id_activite {
        get { return id_activite; }
        set { id_activite = value; }
    }
    public object Id_bouquet {
        get { return id_bouquet; }
        set { id_bouquet = value; }
    }
    public object Quantite {
        get { return quantite; }
        set { quantite = value; }
    }
    public object Duree_activite {
        get { return duree_activite; }
        set { duree_activite = value; }
    }
}
    }
}
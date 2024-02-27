public class Voyage {
 {
    private int id;
    private object duree;
    private object bouquet;
    private object lieu;
    private object etoile;
    private object prix;
    private string nom;

    public Voyage(int id, object duree, object bouquet, object lieu, object etoile, object prix, string nom) {
        this.id = id;
        this.duree = duree;
        this.bouquet = bouquet;
        this.lieu = lieu;
        this.etoile = etoile;
        this.prix = prix;
        this.nom = nom;
    }
    public int Id {
        get { return id; }
        set { id = value; }
    }
    public object Duree {
        get { return duree; }
        set { duree = value; }
    }
    public object Bouquet {
        get { return bouquet; }
        set { bouquet = value; }
    }
    public object Lieu {
        get { return lieu; }
        set { lieu = value; }
    }
    public object Etoile {
        get { return etoile; }
        set { etoile = value; }
    }
    public object Prix {
        get { return prix; }
        set { prix = value; }
    }
    public string Nom {
        get { return nom; }
        set { nom = value; }
    }
}
    }
}
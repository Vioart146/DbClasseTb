public class Employe {
 {
    private int id;
    private string nom;
    private string prenom;
    private object id_genre;
    private object date_naissance;
    private object date_embauche;
    private object id_poste;

    public Employe(int id, string nom, string prenom, object id_genre, object date_naissance, object date_embauche, object id_poste) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.id_genre = id_genre;
        this.date_naissance = date_naissance;
        this.date_embauche = date_embauche;
        this.id_poste = id_poste;
    }
    public int Id {
        get { return id; }
        set { id = value; }
    }
    public string Nom {
        get { return nom; }
        set { nom = value; }
    }
    public string Prenom {
        get { return prenom; }
        set { prenom = value; }
    }
    public object Id_genre {
        get { return id_genre; }
        set { id_genre = value; }
    }
    public object Date_naissance {
        get { return date_naissance; }
        set { date_naissance = value; }
    }
    public object Date_embauche {
        get { return date_embauche; }
        set { date_embauche = value; }
    }
    public object Id_poste {
        get { return id_poste; }
        set { id_poste = value; }
    }
}
    }
}
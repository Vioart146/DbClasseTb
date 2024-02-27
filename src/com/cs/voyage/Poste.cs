public class Poste {
 {
    private int id;
    private string nom;
    private object taux_horaire;

    public Poste(int id, string nom, object taux_horaire) {
        this.id = id;
        this.nom = nom;
        this.taux_horaire = taux_horaire;
    }
    public int Id {
        get { return id; }
        set { id = value; }
    }
    public string Nom {
        get { return nom; }
        set { nom = value; }
    }
    public object Taux_horaire {
        get { return taux_horaire; }
        set { taux_horaire = value; }
    }
}
    }
}
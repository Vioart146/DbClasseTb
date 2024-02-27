public class Client {
 {
    private int id;
    private string nom;
    private object id_genre;

    public Client(int id, string nom, object id_genre) {
        this.id = id;
        this.nom = nom;
        this.id_genre = id_genre;
    }
    public int Id {
        get { return id; }
        set { id = value; }
    }
    public string Nom {
        get { return nom; }
        set { nom = value; }
    }
    public object Id_genre {
        get { return id_genre; }
        set { id_genre = value; }
    }
}
    }
}
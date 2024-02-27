public class Reservations {
 {
    private int id;
    private object id_voyage;
    private object id_client;
    private object dt;

    public Reservations(int id, object id_voyage, object id_client, object dt) {
        this.id = id;
        this.id_voyage = id_voyage;
        this.id_client = id_client;
        this.dt = dt;
    }
    public int Id {
        get { return id; }
        set { id = value; }
    }
    public object Id_voyage {
        get { return id_voyage; }
        set { id_voyage = value; }
    }
    public object Id_client {
        get { return id_client; }
        set { id_client = value; }
    }
    public object Dt {
        get { return dt; }
        set { dt = value; }
    }
}
    }
}
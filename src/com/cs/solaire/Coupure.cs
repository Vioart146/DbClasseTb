using System;
namespace src.com.cs {
public class Coupure {
 {
    private object datecoupure;
    private object idsource;
    private object heurecoupure;

    public Coupure(object datecoupure, object idsource, object heurecoupure) {
        this.datecoupure = datecoupure;
        this.idsource = idsource;
        this.heurecoupure = heurecoupure;
    }
    public object Datecoupure {
        get { return datecoupure; }
        set { datecoupure = value; }
    }
    public object Idsource {
        get { return idsource; }
        set { idsource = value; }
    }
    public object Heurecoupure {
        get { return heurecoupure; }
        set { heurecoupure = value; }
    }
}
    }
}
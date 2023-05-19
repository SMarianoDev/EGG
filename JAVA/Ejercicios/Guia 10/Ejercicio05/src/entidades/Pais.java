package entidades;

import java.util.HashSet;

/**
 *
 * @author Mariano Sotelo
 */
public class Pais {

    private HashSet<String> Pais;

    public Pais() {
    }

    public Pais(HashSet<String> Pais) {
        this.Pais = Pais;
    }

    public HashSet<String> getPais() {
        return Pais;
    }

    public void setPais(HashSet<String> Pais) {
        this.Pais = Pais;
    }
    
    

//    public Pais(String Pais) {
//        this.Pais = Pais;
//    }
//    
//
//    public String getPais() {
//        return Pais;
//    }
//
//    public void setPais(String Pais) {
//        this.Pais = Pais;
//    }

    @Override
    public String toString() {
        return "Pais{" + "Pais=" + Pais + '}';
    }
}

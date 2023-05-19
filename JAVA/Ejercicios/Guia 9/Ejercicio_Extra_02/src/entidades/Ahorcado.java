
package entidades;

/**
 *
 * @author Mariano Sotelo
 */
public class Ahorcado {
    
    private String[] palabra;
    private int jugadasMaximas;
    private int letrasEncontradas;

    public Ahorcado() {
    }
    
    public Ahorcado(String[] palabra, int jugadasMaximas) {
        this.palabra = palabra;
        this.jugadasMaximas = jugadasMaximas;
    }
    
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    
    
    

}


public class Foto {

    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public String getFichero() {
        return fichero;
    }

    @Override
    public String toString() {
        return "imprimiendo...";
    }
}

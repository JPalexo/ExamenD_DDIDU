import java.time.LocalDate;
import java.util.List;

public class Peleador {;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String planetaOrigen;
    private int universo;
    private String raza;
    private List<String> tecnicas;
    private int nivelPoder;

    public Peleador(String nombre, LocalDate fechaNacimiento, String planetaOrigen, int universo, String raza, List<String> tecnicas, int nivelPoder) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.planetaOrigen = planetaOrigen;
        this.universo = universo;
        this.raza = raza;
        this.tecnicas = tecnicas;
        this.nivelPoder = nivelPoder;
    }

    public String getNombre() { return nombre; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getPlanetaOrigen() { return planetaOrigen; }
    public int getUniverso() { return universo; }
    public String getRaza() { return raza; }
    public List<String> getTecnicas() { return tecnicas; }
    public int getNivelPoder() { return nivelPoder; }

    @Override
    public String toString() {
        return "Peleador: " +
                "nombre = '" + nombre + '\'' +
                ", fecha De Nacimiento = " + fechaNacimiento +
                ", planeta De Origen = '" + planetaOrigen + '\'' +
                ", universo = " + universo +
                ", raza = '" + raza + '\'' +
                ", tecnicas = " + tecnicas +
                ", nivelPoder = " + nivelPoder;
    }
}

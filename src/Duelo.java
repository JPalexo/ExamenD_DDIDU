import java.time.LocalDateTime;

public class Duelo {
    private Peleador peleador1;
    private Peleador peleador2;
    private LocalDateTime fechaHora;

    public Duelo(Peleador peleador1, Peleador peleador2, LocalDateTime fechaHora) {
        this.peleador1 = peleador1;
        this.peleador2 = peleador2;
        this.fechaHora = fechaHora;
    }

    @Override
    public String toString() {
        return "Duelo: " +
                "peleador_1 = " + peleador1.getNombre() +
                ", peleador_2 = " + peleador2.getNombre() +
                ", fecha y hora = " + fechaHora;
    }
}

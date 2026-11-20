import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {

    private int id;
    private String nomeHospede;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private LocalDateTime CheckInRealizado;
    private LocalDateTime CheckOutRealizado;
    private StatusReserva status;
}

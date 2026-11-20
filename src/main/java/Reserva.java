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

    public Reserva (int id, String nomeHospede, LocalDate dataEntrada, LocalDate dataSaida){
        if (!dataSaida.isAfter(dataEntrada)){
            throw new IllegalArgumentException("A saída deve ser depois da entrada!"
            );
        }

    }

    public Reserva(int id, String nomeHospede, LocalDate dataEntrada, LocalDate dataSaida, LocalDateTime checkInRealizado, LocalDateTime checkOutRealizado, StatusReserva status) {
        this.id = id;
        this.nomeHospede = nomeHospede;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        CheckInRealizado = checkInRealizado;
        CheckOutRealizado = checkOutRealizado;
        this.status = StatusReserva.CONFIRMADA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDateTime getCheckInRealizado() {
        return CheckInRealizado;
    }

    public void setCheckInRealizado(LocalDateTime data) {
        CheckInRealizado = data;
    }

    public LocalDateTime getCheckOutRealizado() {
        return CheckOutRealizado;
    }

    public void setCheckOutRealizado(LocalDateTime data) {
        CheckOutRealizado = data;
    }

    public StatusReserva getStatus() {
        return status;
    }

    public void setStatus(StatusReserva status) {
        this.status = status;
    }


}

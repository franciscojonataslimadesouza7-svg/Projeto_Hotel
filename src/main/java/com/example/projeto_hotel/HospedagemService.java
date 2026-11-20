package com.example.projeto_hotel;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.projeto_hotel.Reserva;
import com.example.projeto_hotel.StatusReserva;

public class HospedagemService {

    public void realizarCheckIn(Reserva reserva){
        if (reserva == null){
            throw new IllegalArgumentException("com.example.projeto_hotel.Reserva não encontrada!");
        }
        if (reserva.getStatus() != StatusReserva.CONFIRMADA){
            throw new IllegalStateException("A reserva não está confirmada!");
        }
        LocalDate hoje = LocalDate.now();

        if (hoje.isBefore(reserva.getDataEntrada()) || hoje.isBefore(reserva.getDataSaida())) {
            throw new IllegalStateException("Check-in fora do período permitido!");
        }


    }
    public void realizarCheckOut(){

    }
}

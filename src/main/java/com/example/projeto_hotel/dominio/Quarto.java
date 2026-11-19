package com.example.projeto_hotel.dominio;

import java.time.LocalDate;

public class Quarto {
    private int numQuarto;
    private tQuarto tipoQuarto;
    private boolean ocupadoQuarto;
    private String hospede;
    private LocalDate entrada;
    private LocalDate saida;

    public Quarto(int numQuarto, tQuarto tipoQuarto, boolean ocupadoQuarto, String hospede, LocalDate entrada, LocalDate saida) {
        this.numQuarto = numQuarto;
        this.tipoQuarto = tipoQuarto;
        this.ocupadoQuarto = ocupadoQuarto;
        this.hospede = hospede;
        this.entrada = entrada;
        this.saida = saida;
    }

    public String getStatus(){
        if (ocupadoQuarto){
            return "Quarto Ocupado";
        }else{
            return "Quarto Livre";
        }
    }



    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public tQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(tQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public boolean isOcupadoQuarto() {
        return ocupadoQuarto;
    }

    public void setOcupadoQuarto(boolean ocupadoQuarto) {
        this.ocupadoQuarto = ocupadoQuarto;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }
}

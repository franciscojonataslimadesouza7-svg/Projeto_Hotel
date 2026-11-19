package com.example.projeto_hotel.dominio;

public enum tQuarto {
    STANDART("Standart"),
    LUXO("Luxo"),
    SUITE("Suite"),
    ;

     private String tipo;

     tQuarto(String tipo) {
         this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

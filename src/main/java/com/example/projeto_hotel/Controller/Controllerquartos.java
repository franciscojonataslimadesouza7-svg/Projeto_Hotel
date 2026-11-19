package com.example.projeto_hotel.Controller;

import com.example.projeto_hotel.dominio.Quarto;
import com.example.projeto_hotel.dominio.tQuarto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


import java.time.LocalDate;
import java.util.List;

public class Controllerquartos {
    @FXML
    private TableColumn<Quarto, String> ColHospede;

    @FXML
    private TableColumn<Quarto, Integer> ColNQuarto;

    @FXML
    private TableColumn<Quarto, String> ColStatus;

    @FXML
    private TableColumn<Quarto, String> ColTipo;

    @FXML
    private Button atualizarQuarto;

    @FXML
    private Label filtrarQuarto;

    @FXML
    private TableView<Quarto> tbHospedes;

    @FXML
    private ComboBox<String> tipoQuarto;

    @FXML
    private Label titleControle;

    private ObservableList<Quarto> quartos =
            FXCollections.observableArrayList();

    public void initialize(){

        tipoQuarto.getItems().add("Todos");
        tipoQuarto.getItems().add("Standart");
        tipoQuarto.getItems().add("Luxo");
        tipoQuarto.getItems().add("Suite");

        tipoQuarto.setValue("Todos");


        ColNQuarto.setCellValueFactory(
                new PropertyValueFactory<>("numQuarto"));

        ColTipo.setCellValueFactory(
                new PropertyValueFactory<>("tipoQuarto"));

        ColStatus.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        ColHospede.setCellValueFactory(
                new PropertyValueFactory<>("hospede"));


        quartos.addAll(iniciar());
        tbHospedes.setItems(quartos);



    }

    public void atualizar(){

      filtrar();

      if (quartos.isEmpty()){
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setTitle("AVISO");
          alert.setContentText("Nenhum Quarto Cadastrado");
          alert.show();
      }

        System.out.println("Botão Atualizar foi clicado!");
    }


    public void filtrar(){
      String tipoSelecionado = tipoQuarto.getValue();

      quartos.clear();

      for (Quarto quarto : iniciar()){
          if (tipoSelecionado.equals("Todos") || quarto.getTipoQuarto().getTipo().equals(tipoSelecionado)) {

              quartos.add(quarto);
          }
      }


    }

    public List<Quarto> iniciar(){
        return  List.of(
                new Quarto(101, tQuarto.STANDART, true, "jonatas",
                        LocalDate.of(2026, 11, 18),
                        LocalDate.of(2026, 11, 25)),

                new Quarto(104, tQuarto.SUITE, false, "",
                null, null),

                new Quarto(105, tQuarto.LUXO, true, "Pedro Santos",
                        LocalDate.of(2026, 11, 19),
                        LocalDate.of(2026, 11, 24)),

                new Quarto(110, tQuarto.LUXO, false, "", null, null)




        );
    }


}

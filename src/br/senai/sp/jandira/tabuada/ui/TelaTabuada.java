package br.senai.sp.jandira.tabuada.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;


import java.awt.*;

public class TelaTabuada extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        // definir o tamnho da tela
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setTitle("Tabuada");

        // Criar o root - componente de layout principal
        VBox root = new VBox();
        root.setStyle("-fx-background-color: #0081a7;");

        // criamos a cena e colocamos o root nela
        Scene scene = new Scene(root);

        // Criar o header da tela
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: #00afb9;");

        // Colocar o conteúdo no header
        Label labelTitulo = new Label("Tabuada");
        labelTitulo.setStyle("-fx-text-fill: white; -fx-font-weight: bold; -fx-font-size: 20");

        Label labelSubtitulo = new Label("Crie a tabuada que sua imaginação mandar!! ^-^");

        // Colocar labels dentro do header
        header.getChildren().addAll(labelTitulo, labelSubtitulo);

        // Criar o grid de formulário
        GridPane gridFormulario = new GridPane();
        gridFormulario.setPrefHeight(100);
        gridFormulario.setStyle("-fx-background-color: #fdfcdc;");

        // Criar gridFormularios
        Label labelMultiplicando = new Label("Multiplicador: ");
        TextField textFieldMultiplicador = new TextField();
        Label labelMenorMultiplicador = new Label("Menor Multiplicador: ");
        TextField textFieldMenorMultiplicador = new TextField();
        Label labelMaiorMultiplicador = new Label("Maior Multiplicador: ");
        TextField textFieldMaiorMultiplicador = new TextField();

        // Colocar os componentes no grid
        gridFormulario.add(labelMultiplicando, 0,0);
        gridFormulario.add(textFieldMultiplicador, 1,0);

        gridFormulario.add(labelMenorMultiplicador, 0,1);
        gridFormulario.add(textFieldMenorMultiplicador, 1,1);

        gridFormulario.add(labelMaiorMultiplicador, 0,2);
        gridFormulario.add(textFieldMaiorMultiplicador, 1, 2);

        // Criar caixa de botões
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(200);
        boxBotoes.setStyle("-fx-background-color: #fed9b7;");

        // Criar botões
        Button buttonCalcular = new Button("Calcular");
        Button buttonLimpar = new Button("Limpar");
        Button buttonSair = new Button("Sair");

        // adiconar os botões ao boxBotoes
        boxBotoes.getChildren().addAll(buttonCalcular, buttonLimpar, buttonSair);

        // Criamos caixa de resultados
        VBox boxResultados = new VBox();
        boxResultados.setPrefHeight(100);
        boxResultados.setStyle("-fx-background-color: #f07167;");

        // Criando componentes de resultados
        Label labelResultados = new Label("Resultados: ");
        ListView listaResultados = new ListView();

        // Adiconar componentes ao root
        root.getChildren().add(header);
        root.getChildren().add(gridFormulario);
        root.getChildren().add(boxBotoes);
        root.getChildren().add(boxResultados);

        stage.setScene(scene);

        stage.show();

    }


}

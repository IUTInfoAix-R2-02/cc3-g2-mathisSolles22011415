package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;


    @FXML
    Button vider = new Button();
    @FXML
    Button tracer = new Button();
    @FXML
    String comp1 = "Compétence 1 - Réaliser";
    @FXML
    String comp2 = "Compétence 2 - Optimiser";
    @FXML
    String com3 = "Compétence 3 - Administrer";
    @FXML
    String comp4 = "Compétence 4 - Gérer";
    @FXML
    String comp5 = "Compétence 5 - Conduire";
    @FXML
    String comp6 = "Compétence 6 - Collaborer";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe) {
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe - 1) * angleEnDegre)) * rayonCercleExterieur
                * (value / noteMaximale));

    }

    int getYRadarChart(double value, int axe) {
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe - 1) * angleEnDegre)) * rayonCercleExterieur
                * (value / noteMaximale));
    }
}


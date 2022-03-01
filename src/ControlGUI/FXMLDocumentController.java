/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlGUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import modelo.Punto2D;

/**
 *
 * @author dacastro
 */
public class FXMLDocumentController implements Initializable {

//    @FXML
//    private Label label;
    @FXML
    private Canvas lienzo;

    GraphicsContext g;

    @FXML
    private void bCirculo(ActionEvent event) {

        g.setStroke(Color.BLUE);
        g.setLineWidth(3);
        g.strokeOval(0, 0, 100, 100);
        g.setFill(Color.CHOCOLATE);
        g.fillOval(0, 0, 100, 100);

    }

    @FXML
    private void obtenerCoordenadas(MouseEvent event) {

//        double x = event.getX();
//        double y = event.getY();
//
//        Punto2D punto = new Punto2D(x, y);
//        g.setStroke(Color.BLUE);
//        g.setLineWidth(3);
//        g.strokeOval(x, y, 100, 100);
////        g.setFill(Color.CHOCOLATE);
////        g.fillOval(0, 0, 100, 100);
//
//        System.out.println("El Punto " + punto.toString());

    }

    @FXML
    private void pintarC(MouseEvent event) {
        double x = event.getX();
        double y = event.getY();
        g.setFill(Color.BLACK);
        g.fillOval(x, y, 10, 10);
    }

    @FXML
    private void bTriangulo(ActionEvent event) {
        double x[] = {50, 100, 0};
        double y[] = {0, 100, 100};
        g.setStroke(Color.BLUE);
        g.setLineWidth(3);
        g.strokePolygon(x, y, 3);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        g = lienzo.getGraphicsContext2D();

        double h = lienzo.getHeight();
        double w = lienzo.getWidth();

        g.setStroke(Color.AQUAMARINE);
        g.setLineWidth(3);
        g.strokeRect(0, 0, w, h);

    }

}

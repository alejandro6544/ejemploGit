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

    double x[];
    double y[];

    double coorX;
    double coorY;

    int r;

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

        coorX = event.getX();
        coorY = event.getY();
        System.out.println("El Punto " + coorX + "," + coorY);
//
//        Punto2D punto = new Punto2D(x, y);
//        g.setStroke(Color.BLUE);
//        g.setLineWidth(3);
//        g.strokeOval(x, y, 100, 100);
////        g.setFill(Color.CHOCOLATE);
////        g.fillOval(0, 0, 100, 100);
//

    }

    @FXML
    private void pintarC(MouseEvent event) {
        coorX = event.getX();
        coorY = event.getY();
        g.setFill(Color.BLACK);
        g.fillOval(coorX, coorY, 10, 10);
    }

    @FXML
    private void bTriangulo(ActionEvent event) {
//         x[] = {50, 100, 0};
//         y[] = {0, 100, 100};
        g.setStroke(Color.BLUE);
        g.setLineWidth(3);
        g.strokePolygon(x, y, 3);
    }

    @FXML
    private void pentagono(ActionEvent event) {
        x = new double[5];
        y = new double[5];

        x[0] = (coorX + r * 2);
        y[0] = coorY;

        x[1] = coorX + (r * Math.cos(2 * Math.PI / 5) * 2);
        y[1] = coorY - (r * Math.sin(2 * Math.PI / 5) * 2);

        x[2] = coorX + (r * Math.cos(2 * 2 * Math.PI / 5) * 2);
        y[2] = coorY - (r * Math.sin(2 * 2 * Math.PI / 5) * 2);

        x[3] = coorX + (r * Math.cos(3 * 2 * Math.PI / 5) * 2);
        y[3] = coorY - (r * Math.sin(3 * 2 * Math.PI / 5) * 2);

        x[4] = coorX + (r * Math.cos(4 * 2 * Math.PI / 5) * 2);
        y[4] = coorY - (r * Math.sin(4 * 2 * Math.PI / 5) * 2);

        g.setStroke(Color.BLUE);
        g.setLineWidth(3);
        g.strokePolygon(x, y, 5);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        g = lienzo.getGraphicsContext2D();
        r = 60;
        double h = lienzo.getHeight();
        double w = lienzo.getWidth();

        g.setStroke(Color.AQUAMARINE);
        g.setLineWidth(3);
        g.strokeRect(0, 0, w, h);

    }

}

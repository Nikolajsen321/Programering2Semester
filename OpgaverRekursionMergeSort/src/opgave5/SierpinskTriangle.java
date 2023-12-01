package opgave5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.Random;

public class SierpinskTriangle extends Application {

    Polygon triangle;

    @Override
    public void start(Stage stage){
        stage.setTitle("SierpinskTriangle ");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(40));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        //0 order triangle i propertioner til pane størrelsen
        Point2D p1 = new Point2D(pane.getWidth()/2,10);
        Point2D p2 = new Point2D(10,pane.getHeight()-10);
        Point2D p3 = new Point2D(pane.getWidth()-10,pane.getHeight()-10);

        triangle = new Polygon(p1.getX(),p1.getY(),p2.getX(),p2.getY(),p3.getX(),p3.getY());

        pane.add(triangle ,0,1,1,2);
        triangle.setStroke(Color.BLACK);
        triangle.setFill(Color.TRANSPARENT);





        //først parameter er x,y for højre side  næste er for venstre og sidste er for midten
















    }

}

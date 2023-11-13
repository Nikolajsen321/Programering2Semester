package opgave5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SierpinskTriangle extends Application {

    @Override
    public void start(Stage stage){
        stage.setTitle("SierpinskTriangle");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();



    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(40));
        pane.setHgap(20);
        pane.setVgap(20);

        pane.setGridLinesVisible(false);

    }

}

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class GuiEksemplerLambda extends Application {
    TextField txfField = new TextField();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo");
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



        pane.add(txfField,0,1);


        Button button = new Button("Test knap");
        pane.add(button,0,0,1,1);
        button.setAlignment(Pos.CENTER);
        /*
        I javaFx har button klassen følgende metoder
        public class Button {
        public final void setOnAction(EventHandler<ActionEvent> handler)
        { ... }
                             }
          med funktionel interface:
          @FunctionalInterface
          public interface EventHandler<ActionEvent> {
          public void handle(ActionEvent event);

          Metoden setOnAction() kan derfor kaldes med en lambda funktion
          her er det den korte form for en lambda funktion er anvendt (dvs ingen type på parameteren og ingen
          krøllede parenteser)
         */
        button.setOnAction(event -> System.out.println("Sup"));
        /*
        ofte skal en lambda funktion i tilknytning til en button udføre mange linjer kode
        i dette tilfælde er det bedst at definere en metode som indeholder de mange linjer kode
        Lambda funktionen skal så indeholde et kald til metoden
         */
        button.setOnAction(event -> printAction());




    }

    private void printAction() {
        if(txfField.getText().isBlank()){
            txfField.setText("Hejsa");
        }else{
            txfField.clear();
        }
    }
}

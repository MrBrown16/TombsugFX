package view;

import com.github.mrbrown16.inputlib.ButtonPanel;
import com.github.mrbrown16.inputlib.InputPanel;
import com.github.mrbrown16.inputlib.TitlePanel;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    TitlePanel titlePanel;
    InputPanel sidePanel;
    InputPanel alphaPanel;
    ButtonPanel buttonPanel;
    InputPanel radiusPanel;





    public MainPanel() {
        this.titlePanel = new TitlePanel();
        this.sidePanel = new InputPanel();
        this.alphaPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.radiusPanel = new InputPanel();
        this.titlePanel.setText("Rombuszba írható kör sugara");
        this.sidePanel.setText("Oldal: ");
        this.alphaPanel.setText("Alfa szög: ");
        this.buttonPanel.setText("Számít");
        this.radiusPanel.setText("Kör sugara: ");
        this.getChildren().add(titlePanel);
        this.getChildren().add(sidePanel);
        this.getChildren().add(alphaPanel);
        this.getChildren().add(buttonPanel);
        this.getChildren().add(radiusPanel);
    }
    
    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }
    public InputPanel getSidePanel() {
        return sidePanel;
    }
    public InputPanel getAlphaPanel() {
        return alphaPanel;
    }

    public InputPanel getRadiusPanel() {
        return radiusPanel;
    }
}

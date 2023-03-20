package control;

import javafx.scene.control.Button;
import model.MainModel;
import view.MainPanel;

public class MainControl {
        MainPanel mainPanel;
        MainModel mainModel;


    public MainControl() {
        this.mainPanel = new MainPanel();
        this.handleEvent();
        this.mainModel = new MainModel();
    }

    public void handleEvent() {
        Button calcButton = this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {
            System.out.println("BU!");
            String sideStr = this.mainPanel.getSidePanel().getValue();
            String alphaStr = this.mainPanel.getAlphaPanel().getValue();
            double side = Double.parseDouble(sideStr);
            double alpha = Double.parseDouble(alphaStr);
            Double radius =  mainModel.calcRadius(side, alpha);
            this.mainPanel.getRadiusPanel().setValue(radius.toString());;
        });
    }

    public MainPanel getMainPanel() {
            return mainPanel;
        }    
}

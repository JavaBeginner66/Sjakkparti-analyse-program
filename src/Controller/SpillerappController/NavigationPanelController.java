package Controller.SpillerappController;

import Model.AdmappModel.FinalChessObject;
import Model.AdmappModel.MoveDescriptionObject;
import View.SpillerappView.MainFrame;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.util.TreeMap;

public class NavigationPanelController implements EventHandler<ActionEvent> {

    private MainFrame mainFrame;

    private static int moveCount = 1;

    public NavigationPanelController(MainFrame mainFrame){
        this.mainFrame = mainFrame;
    }

    @Override
    public void handle(ActionEvent event) {
        System.out.print("Event");
        Button b = (Button) event.getSource();
        String txt = b.getText();
        System.out.print(txt);
        switch(txt){
            case "Neste":
                nextMove();
                break;
            case "Forrige":
                previousMove();
                break;
            case "Auto":
                autoPlay();
                break;
        }
    }

    private void nextMove(){
        FinalChessObject c = (FinalChessObject)mainFrame.getDisplayPanel().getMatches().getSelectionModel().getSelectedItem();
        TreeMap<Integer, MoveDescriptionObject> moves = c.getMoves();
        System.out.print(moves.get(moveCount));

        moveCount++;
    }

    private void previousMove(){

    }

    private void autoPlay(){

    }
}
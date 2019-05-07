package Model.SpillerappModel;


import View.SpillerappView.MainFrame;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class CreateBoard {

    private ArrayList<ChessCell> chessCells;

    private String[] chessPositions = {"A8", "A7", "A6", "A5", "A4", "A3", "A2", "A1",
            "B8", "B7", "B6", "B5", "B4", "B3", "B2", "B1",
            "C8", "C7", "C6", "C5", "C4", "C3", "C2", "C1",
            "D8", "D7", "D6", "D5", "D4", "D3", "D2", "D1",
            "E8", "E7", "E6", "E5", "E4", "E3", "E2", "E1",
            "F8", "F7", "F6", "F5", "F4", "F3", "F2", "F1",
            "G8", "G7", "G6", "G5", "G4", "G3", "G2", "G1",
            "H8", "H7", "H6", "H5", "H4", "H3", "H2", "H1"};

    public CreateBoard(MainFrame mainFrame){

        chessCells = new ArrayList<>();
        ChessCell cell;
        int colorCount = 1;
        int iterate = 0;
        for(int i = 0; i<8; i++) {
            for (int j = 0; j <8; j++) {
                mainFrame.getChessPanel().add(cell = new ChessCell(colorCount%2, chessPositions[iterate]), i, j);
                chessCells.add(cell);
                colorCount++;
                iterate++;
            }
            colorCount++;
        }
    }

    public ArrayList<ChessCell> getChessCells() {
        return chessCells;
    }
}

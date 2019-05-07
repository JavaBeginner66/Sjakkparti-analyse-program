package Model.AdmappModel;

import java.io.Serializable;

public class MatchResult implements Serializable {

    private static final long serialVersionUID = 2456611477146739147L;
    private ChessMatchInfo matchInfo;
    private String result;

    public MatchResult(ChessMatchInfo info, String result){
        this.matchInfo = info;
        this.result = result;
    }

    @Override
    public String toString() {
        return matchInfo + " Resultat: " + result;
    }

    /* Get methods */
    public ChessMatchInfo getMatchInfo() {
        return matchInfo;
    }

    public String getResult() {
        return result;
    }
}

package View.AdmappView.Observer;

import View.AdmappView.MainFrame;
import View.AdmappView.Observer.Interface.Callback;

public class CallbackGUI implements Callback {

    private final MainFrame mainFrame;

    public CallbackGUI(MainFrame mainFrame){
        this.mainFrame = mainFrame;

    }

    @Override
    public void update() {
        mainFrame.getRegisterMatchPanel().update();
        /*
        mainFrame.getResultPanel().update();
        mainFrame.getRegisterMovePanel().update();
        */

    }
}

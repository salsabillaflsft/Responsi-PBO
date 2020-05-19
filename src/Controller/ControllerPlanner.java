package Controller;

import MVC.MVC_Landing;
import Model.ModelPlanner;
import View.ViewPlanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerPlanner {
    ModelPlanner modelPlanner;
    ViewPlanner viewPlanner;

    public ControllerPlanner(ModelPlanner modelPlanner, ViewPlanner viewPlanner) {
        this.modelPlanner = modelPlanner;
        this.viewPlanner = viewPlanner;

        viewPlanner.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewPlanner.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
    }
}

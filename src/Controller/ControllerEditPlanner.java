package Controller;

import MVC.MVC_Landing;
import Model.ModelPlanner;
import View.ViewEditPlanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerEditPlanner {
    ModelPlanner modelPlanner;
    ViewEditPlanner viewEditPlanner;

    public ControllerEditPlanner(ModelPlanner modelPlanner, ViewEditPlanner viewEditPlanner) {
        this.modelPlanner = modelPlanner;
        this.viewEditPlanner = viewEditPlanner;

        viewEditPlanner.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditPlanner.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
    }
}

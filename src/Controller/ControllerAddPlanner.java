package Controller;

import MVC.MVC_Landing;
import Model.ModelPlanner;
import View.ViewAddPlanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerAddPlanner {
    ModelPlanner modelPlanner;
    ViewAddPlanner viewAddPlanner;

    public ControllerAddPlanner(ModelPlanner modelPlanner, ViewAddPlanner viewAddPlanner) {
        this.modelPlanner = modelPlanner;
        this.viewAddPlanner = viewAddPlanner;

        viewAddPlanner.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddPlanner.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
    }
}

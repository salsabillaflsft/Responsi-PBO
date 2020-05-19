package Controller;

import MVC.MVC_AddPlanner;
import MVC.MVC_EditPlanner;
import MVC.MVC_Logout;
import MVC.MVC_Planner;
import View.ViewLanding;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerLanding {
    ViewLanding viewLanding;
    public ControllerLanding(ViewLanding viewLanding){
        this.viewLanding=viewLanding;

        viewLanding.btnSee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLanding.setVisible(false);
                MVC_Planner mvc_planner = new MVC_Planner();
            }
        });
        viewLanding.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLanding.setVisible(false);
                MVC_AddPlanner mvc_addPlanner = new MVC_AddPlanner();
            }
        });
        viewLanding.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLanding.setVisible(false);
                MVC_EditPlanner mvc_editPlanner = new MVC_EditPlanner();
            }
        });
        viewLanding.btnOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLanding.setVisible(false);
                MVC_Logout mvc_logout = new MVC_Logout();
            }
        });
    }

}

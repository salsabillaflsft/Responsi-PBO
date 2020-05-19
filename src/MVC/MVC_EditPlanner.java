package MVC;

import Controller.ControllerEditPlanner;
import Model.ModelPlanner;
import View.ViewEditPlanner;

public class MVC_EditPlanner {
    public MVC_EditPlanner(){
        ViewEditPlanner viewEditPlanner = new ViewEditPlanner();
        ModelPlanner modelPlanner = new ModelPlanner();
        ControllerEditPlanner controllerEditPlanner = new ControllerEditPlanner(modelPlanner,viewEditPlanner);
    }
}

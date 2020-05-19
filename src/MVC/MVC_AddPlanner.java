package MVC;

import Controller.ControllerAddPlanner;
import Model.ModelPlanner;
import View.ViewAddPlanner;

public class MVC_AddPlanner {
    public MVC_AddPlanner(){
        ViewAddPlanner viewAddPlanner = new ViewAddPlanner();
        ModelPlanner modelPlanner = new ModelPlanner();
        ControllerAddPlanner controllerAddPlanner = new ControllerAddPlanner(modelPlanner,viewAddPlanner);
    }
}

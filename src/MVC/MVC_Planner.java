package MVC;

import Controller.ControllerPlanner;
import Model.ModelPlanner;
import View.ViewPlanner;

public class MVC_Planner {
    public MVC_Planner(){
        ViewPlanner viewPlanner = new ViewPlanner();
        ModelPlanner modelPlanner = new ModelPlanner();
        ControllerPlanner controllerPlanner = new ControllerPlanner(modelPlanner,viewPlanner);
    }
}

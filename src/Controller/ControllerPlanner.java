package Controller;

import Model.ModelPlanner;
import View.ViewPlanner;

public class ControllerPlanner {
    ModelPlanner modelPlanner;
    ViewPlanner viewPlanner;

    public ControllerPlanner(ModelPlanner modelPlanner, ViewPlanner viewPlanner) {
        this.modelPlanner = modelPlanner;
        this.viewPlanner = viewPlanner;
    }
}

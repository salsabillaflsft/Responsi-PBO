package MVC;

import Controller.ControllerHome;
import Model.ModelHome;
import View.ViewHome;

public class MVC_Home {
    ViewHome viewHome = new ViewHome();
    ModelHome modelHome = new ModelHome();
    ControllerHome controllerHome = new ControllerHome(modelHome,viewHome);
}

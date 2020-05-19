package MVC;

import Controller.ControllerLogout;
import View.ViewLogout;

public class MVC_Logout {
    public MVC_Logout(){
        ViewLogout viewLogout = new ViewLogout();
        ControllerLogout controllerLogout = new ControllerLogout(viewLogout);
    }
}

package MVC;

import Controller.ControllerLanding;
import View.ViewLanding;

public class MVC_Landing {
    public MVC_Landing(){
        ViewLanding viewLanding = new ViewLanding();
        ControllerLanding controllerLanding = new ControllerLanding(viewLanding);
    }

}

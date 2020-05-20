package MVC;

import Controller.ControllerBook;
import Model.ModelBook;
import View.ViewBook;

public class MVC_Book {
    public MVC_Book(){
        ViewBook viewBook = new ViewBook();
        ModelBook modelBook = new ModelBook();
        ControllerBook controllerBook = new ControllerBook(modelBook, viewBook);
    }
}

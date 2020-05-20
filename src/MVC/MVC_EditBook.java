package MVC;

import Controller.ControllerEditBook;
import Model.ModelBook;
import View.ViewEditBook;

public class MVC_EditBook {
    public MVC_EditBook(){
        ViewEditBook viewEditBook = new ViewEditBook();
        ModelBook modelBook = new ModelBook();
        ControllerEditBook controllerEditBook = new ControllerEditBook(modelBook, viewEditBook);
    }
}

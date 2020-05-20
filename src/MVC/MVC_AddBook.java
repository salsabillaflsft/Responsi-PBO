package MVC;

import Controller.ControllerAddBook;
import Model.ModelBook;
import View.ViewAddBook;

public class MVC_AddBook {
    public MVC_AddBook(){
        ViewAddBook viewAddBook = new ViewAddBook();
        ModelBook modelBook = new ModelBook();
        ControllerAddBook controllerAddBook = new ControllerAddBook(modelBook, viewAddBook);
    }
}

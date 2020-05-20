package Controller;

import MVC.MVC_AddBook;
import MVC.MVC_EditBook;
import MVC.MVC_Logout;
import MVC.MVC_Book;
import View.ViewLanding;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerLanding {
    ViewLanding viewLanding;
    public ControllerLanding(ViewLanding viewLanding){
        this.viewLanding=viewLanding;

        viewLanding.btnSee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLanding.setVisible(false);
                MVC_Book mvc_book = new MVC_Book();
            }
        });
        viewLanding.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLanding.setVisible(false);
                MVC_AddBook mvc_addBook = new MVC_AddBook();
            }
        });
        viewLanding.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLanding.setVisible(false);
                MVC_EditBook mvc_editBook = new MVC_EditBook();
            }
        });
        viewLanding.btnOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLanding.setVisible(false);
                MVC_Logout mvc_logout = new MVC_Logout();
            }
        });
    }

}

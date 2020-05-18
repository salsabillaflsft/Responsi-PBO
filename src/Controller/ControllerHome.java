package Controller;

import MVC.MVC_Landing;
import Model.ModelHome;
import View.ViewHome;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerHome {
    ModelHome modelHome;
    ViewHome viewHome;

    public ControllerHome(ModelHome modelHome, ViewHome viewHome) {
        this.modelHome = modelHome;
        this.viewHome = viewHome;

        viewHome.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (viewHome.getUser().equals("")) {
                    JOptionPane.showMessageDialog(null, "Username Kosong");
                } else if (viewHome.getPass().equals("")) {
                    JOptionPane.showMessageDialog(null, "Password Kosong");
                } else {
                    try {
                        String Username = viewHome.getUser();
                        String Password = viewHome.getPass();
                        String data[][] = modelHome.logIn(Username, Password);
                        if ( Username.equals(data[0][1]) && Password.equals(data[0][2])) {
                            System.out.println("Login Success");
                            JOptionPane.showMessageDialog(null, "Login Berhasil!");
                            viewHome.setVisible(false);
                            MVC_Landing mvc_landing = new MVC_Landing();
                        } else {
                            System.out.println("Login Gagal");
                            JOptionPane.showMessageDialog(null, "Username/Password Salah");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });
        viewHome.btnRegis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = viewHome.getUser();
                String Password = viewHome.getPass();
                modelHome.addUser(Username,Password);
            }
        });
    }
}

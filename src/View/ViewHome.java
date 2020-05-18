package View;

import javax.swing.*;
import java.awt.*;

public class ViewHome extends JFrame {
    JLabel title = new JLabel("PLANNER");

    JLabel lUser = new JLabel("Username : ");
    JTextField tfUser = new JTextField();
    JLabel lPass = new JLabel("Password : ");
    JTextField tfPass = new JTextField();

    public JButton btnLogin = new JButton("Log In");
    public JButton btnRegis = new JButton("Register");


    Color red2 = new Color(210, 55, 58);
    Color red = new Color(240, 87, 87);
    Color green2 = new Color(61, 99, 65);
    Color green = new Color(122, 200, 169);
    Color green3 = new Color(214, 236, 225);
    Color yellow = new Color(255, 204, 10);
    Color orange = new Color(245, 138, 40);
    Color blue = new Color(80,121,154);
    Color blue2 = new Color(66,58,100);


    ImageIcon img = new ImageIcon("src\\Assets\\home.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond", Font.PLAIN, 25);

    public ViewHome() {
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400, 50, 1200, 700);

        add(title);
        title.setBounds(470, 50, 500, 50);
        title.setFont(new Font("Garamond", Font.BOLD, 60));

        add(logo);
        logo.setBounds(100, 100, 728, 521);

        add(lUser);
        lUser.setBounds(850, 150, 200, 25);
        lUser.setFont(font);
        add(tfUser);
        tfUser.setBounds(850, 200, 200, 30);
        tfUser.setBackground(green3);
        add(lPass);
        lPass.setBounds(850, 250, 200, 25);
        lPass.setFont(font);
        add(tfPass);
        tfPass.setBounds(850, 300, 200, 30);
        tfPass.setBackground(green3);

        add(btnLogin);
        btnLogin.setBounds(900, 350, 100, 40);
        btnLogin.setBackground(blue);
        btnLogin.setForeground(green3);
        add(btnRegis);
        btnRegis.setBounds(900, 400, 100, 40);
        btnRegis.setBackground(blue2);
        btnRegis.setForeground(green3);

    }
    public String getUser(){
        return tfUser.getText();
    }
    public String getPass(){
        return tfPass.getText();
    }

}


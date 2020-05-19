package View;

import javax.swing.*;
import java.awt.*;

public class ViewLogout extends JFrame {
    JLabel title = new JLabel("123180144");

    public JButton btnLogin = new JButton("Kembali Login");

    Color pink = new Color(255,193,193);
    Color blue2 = new Color(66,58,100);

    ImageIcon img = new ImageIcon("src\\Assets\\logout.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond",Font.PLAIN,25);

    public ViewLogout(){
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(450,50,800,50);
        title.setFont(new Font("Helvetica",Font.PLAIN,50));
        title.setForeground(blue2);

        add(logo);
        logo.setBounds(300,120,567,378);

        add(btnLogin);
        btnLogin.setBounds(500, 540, 180, 40);
        btnLogin.setFont(new Font("Helvetica",Font.ITALIC,20));
        btnLogin.setBackground(pink);
        btnLogin.setForeground(blue2);

    }
}

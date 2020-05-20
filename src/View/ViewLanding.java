package View;

import javax.swing.*;
import java.awt.*;

public class ViewLanding extends JFrame{
    JLabel title = new JLabel("YOUR");
    JLabel title2 = new JLabel("LIBRARY");

    public JButton btnSee = new JButton("Lihat Daftar Pinjam");
    public JButton btnAdd = new JButton("Tambah Pinjaman");
    public JButton btnEdit = new JButton("Edit Pinjaman");
    public JButton btnOut = new JButton("Log Out");

    Color red2 = new Color(210, 55, 58);
    Color red = new Color(240, 87, 87);
    Color pink = new Color(255,193,193);
    Color pink2 = new Color(254,149,142);
    Color green2 = new Color(61, 99, 65);
    Color green = new Color(122, 200, 169);
    Color green3 = new Color(214, 236, 225);
    Color yellow = new Color(255, 204, 10);
    Color orange = new Color(245, 138, 40);
    Color blue = new Color(80,121,154);
    Color blue2 = new Color(66,58,100);
    Color blue3 = new Color(14,36,165);
    Color blue4 = new Color(66,90,194);
    Color blue5 = new Color(164,184,234);
    Color grey = new Color(204,204,204);

    ImageIcon img = new ImageIcon("src\\Assets\\landing.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Times New Roman",Font.ITALIC,25);
    Font font2 = new Font ("Garamond", Font.BOLD,  50);

    public ViewLanding(){
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(533,50,800,50);
        title.setFont(font2);
        title.setForeground(blue);
        add(title2);
        title2.setBounds(505,110,500,50);
        title2.setFont(font2);
        title2.setForeground(blue);

        add(logo);
        logo.setBounds(350,140,457,457);

        add(btnSee);
        btnSee.setBounds(850, 230, 250, 60);
        btnSee.setFont(font);
        btnSee.setBackground(blue);
        btnSee.setForeground(pink);

        add(btnAdd);
        btnAdd.setBounds(80, 230, 250, 60);
        btnAdd.setFont(font);
        btnAdd.setBackground(blue);
        btnAdd.setForeground(pink);

        add(btnEdit);
        btnEdit.setBounds(80, 330, 250, 60);
        btnEdit.setFont(font);
        btnEdit.setBackground(blue);
        btnEdit.setForeground(pink);

        add(btnOut);
        btnOut.setBounds(1050, 50, 110, 50);
        btnOut.setFont(new Font("Garamond",Font.BOLD, 20));
        btnOut.setBackground(pink2);
        btnOut.setForeground(blue);

    }


}

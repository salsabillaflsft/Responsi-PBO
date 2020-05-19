package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewPlanner extends JFrame {
    JLabel title = new JLabel("YOUR PLANNER");
    JLabel title2 = new JLabel("YOUR PLANNER");

    public JButton btnHome = new JButton("Home");

    public JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane jScrollPane;
    public Object[] namaKolom = {"No","Plan","Category","Day","Time","Status"};

    Color blue = new Color(80,121,154);
    Color blue2 = new Color(66,58,100);
    Color blue5 = new Color(164,184,234);

    ImageIcon img = new ImageIcon("src\\Assets\\planner1.jpg");
    JLabel logo = new JLabel(img);
    ImageIcon img2 = new ImageIcon("src\\Assets\\planner2.jpg");
    JLabel logo2 = new JLabel(img2);


    Font font = new Font("Garamond",Font.ITALIC,20);

    public ViewPlanner(){
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        jScrollPane = new JScrollPane(tabel);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(420,50,800,50);
        title.setFont(new Font("Garamond",Font.BOLD,50));
        title.setForeground(blue);
        add(title2);
        title2.setBounds(445,90,800,50);
        title2.setFont(new Font("Garamond",Font.BOLD,45));
        title2.setForeground(blue5);

        add(jScrollPane);
        jScrollPane.setBounds(100,180,1000,400);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(logo);
        logo.setBounds(250,25,93,138);
        add(logo2);
        logo2.setBounds(900,45,84,119);

        add(btnHome);
        btnHome.setBounds(30, 55, 75, 50);
        btnHome.setFont(font);
        btnHome.setBackground(blue5);
        btnHome.setForeground(blue2);
    }

}

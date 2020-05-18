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
    public Object[] namaKolom = {"No","Plan","Kategori","Hari","Waktu","Status"};
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
        btnHome.setBackground(blue);
        btnHome.setForeground(blue5);
    }

}

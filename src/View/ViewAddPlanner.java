package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewAddPlanner extends JFrame {
    JLabel title = new JLabel("ADD PLAN");
    JLabel title2 = new JLabel("ADD PLAN");

    JLabel lPlan = new JLabel("Plan: ");
    public JTextField tfPlan = new JTextField();
    JLabel lKategori = new JLabel("Category: ");
    public JComboBox cbKategori = new JComboBox();
    JLabel lWaktu = new JLabel("Time: ");
    public JComboBox cbWaktu = new JComboBox();
    JLabel lStatus = new JLabel("Status: ");
    public JTextField tfStatus = new JTextField();


    public JButton btnHome = new JButton("Home");
    public JButton btnAdd = new JButton("Add");
    public JButton btnReset = new JButton("Reset");

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

    ImageIcon img = new ImageIcon("src\\Assets\\time.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond",Font.ITALIC,20);
    Font font2 = new Font("Garamond",Font.PLAIN,20);

    public JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object[] namaKolom = {"id_kategori", "Nama_kategori"};
    public ViewAddPlanner(){
        tableModel = new DefaultTableModel(getNamaKolom(), 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(320,50,800,50);
        title.setFont(new Font("Garamond",Font.BOLD,50));
        title.setForeground(pink2);
        add(title2);
        title2.setBounds(330,100,800,50);
        title2.setFont(new Font("Garamond",Font.BOLD,45));
        title2.setForeground(pink);

        add(logo);
        logo.setBounds(680,10,477,635);

        add(lPlan);
        lPlan.setBounds(150,180,100,35);
        lPlan.setFont(font2);
        add(tfPlan);
        tfPlan.setBounds(330,180,300,35);

        add(lKategori);
        lKategori.setBounds(150,230,100,35);
        lKategori.setFont(font2);
        add(cbKategori);
        cbKategori.setBounds(330,230,300,35);

        add(lWaktu);
        lWaktu.setFont(font2);
        lWaktu.setBounds(150,280,200,35);
        add(cbWaktu);
        cbWaktu.setBounds(330,280,300,35);

        add(lStatus);
        lStatus.setFont(font2);
        lStatus.setBounds(150,330,200,35);
        add(tfStatus);
        tfStatus.setBounds(330,330,300,35);

        add(btnAdd);
        btnAdd.setBounds(530, 400, 100, 50);
        btnAdd.setFont(font);
        btnAdd.setBackground(green);
        add(btnReset);
        btnReset.setBounds(530, 480, 100, 50);
        btnReset.setFont(font);
        btnReset.setBackground(red);

        add(btnHome);
        btnHome.setBounds(30, 55, 75, 50);
        btnHome.setFont(font);
        btnHome.setBackground(pink2);
        btnHome.setForeground(Color.black);
    }
    public String getPlan(){
        return tfPlan.getText();
    }
    public String getStatus(){
        return tfStatus.getText();
    }
    public String getKategori(){ return cbKategori.getSelectedItem().toString();}
    public String getWaktu(){ return cbWaktu.getSelectedItem().toString();}

    public Object[] getNamaKolom() {
        return namaKolom;
    }
    public void setNamaKolom(Object[] namaKolom) {
        this.namaKolom = namaKolom;
    }
}

package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewAddBook extends JFrame {
    JLabel title = new JLabel("ADD BOOK");
    JLabel title2 = new JLabel("ADD BOOK");

    JLabel lMhs = new JLabel("ID Mahasiswa: ");
    public JComboBox cbMhs = new JComboBox();
    JLabel lBook = new JLabel("Book: ");
    public JTextField tfBook = new JTextField();
    JLabel lId = new JLabel("ID Buku: ");
    public JTextField tfId = new JTextField();
    JLabel lKategori = new JLabel("Category: ");
    public JComboBox cbKategori = new JComboBox();
    

    public JButton btnHome = new JButton("Home");
    public JButton btnAdd = new JButton("Add");
    public JButton btnReset = new JButton("Reset");

    Color red = new Color(240, 87, 87);
    Color pink = new Color(255,193,193);
    Color pink2 = new Color(254,149,142);
    Color green = new Color(122, 200, 169);

    ImageIcon img = new ImageIcon("src\\Assets\\book2.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond",Font.ITALIC,20);
    Font font2 = new Font("Garamond",Font.PLAIN,20);

    public JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object[] namaKolom = {"id_mahasiswa", "nama"};
    public ViewAddBook(){
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
        logo.setBounds(700,25,477,635);

        add(lBook);
        lBook.setBounds(150,180,100,35);
        lBook.setFont(font2);
        add(tfBook);
        tfBook.setBounds(330,180,300,35);

        add(lKategori);
        lKategori.setBounds(150,230,100,35);
        lKategori.setFont(font2);
        add(cbKategori);
        cbKategori.setBounds(330,230,300,35);

        add(lMhs);
        lMhs.setFont(font2);
        lMhs.setBounds(150,280,200,35);
        add(cbMhs);
        cbMhs.setBounds(330,280,300,35);

        add(lId);
        lId.setFont(font2);
        lId.setBounds(150,330,200,35);
        add(tfId);
        tfId.setBounds(330,330,300,35);

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
    public String getBook(){
        return tfBook.getText();
    }
    public String getId(){
        return tfId.getText();
    }
    public String getKategori(){ return cbKategori.getSelectedItem().toString();}
    public String getMhs(){ return cbMhs.getSelectedItem().toString();}

    public Object[] getNamaKolom() {
        return namaKolom;
    }
}

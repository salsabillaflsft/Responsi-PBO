package Controller;

import MVC.MVC_Landing;
import Model.ModelPlanner;
import View.ViewPlanner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerPlanner {
    ModelPlanner modelPlanner;
    ViewPlanner viewPlanner;

    public ControllerPlanner(ModelPlanner modelPlanner, ViewPlanner viewPlanner) {
        this.modelPlanner = modelPlanner;
        this.viewPlanner = viewPlanner;

        if (modelPlanner.getBanyakData() != 0) {
            String data[][] = modelPlanner.readPlanner();
            viewPlanner.tabel.setModel((new JTable(data, viewPlanner.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        viewPlanner.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewPlanner.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
        viewPlanner.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewPlanner.tabel.getSelectedRow();
                int kolom = viewPlanner.tabel.getSelectedColumn();

                String dataterpilih = viewPlanner.tabel.getValueAt(baris, 0).toString();
                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus planner " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    modelPlanner.deletePlanner(dataterpilih);
                    String newData[][] = modelPlanner.readPlanner();
                    viewPlanner.tabel.setModel(new JTable(newData,viewPlanner.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
    }
}

package Controller;

import MVC.MVC_Landing;
import Model.ModelPlanner;
import View.ViewAddPlanner;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControllerAddPlanner {
    ModelPlanner modelPlanner;
    ViewAddPlanner viewAddPlanner;

    public ControllerAddPlanner(ModelPlanner modelPlanner, ViewAddPlanner viewAddPlanner) {
        this.modelPlanner = modelPlanner;
        this.viewAddPlanner = viewAddPlanner;

        if (modelPlanner.getBanyakData2() != 0){
            String[][] readNamaKategori = modelPlanner.readPlanner();
            viewAddPlanner.table.setModel((TableModel) new JTable(readNamaKategori, viewAddPlanner.namaKolom).getModel());
            updateDataCombo(modelPlanner.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        if (modelPlanner.getBanyakData3() != 0){
            String[][] readNamaHari = modelPlanner.readWaktu();
            viewAddPlanner.table.setModel((TableModel) new JTable(readNamaHari, viewAddPlanner.namaKolom).getModel());
            updateDataCombo2(modelPlanner.readNamaHari());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }
        viewAddPlanner.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddPlanner.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
        viewAddPlanner.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddPlanner.tfPlan.setText("");
                viewAddPlanner.tfStatus.setText("");
            }
        });
        viewAddPlanner.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewAddPlanner.getPlan();
                String kategori = viewAddPlanner.getKategori();
                String waktu = viewAddPlanner.getWaktu();
                String status = viewAddPlanner.getStatus();
                modelPlanner.insertPlanner(nama,kategori,waktu,status);
            }
        });
    }

    private void updateDataCombo(ArrayList<String> readNamaKategori) {
        viewAddPlanner.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewAddPlanner.cbKategori.addItem(item);
        }
    }
    private void updateDataCombo2(ArrayList<String> readNamaHari) {
        viewAddPlanner.cbWaktu.removeAllItems();
        for (String item : readNamaHari) {
            viewAddPlanner.cbWaktu.addItem(item);
        }
    }
}

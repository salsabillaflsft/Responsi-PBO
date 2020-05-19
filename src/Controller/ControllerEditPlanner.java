package Controller;

import MVC.MVC_Landing;
import Model.ModelPlanner;
import View.ViewEditPlanner;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControllerEditPlanner {
    ModelPlanner modelPlanner;
    ViewEditPlanner viewEditPlanner;

    public ControllerEditPlanner(ModelPlanner modelPlanner, ViewEditPlanner viewEditPlanner) {
        this.modelPlanner = modelPlanner;
        this.viewEditPlanner = viewEditPlanner;

        if (modelPlanner.getBanyakData() != 0){
            String[][] readNamaProduk = modelPlanner.readPlanner();
            viewEditPlanner.table.setModel((TableModel) new JTable(readNamaProduk, viewEditPlanner.namaKolom).getModel());
            updateDataCombo(modelPlanner.readNamaPlanner());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }
        if (modelPlanner.getBanyakData2() != 0){
            String[][] readNamaKategori = modelPlanner.readKategori();
            viewEditPlanner.table.setModel((TableModel) new JTable(readNamaKategori, viewEditPlanner.namaKolom).getModel());
            updateDataCombo2(modelPlanner.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        if (modelPlanner.getBanyakData3() != 0){
            String[][] readNamaSupplier = modelPlanner.readWaktu();
            viewEditPlanner.table.setModel((TableModel) new JTable(readNamaSupplier, viewEditPlanner.namaKolom).getModel());
            updateDataCombo3(modelPlanner.readNamaHari());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }
        viewEditPlanner.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditPlanner.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
        viewEditPlanner.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditPlanner.tfStatus.setText("");
            }
        });
        viewEditPlanner.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewEditPlanner.getPlan();
                String kategori = viewEditPlanner.getKategori();
                String waktu = viewEditPlanner.getWaktu();
                String status = viewEditPlanner.getStatus();
                if (status.equals("")){
                    JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
                } else {
                    modelPlanner.updatePlanner(nama,kategori,waktu,status);
                    String newData[][] = modelPlanner.readPlanner();
                    viewEditPlanner.table.setModel(new JTable(newData, viewEditPlanner.namaKolom).getModel());
                    updateDataCombo(modelPlanner.readNamaPlanner());
                }

            }
        });
    }
    private void updateDataCombo3(ArrayList<String> readNamaHari) {
        viewEditPlanner.cbWaktu.removeAllItems();
        for (String item : readNamaHari) {
            viewEditPlanner.cbWaktu.addItem(item);
        }
    }

    private void updateDataCombo2(ArrayList<String> readNamaKategori) {
        viewEditPlanner.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewEditPlanner.cbKategori.addItem(item);
        }
    }

    private void updateDataCombo(ArrayList<String> readPlan) {
        viewEditPlanner.cbPlan.removeAllItems();
        for (String item : readPlan) {
            viewEditPlanner.cbPlan.addItem(item);
        }
    }
}

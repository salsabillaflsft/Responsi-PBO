package Controller;

import MVC.MVC_Landing;
import Model.ModelBook;
import View.ViewAddBook;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ControllerAddBook {
    ModelBook modelBook;
    ViewAddBook viewAddBook;

    public ControllerAddBook(ModelBook modelBook, ViewAddBook viewAddBook) {
        this.modelBook = modelBook;
        this.viewAddBook = viewAddBook;

        if (modelBook.getBanyakData2() != 0){
            String[][] readNamaKategori = modelBook.readKategori();
            viewAddBook.table.setModel((TableModel) new JTable(readNamaKategori, viewAddBook.namaKolom).getModel());
            updateDataCombo(modelBook.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        if (modelBook.getBanyakData3() != 0){
            String[][] readNamaMhs = modelBook.readMhs();
            viewAddBook.table.setModel((TableModel) new JTable(readNamaMhs, viewAddBook.namaKolom).getModel());
            updateDataCombo2(modelBook.readNamaMhs());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }
        viewAddBook.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddBook.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
        viewAddBook.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddBook.tfBook.setText("");
                viewAddBook.tfId.setText("");
            }
        });
        viewAddBook.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewAddBook.getBook();
                String kategori = viewAddBook.getKategori();
                String mhs = viewAddBook.getMhs();
                String id = viewAddBook.getId();
                modelBook.insertBook(mhs,kategori,id,nama);
            }
        });
    }

    private void updateDataCombo(ArrayList<String> readNamaKategori) {
        viewAddBook.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewAddBook.cbKategori.addItem(item);
        }
    }
    private void updateDataCombo2(ArrayList<String> readNamaHari) {
        viewAddBook.cbMhs.removeAllItems();
        for (String item : readNamaHari) {
            viewAddBook.cbMhs.addItem(item);
        }
    }
}

package Controller;

import MVC.MVC_Landing;
import Model.ModelBook;
import View.ViewEditBook;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControllerEditBook {
    ModelBook modelBook;
    ViewEditBook viewEditBook;

    public ControllerEditBook(ModelBook modelBook, ViewEditBook viewEditBook) {
        this.modelBook = modelBook;
        this.viewEditBook = viewEditBook;

        if (modelBook.getBanyakData() != 0){
            String[][] readNamaBuku = modelBook.readBook();
            viewEditBook.table.setModel((TableModel) new JTable(readNamaBuku, viewEditBook.namaKolom).getModel());
            updateDataCombo(modelBook.readNamaBuku());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }
        if (modelBook.getBanyakData2() != 0){
            String[][] readNamaKategori = modelBook.readKategori();
            viewEditBook.table.setModel((TableModel) new JTable(readNamaKategori, viewEditBook.namaKolom).getModel());
            updateDataCombo2(modelBook.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        if (modelBook.getBanyakData3() != 0){
            String[][] readNamaMhs = modelBook.readMhs();
            viewEditBook.table.setModel((TableModel) new JTable(readNamaMhs, viewEditBook.namaKolom).getModel());
            updateDataCombo3(modelBook.readNamaMhs());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }
        viewEditBook.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditBook.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
        viewEditBook.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditBook.tfId.setText("");

            }

        });
        viewEditBook.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewEditBook.getBook();
                String kategori = viewEditBook.getKategori();
                String mhs = viewEditBook.getMhs();
                String id = viewEditBook.getId();
                if (id.equals("")){
                    JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
                } else {
                    modelBook.updateBook(nama,kategori,id,mhs);
                    String newData[][] = modelBook.readBook();
                    viewEditBook.table.setModel(new JTable(newData, viewEditBook.namaKolom).getModel());
                    updateDataCombo(modelBook.readNamaBuku());
                }

            }
        });
    }
    private void updateDataCombo3(ArrayList<String> readNamaMhs) {
        viewEditBook.cbMhs.removeAllItems();
        for (String item : readNamaMhs) {
            viewEditBook.cbMhs.addItem(item);
        }
    }

    private void updateDataCombo2(ArrayList<String> readNamaKategori) {
        viewEditBook.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewEditBook.cbKategori.addItem(item);
        }
    }

    private void updateDataCombo(ArrayList<String> readBook) {
        viewEditBook.cbBook.removeAllItems();
        for (String item : readBook) {
            viewEditBook.cbBook.addItem(item);
        }
    }
}

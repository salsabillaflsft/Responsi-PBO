package Controller;

import MVC.MVC_Landing;
import Model.ModelBook;
import View.ViewBook;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerBook {
    ModelBook modelBook;
    ViewBook viewBook;

    public ControllerBook(ModelBook modelBook, ViewBook viewBook) {
        this.modelBook = modelBook;
        this.viewBook = viewBook;

        if (modelBook.getBanyakData() != 0) {
            String data[][] = modelBook.readBook();
            viewBook.tabel.setModel((new JTable(data, viewBook.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        viewBook.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewBook.setVisible(false);
                MVC_Landing mvc_landing = new MVC_Landing();
            }
        });
        viewBook.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewBook.tabel.getSelectedRow();
                int kolom = viewBook.tabel.getSelectedColumn();

                String dataterpilih = viewBook.tabel.getValueAt(baris, 0).toString();
                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus pinjaman " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    modelBook.deleteBook(dataterpilih);
                    String newData[][] = modelBook.readBook();
                    viewBook.tabel.setModel(new JTable(newData, viewBook.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
    }
}

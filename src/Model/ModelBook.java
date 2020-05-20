package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelBook {
    Statement statement;

    public int getBanyakData(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM ((`pinjam` JOIN `kategori` ON `pinjam`.`kategori` = `kategori`.`kategori`)JOIN `mahasiswa` ON `pinjam`.`id_mahasiswa` = `mahasiswa`.`id_mahasiswa`)";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    public String[][] readBook(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][9];
            String query = "SELECT * FROM ((`pinjam` JOIN `kategori` ON `pinjam`.`kategori` = `kategori`.`kategori`)JOIN `mahasiswa` ON `pinjam`.`id_mahasiswa` = `mahasiswa`.`id_mahasiswa`)";
            ResultSet resultSet = statement.executeQuery(query);
            int i = 1;
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_pinjam");
                data[jmlData][1] = resultSet.getString("id_mahasiswa");
                data[jmlData][2] = resultSet.getString("nama");
                data[jmlData][3] = resultSet.getString("nama_buku");
                data[jmlData][4] = resultSet.getString("id_buku");
                data[jmlData][5] = resultSet.getString("kategori");
                jmlData++;
                i++;
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    public void deleteBook(String id_pinjam){
        try {
            String query = "DELETE FROM `pinjam` WHERE `id_pinjam` = '" + id_pinjam + "'";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public int getBanyakData2(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `kategori`";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            return 0;
        }
    }
    public String[][] readKategori(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData2()][1];
            String query = "SELECT * FROM `kategori`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("kategori");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }
    public ArrayList<String> readNamaBuku(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `pinjam`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("nama_buku"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<String> readNamaKategori(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "Select * from `kategori`";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("kategori"));
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public int getBanyakData3(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `mahasiswa`";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            return 0;
        }
    }
    public String[][] readMhs(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData3()][2];
            String query = "SELECT * FROM `mahasiswa`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_mahasiswa");
                data[jmlData][1] = resultSet.getString("nama");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<String> readNamaMhs(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `mahasiswa`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("id_mahasiswa"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }
    public void insertBook(String id_mahasiswa , String kategori, String id_buku   , String  nama_buku){
        try{
            String query = "INSERT INTO `pinjam` (`id_pinjam`, `id_mahasiswa`, `kategori`,`id_buku`,`nama_buku` ) VALUES ('0','"+id_mahasiswa+"','"+kategori+"','"+id_buku+"','"+nama_buku+"')";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void updateBook(String id_mahasiswa, String kategori, String id_buku, String nama_buku){
        try {
            String query = "UPDATE `pinjam` SET `id_mahasiswa` = '"+id_mahasiswa+"',`kategori`='" + kategori + "',`id_buku`='" +id_buku +"', `nama_buku`='" +nama_buku +"'WHERE `nama_buku` = '" + nama_buku + "'";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}

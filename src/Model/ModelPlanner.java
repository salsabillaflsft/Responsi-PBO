package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelPlanner {
    Statement statement;

    public int getBanyakData(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM ((`planner` JOIN `kategori` ON `planner`.`kategori` = `kategori`.`kategori`)JOIN `waktu` ON `planner`.`id_hari` = `waktu`.`id_hari`) ";
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
    public String[][] readPlanner(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][9];
            String query = "SELECT * FROM ((`planner` JOIN `kategori` ON `planner`.`kategori` = `kategori`.`kategori`)JOIN `waktu` ON `planner`.`id_hari` = `waktu`.`id_hari`) ";
            ResultSet resultSet = statement.executeQuery(query);
            int i = 1;
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_planner");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("kategori");
                data[jmlData][3] = resultSet.getString("hari");
                data[jmlData][4] = resultSet.getString("waktu");
                data[jmlData][5] = resultSet.getString("status");
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
    public void deletePlanner(String id_planner){
        try {
            String query = "DELETE FROM `planner` WHERE `id_planner` = '" + id_planner + "'";
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
    public ArrayList<String> readNamaPlanner(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `planner`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("nama"));
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
            String query = "SELECT * FROM `waktu`";
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
    public String[][] readWaktu(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData3()][3];
            String query = "SELECT * FROM `waktu`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_hari");
                data[jmlData][1] = resultSet.getString("hari");
                data[jmlData][2] = resultSet.getString("waktu");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<String> readNamaHari(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `waktu`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("id_hari"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }
    public void insertPlanner(String nama, String kategori, String waktu, String status){
        try{
            String query = "INSERT INTO `planner` (`id_planner`, `nama`, `kategori`,`id_hari`,`status` ) VALUES ('0','"+nama+"','"+kategori+"','"+waktu+"','"+status+"')";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void updatePlanner(String nama, String kategori, String waktu, String status){
        try {
            String query = "UPDATE `supply` SET `nama` = '"+nama+"',`kategori`='" + kategori + "',`waktu`='" +waktu +"', `status`='" +status +"'WHERE `nama` = '" + nama + "'";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}

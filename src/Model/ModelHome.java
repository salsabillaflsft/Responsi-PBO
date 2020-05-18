package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelHome {
    Statement statement;

    public String[][] logIn(String Username, String Password){
        try{
            int jmlData = 0;

            String data[][] = new String[1][3]; //baris, kolom nya ada 3
            String query = "Select * from`user` WHERE `username` = '"+ Username +"' AND `password` = '"+ Password +"'";
            statement = JavaDatabase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                data[0][0] = resultSet.getString("id_user"); //kolom nama harus sama besar kecilnya dgn database
                data[0][1] = resultSet.getString("username");
                data[0][2] = resultSet.getString("password");
                jmlData++; //barisnya berpindah terus
            }
            return data;

        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    public void addUser(String user, String pass) {
        try{
            String query = "INSERT INTO `user` (`id_user`,`username`,`password`) VALUES ('0','"+user+"','"+pass+"')";
            statement = JavaDatabase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Register Berhasil");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
}

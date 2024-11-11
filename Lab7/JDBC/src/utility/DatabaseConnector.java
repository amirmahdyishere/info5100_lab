/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import Model.Patient;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author amirp
 */
public class DatabaseConnector {
   private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
   private static final String DB_USERNAME = "root";
   private static final String DB_PASSWORD = "my-secret-pw";
    //CRUD:
        //Create:
    public static void addPatient(Patient p1) throws SQLException{
        String query = "INSERT INTO patient(fname, lname, gender, patient_type, age, Phone, email) VALUES(?, ?, ?, ?, ?, ?, ?)" ;
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p1.getFname());
            stmt.setString(2, p1.getLname());
            stmt.setString(3, p1.getGender());
            stmt.setString(4, p1.getPatient_type());
            stmt.setString(5, p1.getAge());
            stmt.setString(6, p1.getPhone());
            stmt.setString(7, p1.getEmail());
            int rows = stmt.executeUpdate();
            System.out.println("Rows added: " + rows);
            conn.close();
        }catch(SQLException sqle){
            System.out.println("SQL Exception Occured!");
            System.out.println(sqle);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
        // Read:
    public static ArrayList<Patient> getPatients(){
        ArrayList <Patient> patient = new ArrayList();
        String query = "SELECT * FROM patient";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Patient p1 = new Patient();
                p1.setId(rs.getInt("id"));
                p1.setFname(rs.getString("fname"));
                p1.setLname(rs.getString("lname"));
                p1.setGender(rs.getString("gender"));
                p1.setPatient_type(rs.getString("patient_type"));
                p1.setAge(rs.getString("age"));
                p1.setPhone(rs.getString("Phone"));
                p1.setEmail(rs.getString("email"));
                patient.add(p1);
            }
            rs.close();
            conn.close();
        }catch(SQLException sqle){
            System.out.println("SQL Exception Occured!");
            System.out.println(sqle);
        }catch(Exception ex){
            System.out.println(ex);
        }
       return patient;
    }
//  Update:
    public static void updatePatient(Patient oldPatient, Patient updatedPatient){
        String query = "UPDATE patient SET fname=?, lname=?, gender=?, patient_type=?, age=?, Phone=?, email=? WHERE id=?";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, updatedPatient.getFname());
            stmt.setString(2, updatedPatient.getLname());
            stmt.setString(3, updatedPatient.getGender());
            stmt.setString(4, updatedPatient.getPatient_type());
            stmt.setString(5, updatedPatient.getAge());
            stmt.setString(6, updatedPatient.getPhone());
            stmt.setString(7, updatedPatient.getEmail());
            stmt.setInt(8, oldPatient.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Updated Rows: " + rows);
            conn.close();
        }catch(SQLException sqle){
            System.out.println("SQL Exception Occured!");
            System.out.println(sqle);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
//  Delete:
    public static void deletePatient(Patient p1){
        String query = "DELETE FROM patient WHERE id=?";
        try{
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, p1.getId());
            int rows = stmt.executeUpdate();
            System.out.println("Rows Deleted: " + rows);
            conn.close();
        }catch(SQLException sqle){
            System.out.println("SQL Exception Occured!");
            System.out.println(sqle);
        }catch(Exception ex){
            System.out.println(ex);
        }
       
   }
}

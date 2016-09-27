/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Division;
import util.UtilDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class DivisionDAOImp implements DivisionDAO{
    public Connection connection;

    public DivisionDAOImp() {
        connection=UtilDB.getConnection();
    }

    @Override
    public void agregarDivision(Division division) {
    String sql="INSERT INTO divisiones (nombre, abreviatura, activo, unidadacademica, area) "
            +"VALUES(?,?,?,?,?)";
    
    try{
             PreparedStatement ps =
                     connection.prepareStatement(sql);
             ps.setString(1, division.getNombre());
             ps.setString(2, division.getAbreviatura());
             ps.setString(3, division.getActivo());
             ps.setInt(4,division.getUnidadAcademica());
             ps.setString(5,division.getArea());
             ps.executeUpdate();  
         } catch (SQLException e){
             e.printStackTrace();
         }
    
    
    }

    @Override
    public void borrarDivision(int idDivision) {
     String sql="DELETE FROM divisiones WHERE id_division=?";
       try{
           PreparedStatement ps=connection.prepareStatement(sql);
           ps.setInt(1, idDivision);
           ps.executeUpdate();
          }catch(SQLException e){
              e.printStackTrace();
          }
       
    }

    @Override
    public void cambiarDivision(Division division) {
        String sql = "UPDATE divisiones SET "
                 + " nombre=?, abreviatura=?, activo=?,unidadacademica=?,area=? "
                    + "WHERE id_division=?";
         
         try{
             PreparedStatement ps =
                     connection.prepareStatement(sql);
             
             ps.setString(1, division.getNombre());
             ps.setString(2, division.getAbreviatura());
             ps.setString(3, division.getActivo());
             ps.setInt(4,division.getUnidadAcademica());
             ps.setString(5,division.getArea());
             ps.setInt(6,division.getIdDivision());
             ps.executeUpdate();  
         } catch (SQLException e){
             e.printStackTrace();
         }
    }
    

    @Override
    public List<Division> desplegarDivisiones() {
List<Division> divisiones = new ArrayList<Division>();
        try{
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(
                "SELECT * FROM divisiones");
            while (rs.next()){
                Division division = new Division(
                        rs.getInt("id_division"),
                        rs.getString("nombre"),
                        rs.getString("abreviatura"),
                        rs.getString("activo"),
                        rs.getInt("unidadacademica"),
                        rs.getString("area"));
                divisiones.add(division);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
            
       return divisiones;   

}

    @Override
    public Division elegirDivision(int idDivision) {
    Division division=null;
    try{
           PreparedStatement ps = connection.prepareStatement(
                                  "SELECT * FROM divisiones "
                                + "WHERE id_division=?");
           ps.setInt(1, idDivision);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
               division = new Division(
                        rs.getInt("id_division"),
                        rs.getString("nombre"),
                        rs.getString("abreviatura"),
                        rs.getString("activo"),
                        rs.getInt("unidadacademica"),
                        rs.getString("area"));
               
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
            
       return division;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Division;
import java.util.List;


/**
 *
 * @author USUARIO
 */
public interface DivisionDAO {
    void agregarDivision(Division division);
    void borrarDivision(int idDivision);
    void cambiarDivision(Division division);
    List<Division> desplegarDivisiones();
    Division elegirDivision(int idDivision);
}

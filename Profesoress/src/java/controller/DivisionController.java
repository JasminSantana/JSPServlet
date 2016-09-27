/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DivisionDAO;
import dao.DivisionDAOImp;
import model.Division;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
public class DivisionController extends HttpServlet{
    private final String LISTA_DIVISIONES="/lista_divisiones.jsp";
    private final String AGREGAR_CAMBIAR="/division.jsp";
    private DivisionDAO dao;

    public DivisionController() {
        dao=new DivisionDAOImp();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
        String forward = "";
        
       if(action.equalsIgnoreCase("borrar")){
           forward=LISTA_DIVISIONES;
           int idDivision=Integer.parseInt(request.getParameter("idDivision"));
             dao.borrarDivision(idDivision);
           request.setAttribute("divisiones", dao.desplegarDivisiones());
         
       }else if(action.equalsIgnoreCase("cambiar")){
           forward = AGREGAR_CAMBIAR;
            int idDivision = Integer.parseInt(
           request.getParameter("idDivision"));
            Division division = dao.elegirDivision(idDivision);
            request.setAttribute("division", division);
       }else if(action.equalsIgnoreCase("agregar")){
            forward = AGREGAR_CAMBIAR;
        } else{
            forward = LISTA_DIVISIONES;
            request.setAttribute("divisiones", dao.desplegarDivisiones());
        }
       
       RequestDispatcher view = request.getRequestDispatcher(forward);
       view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     Division division= new Division();
        division.setNombre(request.getParameter("nombre"));
        division.setAbreviatura(request.getParameter("abreviatura"));
         division.setActivo(request.getParameter("activo"));
        division.setUnidadAcademica(Integer.parseInt(request.getParameter("unidadAcademica")));
         division.setArea(request.getParameter("area"));
        
        String idDivision = request.getParameter("idDivision");
        if(idDivision==null || idDivision.isEmpty()){
        dao.agregarDivision(division);
    }else{
    division.setIdDivision(Integer.parseInt(idDivision));
        dao.cambiarDivision(division);
}
    RequestDispatcher view =
            request.getRequestDispatcher(LISTA_DIVISIONES);
            request.setAttribute("divisiones",dao.desplegarDivisiones());
            view.forward(request, response);
    }
    
    
}

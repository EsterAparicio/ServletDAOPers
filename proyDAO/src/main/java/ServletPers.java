package com.aula114;

//import javax.inject.Inject;

import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import com.aula114.Persona;
import com.aula114.DAOPers;
import com.aula114.DAOImplPers;


public class ServletPers extends HttpServlet{
       //@Inject 
       //private DAOPers persDAO;
        private DAOPers persDAO = new DAOImplPers();
        @Override	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
         System.out.println("...." + request.getServletPath() + ".....\n");
         if(request.getServletPath().equals("/add")) {
          String nombre = request.getParameter("nombre");
          String apellido = request.getParameter("apellido");
          String email = request.getParameter("email");
          persDAO.insert(new Persona(nombre,apellido,email));
          request.setAttribute("string","alta producida");
         }
         else {
          List<Persona> list = persDAO.findAllPersonas();
          request.setAttribute("lista",list);
         }
         request.getRequestDispatcher("/mi.jsp").forward(request, response);
        }
}

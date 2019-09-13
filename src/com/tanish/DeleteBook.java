package com.tanish;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteBook")
public class DeleteBook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletContext ctx=getServletContext();
		BookDAO dao=new BookDAO(ctx);
		
		int id=Integer.parseInt(request.getParameter("id"));
		try {
				Book book=null;
				int rs=dao.deleteBook(id);
				if(rs==0)
				{
					out.println("Record not found");
				}
				else{
					   out.println("Book deleted with id="+id);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

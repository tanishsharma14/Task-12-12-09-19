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

@WebServlet("/SaveBook")
public class SaveBook extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx=getServletContext();
	    BookDAO dao=new BookDAO(ctx);   
		
		PrintWriter out=response.getWriter();
		
		
		int id=Integer.parseInt(request.getParameter("id"));
		String subject=request.getParameter("subject");
		String name=request.getParameter("name");
		int price=Integer.parseInt(request.getParameter("price"));
		
		Book book=new Book(id,subject,name,price);
		int res=0;
		try {
			 res=dao.addBook(book);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("showbook.jsp");
		if(res==1)
		{
				request.setAttribute("bookinfo",book);
				rd.forward(request,response);
		}
		else
		{
				response.sendRedirect("showerror.jsp");
		}
	}

}

package com.tanish;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ConnectionListener implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	
    public void contextInitialized(ServletContextEvent obj)  { 
         ServletContext ctx=obj.getServletContext();
         String driver=ctx.getInitParameter("driver");
         String url=ctx.getInitParameter("url");
         String user=ctx.getInitParameter("user");
         String password=ctx.getInitParameter("password");
         
         try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,password);
			ctx.setAttribute("mycon",con);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    	
    }
	
}

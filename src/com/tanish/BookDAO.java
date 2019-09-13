package com.tanish;

import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
public class BookDAO {

	Connection con;
	
	public BookDAO(ServletContext ctx)
	{
		con=(Connection)ctx.getAttribute("mycon");
	}
	public int addBook(Book book) throws SQLException
	{
		PreparedStatement ps=con.prepareStatement("insert into book values(?,?,?,?)");
		ps.setInt(1,book.getId());
		ps.setString(2,book.getName());
		ps.setString(3,book.getSubject());
		ps.setInt(4,book.getPrice());
		
		int res=ps.executeUpdate();
		
		return res;
	}
	
	public int deleteBook(int id) throws SQLException
	{
		PreparedStatement ps=con.prepareStatement("delete from book where book_id=?");
		ps.setInt(1,id);
		
		int rs=ps.executeUpdate();
		return rs;
	}
	
	public Book getBook(int id) throws Exception
	{
		PreparedStatement ps=con.prepareStatement("select *from book where book_id=?");
		ps.setInt(1,id);
		
		ResultSet rs=ps.executeQuery();
		Book book=new Book();
		
		rs.next();
		book.setId(rs.getInt(1));
		book.setName(rs.getString(2));
		book.setSubject(rs.getString(3));
		book.setPrice(rs.getInt(4));
		
		return book;
		
	}
}

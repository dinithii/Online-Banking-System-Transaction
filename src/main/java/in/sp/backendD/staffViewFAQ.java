package in.sp.backendD;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; 

@WebServlet("/staffviewfaq")
public class staffViewFAQ extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactiondb", "root", "senithpete104");
			
			String sql = "select * from manage_faq";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{   
				String b1 = rs.getString(1);
				String q1 = rs.getString(2);
				String a1 = rs.getString(3);

				req.setAttribute("fid", b1);
				req.setAttribute("fQuestion", q1);
				req.setAttribute("fAnswer", a1);
				
				HttpSession session = req.getSession();
				session.setAttribute("session1", rs.getString("fid"));
	
			RequestDispatcher rd = req.getRequestDispatcher("/staffViewFAQ.jsp");
			rd.include(req, resp);
		}
		}
		
		catch(Exception e) {
			e.printStackTrace();

			out.print("<h3> "+e.getMessage()+"</h3>");

			RequestDispatcher rd = req.getRequestDispatcher("/staffViewFAQ.jsp");
			rd.include(req, resp);
		}
	}
}


package in.sp.backendD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/faqValidation")
public class validateFAQ extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); 
		
		String faqid = req.getParameter("tid");		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactiondb", "root", "senithpete104");
			
			String sql = "select * from manage_faq where fid='"+faqid+"'";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next())
			{   
				
				HttpSession session2 = req.getSession();
				session2.setAttribute("session2", rs.getString("fid"));
				
				HttpSession session3 = req.getSession();
				session3.setAttribute("session3", rs.getString("fQuestion"));
				
				HttpSession session4 = req.getSession();
				session4.setAttribute("session4", rs.getString("fAnswer"));

				
	
			RequestDispatcher rd = req.getRequestDispatcher("/editFAQ2.jsp");
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

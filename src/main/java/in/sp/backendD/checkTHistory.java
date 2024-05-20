package in.sp.backendD; //my package

//java libraries.
import java.io.*;

import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*; 

//servlet and map it to the url pattern.
@WebServlet("/checkDomesticTForm")
public class checkTHistory extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		//get the value of sNum parameter from request.
		String snumber = req.getParameter("sNum");

		try {
			//load MYSQL jdbc driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//database connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transactiondb", "root", "senithpete104");
			Statement stmt = con.createStatement();

			//SQL query with the select statement to retrieve data.
			String sql = "select * from transactiondetails where sNumber='"+snumber+"'";
			ResultSet rs = stmt.executeQuery(sql);			

			while(rs.next())
			{   
				//retrieve transaction details from result set.
				int tid1 = rs.getInt(1);
				int snumber1 = rs.getInt(2);
				double tamount1 = rs.getDouble(3);
				String tdate1 = rs.getString(4);
				String tpur1 = rs.getString(5);
				String tremark1 = rs.getString(6);
				int bnumber1 = rs.getInt(7);
				String bbank1 = rs.getString(8);
				String bbranch1 = rs.getString(9);
				String bname1 = rs.getString(10);
				String bemail1 = rs.getString(11);

				//set attributes for the data that to be used in the view jsp page.
				req.setAttribute("tid", tid1);
				req.setAttribute("sNumber", snumber1);
				req.setAttribute("tAmount", tamount1);
				req.setAttribute("tDate", tdate1);
				req.setAttribute("tPurpose", tpur1);
				req.setAttribute("tRemarks", tremark1);
				req.setAttribute("bNumber", bnumber1);
				req.setAttribute("bBank", bbank1);
				req.setAttribute("bBranch", bbranch1);
				req.setAttribute("bName", bname1);
				req.setAttribute("bEmail", bemail1);
			
				//forward the request to page transactionReceipt.jsp
			    RequestDispatcher rd = req.getRequestDispatcher("/transactionReceipt.jsp");
				rd.include(req, resp);	
			}

		}
		
		catch(Exception e) {

			e.printStackTrace();

			//display an error message 
			out.print("<h3> "+e.getMessage()+"</h3>");
			
			//redirect to the home page.
			RequestDispatcher rd = req.getRequestDispatcher("/loginTHistory.jsp");
			rd.include(req, resp);
		}
	}
}



	

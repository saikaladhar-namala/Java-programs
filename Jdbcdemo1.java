import java.sql.*;
import java.io.*;
 
class Jdbcdemo1
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException
	{
		
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/school";
		String username="root";
		String password="Sainsk321@";
		
		Class.forName(driver);
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(i);
		System.out.println("Enter the id: ");
		int id = Integer.parseInt(bf.readLine());
		System.out.println("Enter the name: ");
		String name=bf.readLine();
		
		//st.executeUpdate("insert into student values(1,'kaladhar')");
		
		//st.executeUpdate("insert into student values(id,name)");
		
		st.executeUpdate("insert into student values(" + id + ", '" + name + "')");
		st.executeUpdate("insert into student values( " +id + ",' " +name+ " ') ");

		ResultSet res=st.executeQuery("select *from student");
		
        
        //close the Connection
        while(res.next())
        {
            System.out.print(res.getInt(1)+" "+res.getString(2));
            System.out.println();
        }
		con.close();
	}
}


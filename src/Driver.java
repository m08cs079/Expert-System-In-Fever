
import java.sql.*;

public class Driver {

	public static void main(String[] args) {
		try{
			String Query = "select * from patient";
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExpertSystem","root" ,"password");
			Statement st= myConn.createStatement();
			ResultSet rs = st.executeQuery(Query);
			while(rs.next()){
			System.out.println(rs.getString("patientname")+","+rs.getString("id")+","+rs.getString("fever")+","+ rs.getString("vomiting")+","+ rs.getString("abdpain")+","+ rs.getString("jointpain")+","+ rs.getString("bodyache")+","+ rs.getString("burningmicturition")+","+ rs.getString("cough")+","+ rs.getString("difficultyinbreathing")+","+rs.getString("headache")+","+rs.getString("sorethroat")+","+rs.getString("result"));
		      }
		     }
		catch(Exception e){
			
			
			e.printStackTrace();
		}

	}

}

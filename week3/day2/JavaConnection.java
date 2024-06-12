package week3.day2;

public class JavaConnection implements DatabaseConnection{

	public void connect() {
		System.out.println("Connect to the interface");
		
	}

	public void disconnect() {
		System.out.println("Disconnect from the interface");
		
	}

	public void executeUpdate() {
		System.out.println("Update the interface");
		
	}

	public static void main(String[] args) {
		JavaConnection con = new JavaConnection();
		con.connect();
		con.executeUpdate();
		con.disconnect();
	}

}

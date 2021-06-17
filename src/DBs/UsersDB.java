package src.DBs;

import java.util.ArrayList;
import java.util.List;
import src.Nodes.*;


public class UsersDB {
	
   // Declaration of attributes
	
   public List<User> users;

	/**
	 * Constructor
	 */
	public UsersDB() {
		users = new ArrayList<User>();
	}
	
	public List<User> getUsers() {
		return this.users;
	}

		

	/**
	 * This method is used to authentificate a User
	 * @param id
	 * @param password
	 * @return a booelean
	 */
	public boolean authentification(String id, String password) {
    boolean result = false;
		for (int i=0;i<listeners.size();i++){
		    User user = users.get(i);
		    String loginl = user.getLogin();
		    String password1 = user.getPassword();
			if ( loginl.equals(id) && passwordl.equals(password)  ) {
			         result= true; }
			
				}
		return result;
	}
	
	/**
	 * This methods return a user from UserDB that has the same (id,password) 
	 * @param id
	 * @param password
	 * @return user 
	 */
	
	public User getUserAuthentification(String id, String password) {
		User user_to_return = null;
		for (int i=0;i<users.size();i++){
		    User user2 = users.get(i);
		    String loginl = user2.getLogin();
		    String passwordl = user2.getPassword();
			if (  loginl.equals(id) && passwordl.equals(password) ) {
			       user_to_return = user2;  
				break;  }
			
				}
		return user_to_return;
		
	}

	
}

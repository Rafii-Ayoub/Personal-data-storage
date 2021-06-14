package src.Nodes;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import src.System.*;

public class User {
	
	// Attributes
	private int id;
	private static final AtomicInteger count = new AtomicInteger(10000); // ensure uniqueness of id
	private ArrayList<Data> data_list ;
	private SystemNode system_node ;
	
	// Attributes not requested but useful for my app
	private String login;
	private String password;
	
	/**
	 * Constructor
	 */
	public User( SystemNode system_node) {
		super();
		this.id = count.incrementAndGet(); // ensure uniqueness of auto incremented id
		this.login = this.id.toString();
		this.password = this.id.toSting();
		this.data_list = new ArrayList<>();
		this.system_node = system_node;
	
	}
	
	// methods and functions
	
	/**
	 * Method to add a Data object to the data_list
	 * @param data
	 */ 
	public void addData(Data data) {
		data_list.add(data);
	}
	
    /**
     * Method to remove a Data object
     * @param data
     */
	public void removeData(Data data) {
		data_list.remove(data);
	}
	
	/**
	 * Method to add a list of Data objects to the data_list
	 * @param data_list
	 */
	
	public void addDataList(ArrayList<Data> data_list) {
		data_list.addAll(data_list);
	}

	
	// getters and setters
	
	public int getId() {
		return id;
	}


	public ArrayList<Data> getList() {
		return data_list;
	}


	public void setList(ArrayList<Data> list) {
		this.data_list = list;
	}


	public SystemNode getSystem_node() {
		return system_node;
	}


	public void setSystem_node(SystemNode system_node) {
		this.system_node = system_node;
	}
	
	
	public String getLogin() {
		return login;
		}


	public void setLogin(String login) {
		this.login = login;
		}


	public String getPassword() {
		return password;
		}


	public void setPassword(String password) {
		this.password = password;
		}
	
	@Override
	public String toString() {
		return "["+ login + "|" + password + "]";
		}
		
	public String toString2() {
		return "User "+login+" est crée son mp: "+password ; 
		}

}

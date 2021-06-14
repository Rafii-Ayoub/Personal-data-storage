package src.Nodes;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import src.System.*;

public class User {
	
	// 	Attributes
	private int id;
	private static final AtomicInteger count = new AtomicInteger(10000); // ensure uniqueness of id
	private ArrayList<Data> data_list ;
	private SystemNode system_node ;
	
	/**
	 * Constructor
	 */
	public User( SystemNode system_node) {
		super();
		this.id = count.incrementAndGet(); // ensure uniqueness of auto incremented id
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
	
	

}

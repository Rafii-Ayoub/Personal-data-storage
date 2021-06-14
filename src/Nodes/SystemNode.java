package src.Nodes;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import src.System.*;


public class SystemNode extends Node  {
	
	// Attributes
	
	private int id;
	private static final AtomicInteger count = new AtomicInteger(1000000); // to ensure  uniqueness of id
	private int memory_size;	
	private ArrayList<Data> data_list ;
	private ArrayList<Integer> accessible_nodes;
	
	/**
	 * Constructor
	 */
	public SystemNode( int memory_size) {
		super();
		this.id = count.incrementAndGet(); // to ensure  uniqueness of the auto incremented id
		this.memory_size = memory_size;
		this.data_list = new ArrayList<>();
		this.accessible_nodes = new ArrayList<Integer>();
	
	}
	
	/**
	 * Method to add Data object by id from accessible_nodes list
	 * @param data_id
	 */
	public void addNode(int data_id) {	
		accessible_nodes.add(data_id);
	}
	
    /**
     * Method to remove Data object by id from accessible_nodes list
     * @param data_id
     */
	public void removeNode(int data_id) {
		accessible_nodes.remove(data_id);
	}
	
	/**
	 *  Method to add Data Objects to accessible_nodes list
	 * @param data
	 */
	public void addData(Data data) {
		data_list.add(data);
	}
	
	/**
	 *  Method to remove Data Objects to accessible_nodes list
	 * @param data
	 */
	public void removeData(Data data) {
		data_list.remove(data);
	}
	/**
	 *  Method to add a list of Data Objects to accessible_nodes list
	 * @param data
	 */
	public void addNodesList(int nodes_id_list) {
		accessible_nodes.add(nodes_id_list);
	}
	
	/**
	 *  Method to remove a list of Data Objects to accessible_nodes list
	 * @param data
	 */
	public void addDataList(ArrayList<Data> list) {
		data_list.addAll(list);
	}
	

	// getters and setters 
	
	public int getId() {
		return id;
	}
	
	public int getMemory_size() {
		return memory_size;
	}
	public void setMemory_size(int memory_size) {
		this.memory_size = memory_size;
	}
	public ArrayList<Data> getList() {
		return data_list;
	}

	public ArrayList<Integer> getData_list() {
		return accessible_nodes;
	}
	public void setData_list(ArrayList<Integer> data_list) {
		this.accessible_nodes = data_list;
	}
	
	
	
	
	
}

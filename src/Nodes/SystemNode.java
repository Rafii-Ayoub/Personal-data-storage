
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class SystemNode {
	
	private int id;
	private static final AtomicInteger count = new AtomicInteger(1000000); 
	private int memory_size;	
	private ArrayList<Data> data_list ;
	private ArrayList<Integer> accessible_nodes;
	
	public SystemNode( int memory_size) {
		super();
		this.id = count.incrementAndGet();
		this.memory_size = memory_size;
		this.data_list = new ArrayList<>();
		this.accessible_nodes = new ArrayList<Integer>();
	
	}
	
	
	public void addNode(int data_id) {
		
		accessible_nodes.add(data_id);
	}
	

	public void removeNode(int data_id) {
		accessible_nodes.remove(data_id);
	}
	
	public void addData(Data data) {
		
		data_list.add(data);
	}
	

	public void removeData(Data data) {
		data_list.remove(data);
	}
	
	public void addNodesList(int nodes_id_list) {
		accessible_nodes.add(nodes_id_list);
	}
	
	
	public void addDataList(ArrayList<Data> list) {
		data_list.addAll(list);
	}
	

	
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

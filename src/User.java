import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class User {
	
	private int id;
	private static final AtomicInteger count = new AtomicInteger(10000); 
	private ArrayList<Data> data_list ;
	private SystemNode system_node ;
	
	
	public User( SystemNode system_node) {
		super();
		this.id = count.incrementAndGet();
		this.data_list = new ArrayList<>();
		this.system_node = system_node;
	
	}
	
	
	public void addData(Data data) {
		data_list.add(data);
	}
	

	public void removeData(Data data) {
		data_list.remove(data);
	}
	
	
	public void addDataList(ArrayList<Data> data_list) {
		data_list.addAll(data_list);
	}

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

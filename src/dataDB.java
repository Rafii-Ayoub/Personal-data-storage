import java.util.ArrayList;
import java.util.Objects;

public class DataDB {

    // parameters	
	
	private ArrayList<Data> dataDB ;
	
	/**
	 * Constructor
	 */
	
	public DataDB () {
		this.dataDB = new ArrayList<>();
	}
	
	
	
	// Methods and functions
	
	/**
	 * 
	 * @param data_id 
	 * @return Data object 
	 */
	

	public Data findData(int data_id) {
		
		for ( int i=0; i < dataDB.size(); i++ ) {
			Data element = dataDB.get(i);
			int id = element.getId();
			if(data_id== id) 
				return element;
			
		}
		return null ;
	}
	
	public void addData(Data data){
		dataDB.add(data);
	}
	
	
	public void addData(int id_data) {
		Data element = findData(id_data);
		if (element == null ){
			// do nothing
		}
		else {
			dataDB.add(element);
		}
	}


}

import java.util.ArrayList;
import java.util.Objects;

public class DataDB {

    // Attributes	
	
	private ArrayList<Data> dataDB ;
	
	/**
	 * Constructor
	 */
	
	public DataDB () {
		this.dataDB = new ArrayList<>();
	}
	
	
	
	// Methods and functions
	
	/**
	 * method to find a Data object by its id
	 * @param data_id 
	 * @return Data object 
	 */

	public Data findData(int data_id) {
		Data result= null;
		for ( int i=0; i < dataDB.size(); i++ ) {
			Data element = dataDB.get(i);
			int id = element.getId();
			if(data_id== id) 
				result =  element;
			    break;
			
		}
		return result ;
	}
	
	/**
	 * method to add object data to the DataDb list
	 * @param data
	 */
	public void addData(Data data){
		dataDB.add(data);
	}
	
	/**
	 * method to add data by data id
	 * @param id_data
	 */
	
	public void addData(int id_data) {
		Data element = findData(id_data);
		if (element == null ){
			// do nothing
		}
		else {
			dataDB.add(element);
		}
	}


	// getters and setters 
	
	public ArrayList<Data> getDataDB() {
		return dataDB;
	}

	public void setDataDB(ArrayList<Data> dataDB) {
		this.dataDB = dataDB;
	}
	


}

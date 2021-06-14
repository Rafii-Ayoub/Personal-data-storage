package src.System; 
	
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Data implements Comparable<Data> {
	
	// Attributes
	private static final AtomicInteger count = new AtomicInteger(1000000000); 
	private int size;	
	private String subject;
	private int id;
  
	/**
	 * Constructor
	 */
	
	Data(int size, String subject) {

        this.id =count.incrementAndGet();
		this.size = size;
		this.subject = subject;
	}
	
	/**
	 * method used to compare data object by Id, it's useful in the SystemTree 
	 */
	public int compareTo(Data o) {
	    return Integer.compare(getId(),o.getId());
	  }
	
	// getters and setters 
	
	public int getId() {
		return id;
	}

	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


}

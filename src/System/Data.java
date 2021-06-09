import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Data implements Comparable<Data> {
	
	private static final AtomicInteger count = new AtomicInteger(1000000000); 
	private int size;	
	private String subject;
	private int id;
  
	
	Data(int size, String subject) {

        this.id =count.incrementAndGet();
		this.size = size;
		this.subject = subject;
	}
	
	public int compareTo(Data o) {
	    return Integer.compare(getId(),o.getId());
	  }
	
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


import java.util.ArrayList;

public class User_System {
	
	private SystemNode sysNode1;
	private User user_node;
	
	public User_System( User user_node , SystemNode system_node) {
		this.sysNode1 = system_node;
		this.user_node =user_node;
	}
	
	public ArrayList<Object> getNodes() {
	    ArrayList<Object> list = new ArrayList<>();
	    list.add(this.getSystemNode());
	    list.add(this.getUserNode());
	    return list ;
	    
	}

	public SystemNode getSystemNode() {
		return sysNode1;
	}

	public void setSystemNode(SystemNode sysNode1) {
		this.sysNode1 = sysNode1;
	}

	public User getUserNode() {
		return user_node;
	}

	public void setuserNode(User sysNode2) {
		this.user_node = sysNode2;
	}
	
	

}

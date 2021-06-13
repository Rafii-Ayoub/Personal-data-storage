import java.util.ArrayList;

public class SystemConnexion {
	
	// Attributes
	private SystemNode sysNode1;
	private SystemNode sysNode2;
	
	/**
	 * Constructor
	 */
	public SystemConnexion(SystemNode node1,SystemNode node2) {
		this.sysNode1 = node1;
		this.sysNode2 =node2;
	}
	
	//getters and setters
	
	/**
	 * Methods to get a list that represents an arc of 2 SystemNode 
	 * @return list 
	 */
	public ArrayList<SystemNode> getNodes() {
	    ArrayList<SystemNode> list = new ArrayList<>();
	    list.add(this.getFirstNode());
	    list.add(this.getSecondNode());
	    return list ;
	    
	}
	
	/**
	 * Method to get the associated SystemNode of a SystemNode
	 * @param SystemNode (sys1)
	 * @return SystemNode (sys2 the associated SystemNode)
	 */
	public SystemNode getTheOtherNode(SystemNode sys) {
		SystemNode sysNode = null;
		if(sys.equals(this.sysNode1)) {
			sysNode = this.sysNode2 ;
		}
		else if(sys.equals(this.sysNode2)) {
			sysNode = this.sysNode1 ;
		}
		
		return sysNode;
	}

	public SystemNode getFirstNode() {
		return sysNode1;
	}

	public void setFirstNode(SystemNode sysNode1) {
		this.sysNode1 = sysNode1;
	}

	public SystemNode getSecondNode() {
		return sysNode2;
	}

	public void setSecondNode(SystemNode sysNode2) {
		this.sysNode2 = sysNode2;
	}
	 


}

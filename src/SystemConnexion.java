import java.util.ArrayList;

public class SystemConnexion {
	
	private SystemNode sysNode1;
	private SystemNode sysNode2;
	
	public SystemConnexion(SystemNode node1,SystemNode node2) {
		this.sysNode1 = node1;
		this.sysNode2 =node2;
	}
	
	public ArrayList<SystemNode> getNodes() {
	    ArrayList<SystemNode> list = new ArrayList<>();
	    list.add(this.getFirstNode());
	    list.add(this.getSecondNode());
	    return list ;
	    
	}
	
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

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;



public class SystemTree {
	
	// attributes
	private ArrayList<SystemConnexion> systemArcsList;
	private ArrayList<User_System> userArcsList;
	private int id_tree;
	
	/**
	 * Constructor
	 * @param id
	 */

	public SystemTree(int id) {
		super();
		this.systemArcsList = new ArrayList<SystemConnexion>();
		this.userArcsList = new ArrayList<User_System>() ;
		this.id_tree =id;
	}

	// methods and functions
	
   /**
    * Method used to store Data in the the nearest System Node to user Node
    * @param data
    * @param user
    * 
    */
	
  public void storeData(Data data,User user) {
	  
	  // The first node linked to the user
	  User_System sys_user = getUserArc(user);
	  SystemNode sysNode1 = sys_user.getSystemNode();
	  int data_size = data.getSize();
	  int memory_size1 = sysNode1.getMemory_size();
	  
	  // if the memory Size of the systemNode associated to the user we store the data
	  if (data_size<memory_size1) { 
		  sysNode1.addData(data);
		  int remaining_size = memory_size1 - data_size;
		  sysNode1.setMemory_size(remaining_size);
	  }
	  // If not we store the data to the nearest System Node 
	  else {
		  int remaining_size = memory_size1 - data_size;
		  while (remaining_size<0){
			  SystemNode sysNode2 =getSystemArc(sysNode1).getTheOtherNode(sysNode1);
			  int memory_size2 = sysNode2.getMemory_size();
			  remaining_size = memory_size2 - data_size;
			  if (remaining_size>0) {
				  sysNode2.addData(data);
				  sysNode2.setMemory_size(remaining_size);
			  }
		  }
		  
	  }
  }
  

  
  /**
   * Method used to store Data in the the nearest System Node 
   * @param data
   * @param user
   * 
   */
	
 public void storeData2(Data data,SystemNode sysNode1) {
	  

	  int data_size = data.getSize();
	  int memory_size1 = sysNode1.getMemory_size();
	  
	  // if the memory Size of the systemNode associated to the user we store the data
	  if (data_size<memory_size1) { 
		  sysNode1.addData(data);
		  int remaining_size = memory_size1 - data_size;
		  sysNode1.setMemory_size(remaining_size);
	  }
	  // If not we store the data to the nearest System Node 
	  else {
		  int remaining_size = memory_size1 - data_size;
		  while (remaining_size<0){
			  SystemNode sysNode2 =getSystemArc(sysNode1).getTheOtherNode(sysNode1);
			  int memory_size2 = sysNode2.getMemory_size();
			  remaining_size = memory_size2 - data_size;
			  if (remaining_size>0) {
				  sysNode2.addData(data);
				  sysNode2.setMemory_size(remaining_size);
			  }
		  }
		  
	  }
 }
  
  /**
   * Method to store all interesting data for a user
   * @param user
   */
  
  public void storeUserData(User user) {
	  ArrayList<Data> dataList = user.getList();	
	  
	  // We store each datum from the data list in the nearest System Nodes
	  for(int i=0;i<dataList.size() ;i++) {
		  Data data = dataList.get(i);
		  storeData(data,user);
	  }
  }
  
  /**
   * Method to store all interesting data for many users
   * @param userList
   */
  public void storeUserData2(ArrayList<User> users) {
		 for (User user1 : users){
		     ArrayList<Data> dataList = user1.getList();		  
		     // We store each datum from the data list in the nearest System Nodes
		     for(int i=0;i<dataList.size() ;i++) {
			  Data data = dataList.get(i);
			  for (User user2 : users){
			     if ( userInterested(data,user2) && !(user1.equals(user2))){
				     Path path = shortestPath ( user1, user2.getSystem_node());
				     int ideal = (int) path.size();
			 	     SystemNode sysNode = path.getPathList().get(ideal);
				     user2.removeData(data);
				     storeData2(data,sysNode);
			     }
			     else {
			     storeData(data,user1);
			     }
				     
			  }
		       }
	         }	 
	  }
  /**
   * Method to get a System Arc 
   * @param sysNode
   * @return An arc of two nodes that represents a system connection
   */
   public SystemConnexion getSystemArc(SystemNode sysNode) {
	   SystemConnexion result =null;
	   for(int i=0 ; i<systemArcsList.size(); i++ ) {
		   SystemConnexion sysCnx = systemArcsList.get(i);
		   SystemNode firstNode = sysCnx.getFirstNode();
		 if(sysNode.equals(firstNode) || sysNode.equals(sysCnx.getTheOtherNode(firstNode)) ) {
			  result=sysCnx;
			  break;
		   }
	   }
	  return result; 	   
   }
   
   /**
    * Method to know if a user is intersted by a data
    * @param data
    * @param user
    * @return booelean 
    */
  
   public boolean userInterested(Data data, User user) {
	   boolean result = false ;
	   ArrayList<Data> dataList = user.getList();
	   
	   // if there the user is interested by a data result takes the value true
	   for (int i=0; i<dataList.size(); i++) {
		   Data element = dataList.get(i);
		   if (element.equals(data)) {
			   result = true;
			   break;
		   }
  
	   }
	   return result;
   }
   
   
   /**
    * Method to get the shortest path to optimize data storing
    * @param user
    * @param trajetNode
    * @return ArrayList<Path> 
    */
   public Path shortestPath(User user, SystemNode trajetNode ){
	   
	   User_System sys_user = getUserArc(user);
	   SystemNode sysNode = sys_user.getSystemNode();
	   ArrayList<Path> paths_depths = new ArrayList <>();
	   int maxDepth = 6;
	   boolean find = false;
	   
	   // create a path object
	   Path pathObject = new Path(new ArrayList<>());
       int k=0;
       
       // use of Djikstra algorithm
	   while (!(find)) {
		   
		   
		   if(pathObject.belongsToList(paths_depths) == true) {
			   
			   //do nothing
			  
		   }
		   
		   else {
			  
           // create an ArrayList to store the path
		   ArrayList<SystemNode> pathList = new ArrayList<>();
		   SystemNode node1 = getSystemArc(sysNode).getTheOtherNode(sysNode);
		  
		   pathList.add(sysNode);
		  
		   SystemNode node2=null;
		   int i=0;	   
		   while(!(sysNode.equals(node1) ) && i<maxDepth ) {
			   
			   // if sysNode is not node1 add the node1 to the path list
			   pathList.add(node1);
               if (trajetNode.equals(node1)) {  
				   find = true;
				   break;
				  
			   }
               else {
			   i++;
			   
			   node1 = getSystemArc(node1).getTheOtherNode(node1);
			   System.out.println(node1 );
			   }
		   }
		   
	     
		   if(i != 0 ) {
			   pathObject = new Path(pathList);
			   System.out.println(pathObject.toString());
			   if(pathObject.belongsToList(paths_depths) == true) {
				   paths_depths.add(pathObject);  
			   }
			  
		   }    
		   }
		   //
		   
		      
	   }
	   Collections.sort(paths_depths, Path.pathComparator);
	   return paths_depths.get(0);
	   
   }
   
  
   
   // Methods to add and remove SystemConnexion objects  and SystemUser arcs 
   
   public void addSystemConnexion(SystemConnexion cnx) {	
  	 systemArcsList.add(cnx);
  }
  
  public void removeSystemConnexion(SystemConnexion cnx) {	
  	 systemArcsList.remove(cnx);
  }
	
   public void addSystemUserArc(User_System cnx) {	
	     userArcsList.add(cnx);
  }

   public void removeSystemUserArc(User_System cnx) {
     	userArcsList.remove( cnx);
  }
   
    // setters ad getters
   
  /**
   * Method to get the System user arc for a user by using the id
   * @param userId 
   * @return SystemArc Object
   */
  public User_System getUserArc(int userId) {
	User_System result = null;
  	for(int i=0; i<userArcsList.size(); i++) {
  		User_System user_system = userArcsList.get(i) ;
  		if (user_system.getUserNode().getId() == userId ) {
  			result = user_system;
  		}
  	}
  	
  	 return result;  	
  }
  
  /**
   * Method to get the System user arc for a user
   * @param user (User Object)
   * @return SystemArc Object
   */
  public User_System getUserArc(User user) {
	User_System result = null;
  	for(int i=0; i<userArcsList.size(); i++) {
  		User_System user_system = userArcsList.get(i) ;
  		if (user_system.getUserNode().equals(user) ) {
  			result= user_system;
  			break;
  		}
  	}
  	return result;
  	   	
  }
	


	// getters and setters
    
	public int getId_tree() {
		return id_tree;
	}

	public void setId_tree(int id_tree) {
		this.id_tree = id_tree;
	}

	public ArrayList<User_System> getUserArcList() {
		return userArcsList;
	}
	
	public ArrayList<SystemConnexion> getSystemNodesList() {
		return systemArcsList;
	}
	
	
}

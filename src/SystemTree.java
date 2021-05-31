
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.Collection;


public class SystemTree {
	
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
	
   
	
  public void storeData(Data data,User user) {
	  // The first node linked to the user
	  User_System sys_user = getUserArc(user);
	  SystemNode sysNode1 = sys_user.getSystemNode();
	  int data_size = data.getSize();
	  int memory_size1 = sysNode1.getMemory_size();
	  if (data_size<memory_size1) { 
		  sysNode1.addData(data);
		  int remaining_size = memory_size1 - data_size;
		  sysNode1.setMemory_size(remaining_size);
	  }
	  else {
		  int remaining_size = memory_size1 - data_size;
		  while (remaining_size<0){
			  SystemNode sysNode2 =getSystemArc(sysNode1).getTheOtherNode(sysNode1);
			  int memory_size2 = sysNode2.getMemory_size();
			  remaining_size = memory_size2 - data_size;
			  if (remaining_size>0) {
				  sysNode2.addData(data);

				  sysNode2.setMemory_size(remaining_size);

          sysNode2.setMemory_size(remaining_size);

			  }
		  }
		  
	  }
  }
  
  public void storeUserData(User user) {
	  ArrayList<Data> dataList = user.getList();	  
	  // sort the data List by id
	  /*java.util.List<Data> sortedData = dataList.stream()
			  .sorted(Comparator.comparing(Data::getId))
			  .collect(Collectors.toList());*/
	  //store the data 
	  for(int i=0;i<dataList.size() ;i++) {
		  Data data = dataList.get(i);
		  storeData(data,user);
	  }
  }

	
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
   

   public boolean userInterested(Data data, User user) {
	   boolean result = false ;
	   ArrayList<Data> dataList = user.getList();
	   for (int i=0; i<dataList.size(); i++) {
		   Data element = dataList.get(i);
		   if (element.equals(data)) {
			   result = true;
			   break;
		   }

	   }
	   return result;
   }

   
   // Methods to add and remove System Connexion objects an
   
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
  
  
  public User_System getUserArc(User user) {
  	for(int i=0; i<userArcsList.size(); i++) {
  		User_System user_system = userArcsList.get(i) ;
  		if (user_system.getUserNode().equals(user) ) {
  			return user_system;
  		}
  	}
  	return null;
  	   	
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
	


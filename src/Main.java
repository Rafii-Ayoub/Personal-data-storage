import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		
		DataDB principalDB = new DataDB();
		
		SystemTree tree = new SystemTree(1);
		
		Data  data0 = new Data(8,"science");
		Data  data1 = new Data(8,"music");
		Data  data2 = new Data(8, "chat");
		Data  data3 = new Data(8,"news");
		Data  data4 = new Data(3,"machine learning");
		Data  data5 = new Data(1, "vegan food");
		Data  data6 = new Data(2,"top hits");
		Data  data7 = new Data(2,"covid");
		Data  data8 = new Data(1, "Bob Marely");
		Data  data9 = new Data(23,"donald trump");
		
		principalDB.addData(data0);
		principalDB.addData(data1);
		principalDB.addData(data2);
		principalDB.addData(data3);
		principalDB.addData(data4);
		principalDB.addData(data5);
		principalDB.addData(data6);
		principalDB.addData(data7);
		principalDB.addData(data8);
		principalDB.addData(data9);
		
		SystemNode sysNode1 = new SystemNode(50);
		SystemNode sysNode2 = new SystemNode(40);
		SystemNode sysNode3 = new SystemNode(30);
		SystemNode sysNode4 = new SystemNode(20);
		SystemNode sysNode5 = new SystemNode(10);
		
		User user1 = new User(sysNode5);
		User user2 = new User(sysNode5);
		User user3 = new User(sysNode5);
		User user4 = new User(sysNode4);
		User user5 = new User(sysNode3);
		User user6 = new User(sysNode2);
		User user7 = new User(sysNode2);
		
		SystemConnexion cnx1 = new SystemConnexion(sysNode1,sysNode2);
		SystemConnexion cnx2 = new SystemConnexion(sysNode2,sysNode3);
		SystemConnexion cnx3 = new SystemConnexion(sysNode3,sysNode4);
		SystemConnexion cnx5 = new SystemConnexion(sysNode5,sysNode1);
		SystemConnexion cnx4 = new SystemConnexion(sysNode4,sysNode5);
		SystemConnexion cnx6 = new SystemConnexion(sysNode1,sysNode3);
		SystemConnexion cnx7 = new SystemConnexion(sysNode1,sysNode4);
		SystemConnexion cnx8 = new SystemConnexion(sysNode3,sysNode5);
		SystemConnexion cnx9 = new SystemConnexion(sysNode2,sysNode5);
		SystemConnexion cnx10 = new SystemConnexion(sysNode2,sysNode4);
		
		
		
		
		
		user1.addData(data0);
		user1.addData(data1);// change it to user2
		user1.addData(data2);// change it to user2
		user3.addData(data3);
		user3.addData(data7);
		user2.addData(data5);
		user2.addData(data2);
		user2.addData(data1);
		
		
        User_System usercnx1 = new User_System(user1,sysNode5);
        User_System usercnx2 = new User_System(user2,sysNode3);
        User_System usercnx3 = new User_System(user3,sysNode1);
        
		tree.addSystemUserArc(usercnx1);
		tree.addSystemUserArc(usercnx2);
		tree.addSystemUserArc(usercnx3);
		
		tree.addSystemConnexion(cnx1);
		tree.addSystemConnexion(cnx2);
		tree.addSystemConnexion(cnx3);
		tree.addSystemConnexion(cnx4);
		tree.addSystemConnexion(cnx5);
		tree.addSystemConnexion(cnx6);
		tree.addSystemConnexion(cnx7);
		tree.addSystemConnexion(cnx8);
		
	    //tree.storeData(data1,user1);
		tree.storeUserData(user1);
		
	    
	    //test1
	    System.out.println("  ");
	    System.out.println("---------------Test1----------------");
	    System.out.println("adresses list: " + user1.getList());// result: [Data@1218025c, Data@816f27d, Data@87aac27] 
	    System.out.println("  ");
	    
	    //test2
	    System.out.println("  ");
	    System.out.println("---------------Test2----------------");
	    System.out.println("Are user1 interseted by data1 ?  " + tree.userInterested(data1, user1));// True
	    
	    System.out.println("  ");
	    System.out.println("  ");
	    
	    
	    //test3
	    System.out.println("  ");
	    System.out.println("---------------Test3----------------");
	    System.out.println("The memory size of sysNode5: "+ sysNode5.getMemory_size()+" MB");
	    System.out.println("The memory size of SysNode4: " + sysNode4.getMemory_size()+" MB");
	    System.out.println("The memory size of SysNode3: " + sysNode3.getMemory_size()+" MB");
	    System.out.println("The memory size of SysNode2: " + sysNode2.getMemory_size()+" MB");
	    System.out.println("The memory size of SysNode1: " + sysNode1.getMemory_size()+" MB");
	    
	    //test4
	    System.out.println("  ");
	    System.out.println("---------------Test4----------------");
	    System.out.println("Are user1interseted by data1 ?  " + tree.userInterested(data1, user1));// True
	    System.out.println("Are user2 interseted by data1 ?  " + tree.userInterested(data1, user2));// True
	    System.out.println("  ");
	    
	    
	    //test5
	    ArrayList<User> list = new ArrayList<>();
	    list.add(user2);
	    list.add(user3);
	    tree.storeUserData2(list);
	    System.out.println("  ");
	    System.out.println("---------------Test5----------------");
	    System.out.println("The memory size of sysNode5: "+ sysNode5.getMemory_size()+" MB");
	    System.out.println("The memory size of SysNode4: " + sysNode4.getMemory_size()+" MB");
	    System.out.println("The memory size of SysNode3: " + sysNode3.getMemory_size()+" MB");
	    System.out.println("The memory size of SysNode2: " + sysNode2.getMemory_size()+" MB");
	    System.out.println("The memory size of SysNode1: " + sysNode1.getMemory_size()+" MB");
	    
	    System.out.println("  ");
	    System.out.println("---------------Test6----------------");
	    
	    /* 
	    System.out.println("  ");
	    System.out.println("---------------Test7----------------");
	    System.out.println(tree.shortestPath(user1, sysNode3)); */
	}
}

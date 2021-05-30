

	public static void main(String args[]) {
		
		DataDB principalDB = new DataDB();
		
		Data  data1 = new Data(3,"music");
		Data  data2 = new Data(2, "chat");
		Data  data3 = new Data(8,"news");
		Data  data4 = new Data(3,"machine learning");
		Data  data5 = new Data(1, "vegan food");
		Data  data6 = new Data(2,"top hits");
		Data  data7 = new Data(4,"covid");
		Data  data8 = new Data(1, "Bob Marely");
		Data  data9 = new Data(2,"donald trump");
		
		principalDB.addData(data1);
		principalDB.addData(data2);
		principalDB.addData(data3);
		principalDB.addData(data4);
		principalDB.addData(data5);
		principalDB.addData(data6);
		principalDB.addData(data7);
		principalDB.addData(data8);
		principalDB.addData(data9);
		
		SystemNode sysNode1 = new SystemNode(40);
		SystemNode sysNode2 = new SystemNode(40);
		SystemNode sysNode3 = new SystemNode(50);
		SystemNode sysNode4 = new SystemNode(40);
		SystemNode sysNode5 = new SystemNode(50);
		
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
		SystemConnexion cnx4 = new SystemConnexion(sysNode4,sysNode5);
		SystemConnexion cnx5 = new SystemConnexion(sysNode5,sysNode1);
		SystemConnexion cnx6 = new SystemConnexion(sysNode1,sysNode3);
		SystemConnexion cnx7 = new SystemConnexion(sysNode1,sysNode4);
		SystemConnexion cnx8 = new SystemConnexion(sysNode3,sysNode5);
		SystemConnexion cnx9 = new SystemConnexion(sysNode2,sysNode5);
		SystemConnexion cnx10 = new SystemConnexion(sysNode2,sysNode4);
		
		
		user1.addData(data1);
		user1.addData(data3);
		user1.addData(data5);
		
		
		
	}


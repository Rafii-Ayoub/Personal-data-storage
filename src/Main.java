
public class Main {
	public static void main(String args[]) {
		Data  data1 = new Data(3,"music");
		Data  data2 = new Data(2, "chat");
		Data  data3 = new Data(8,"news");
		Data  data4 = new Data(3,"machine learning");
		Data  data5 = new Data(1, "vegan food");
		Data  data6 = new Data(2,"top hits");
		Data  data7 = new Data(4,"covid");
		Data  data8 = new Data(1, "Bob Marely");
		Data  data9 = new Data(2,"donald trump");
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
		
	}

}


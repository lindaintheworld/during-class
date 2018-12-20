package ncs.test8;

public class UserTest {

	public static void main(String[] args) {
		User[] users = new User[3];
		
		users[0] = new User("user01", "pass01", "±èÃ¶¼ö", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "ÀÌ¿µÈñ", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "È²ÁøÀÌ", 20, 'F', "010-9874-5632");
		
		System.out.println("users list ------------------------------------------------------");
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i].toString());
		}
		User[] copyUsers = new User[users.length];
		System.out.println("copyUsers ------------------------------------------------------");
		for(int i = 0; i < copyUsers.length; i++) {//for~each¹® ÀÌ¿ë
			copyUsers[i] = (User) users[i].clone();
			//System.out.println(copyUsers[i]);
		}
		//for~each
		for(User u : copyUsers) {
			System.out.println(u);
		}
		
		System.out.println("ºñ±³°á°ú --------------------------------------------------------------");
		System.out.println();
		for(int j = 0; j < users.length; j++) {
			System.out.println(users[j].equals(copyUsers[j]));
		}
	}

}

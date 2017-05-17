public class Users{
	private User[] users;
	private int top;
	
	Users(){
		this.users = new User[100];
		this.top = 0;
	}
	
	void addUser(User user){
		users[top] = user;
		top++;
	}
	User getUser(int i){
		return this.users[i];
	}
}

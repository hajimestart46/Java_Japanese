package LW;

public class User {
	private String userName;
	
	//コンストラクタ
	public User(String userName) {
		this.userName = userName;
	}
	
	public void setUser(String userName) {
		this.userName = userName;
	}
	
	public String getUser() {
		return userName;
	}
	
	//ユーザーの名前を取得
    public String userInfo() {
    	return getUser();
    }
    
    
}

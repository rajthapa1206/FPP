package programmingassignment5_1;

public class MySingleton {
	private static MySingleton instance = new MySingleton();
	
	private MySingleton(){
		
	}
	
	public static MySingleton getInstance()
    {
        if (instance == null)
            instance = new MySingleton();
        return instance;
    }

}
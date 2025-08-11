package Game;

public class Game {
	String name = "pubg";
	int id = 25;
	String type = "action";
	
	public void display() {
		System.out.println("Game Name : "+ name);
		System.out.println("Game id : "+ id);
		System.out.println("Game action : "+ type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g = new Game();
		g.display();

	}

}

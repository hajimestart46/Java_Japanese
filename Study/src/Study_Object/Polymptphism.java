package Study_Object;

// メインクラス
public class Polymptphism {

	public static void main(String[] args) {
		
		// シューティングゲームのインスタンスを作成
		ShootingGame sg = new ShootingGame("シューティングゲーム");
		
		// プレイヤー「田中」がシューティングゲームをプレイ
		Player pl1 = new Player("田中", sg);
		
		// プレイヤー情報とゲーム情報の表示
		pl1.display();
		
		// プレイヤーがゲームを練習
		pl1.practice();
	}
}

// 抽象メソッドを含むためインスタンス化はできない
abstract class Game {
	
	String name;  // ゲームの名前
	
	// コンストラクタ：ゲームの名前を初期化
	Game(String name){
		this.name = name;
	}
	
	// ゲーム名を表示（共通メソッド）
	void display() {
		System.out.println("ゲーマー:" + name);
	}
	
	// 抽象メソッド（サブクラスで必ずオーバーライドが必要）
	abstract void practice();
}

class ShootingGame extends Game {

	// コンストラクタ：Gameクラスのコンストラクタを呼び出す
	ShootingGame(String name) {
		super(name);
	}

	// practiceメソッドの実装（オーバーライド）
	void practice() {
		System.out.println("シューティングゲーム練習中...");
	}
}

class Player {
	
	private String name;   // プレイヤーの名前
	private Game game;     // プレイヤーがプレイするゲーム（Game型）

	// コンストラクタ：プレイヤー名とゲームを設定
	Player(String name, Game game) {
		this.name = name;
		this.game = game;
	}
	
	// プレイヤーとゲームの情報を表示
	void display() {
		System.out.println("ゲーマー:" + name);
		game.display();  // ゲーム側のdisplayも呼び出し
	}
	
	// ゲームの練習（Game型に委譲）
	void practice() {
		game.practice(); // 実際に呼ばれるのはShootingGameのpractice（ポリモーフィズム）
	}
}

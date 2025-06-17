package Study_Object;

public class InterfaceObject {

	public static void main(String[] args) {
		//インタフェース
		//多重継承できる
		
		Learner l1 = new Learner("田中");
		l1.display();
		// Languageインタフェースに定義された info メソッドの実装を呼び出し
		l1.info();
	}
}

interface Language {
	//定数：public static final(定数)暗黙
	String name = "[英語]";
	//抽象メソッド：public abstrct
	void info();
}

class Learner implements Language {
	private String Lname;
	//コンストラクタ
	Learner(String Lname) {
		this.Lname = Lname;
	}
	public void display() {
		System.out.println("名前:" + Lname);
	}
	//抽象メソッドをオーバーライド（実装必須）
	@Override
	public void info() {
		System.out.println(Language.name);
		System.out.println("Name:" + Lname);
	}
	
}

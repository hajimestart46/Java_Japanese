package Study_Object;

public class IntermediateObject {

	public static void main(String[] args) {
		
		/*
		 	継承とは、既存のクラスをもとに変数やメソッドを追加したクラスを作ること
		 	継承関係にある親のクラスをスーパークラス、子のクラスをサブクラス
		 	＊継承できるクラスは1つだけ
		 	＊コンストラクタは継承しない
		*/
		
		/*
		 	＊thisのメリット： 引数の名前を考えなくても良い
		 	＊superのメリット：再び書く必要はない
		 	＊this(),super()コンストラクタ内の先頭に記述
	　　    */
		Students stu1 = new Students("山田", 2);
		//スーパークラスのメソッド
		//stu1.setName("山田");
		stu1.display();
		//サブクラスのメソッド
		//stu1.setStuNo(1);
		stu1.displayStuNo();
	}

}

class Person { //final class Personに設定すると継承できない
	private String name;
	
	//コンストラクタ
	Person() {
		this("未設定");
	}
	
	public Person(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;//this.～は自オブジェクトの
	}
	public String getName() {
		return name;
	}
	public void display() { 
		System.out.println("(super)名前 " + name);
	}
	final void Test() {} 
}

class Students extends Person {
	private int stuNo;
	
	//コンストラクタ
	Students(String name, int stuNo) {
		//このsuper()なければ自動的にsuper();が挿入される
		super(name);
		this.stuNo = stuNo;
	}
	public void setStuNo(int s) {
		stuNo = s;
	}
	
	public void displayStuNo() { 
		System.out.println("学籍番号 " + stuNo);
	}
	//オーバーライド
	//サブクラスでスーパークラスのメソッドを再定義することをオーバーライド
	public void display() {
		super.display();//super.～はスーパークラスの
		System.out.println("オーバーライドした");
		/*	メンバー変数nameはprivate指定されて、Personクラスの中でしか
		  	アクセスすることができないメンバー変数変数
		*/
		System.out.println("(sub)名前 " + getName());//getNameメソッドを経由して取得すること
	}
}

class Teachers extends Person {
	
	final String name = "山本";
	//name = "佐藤"; 代入不可能
	
	//void Test( ) {} オーバーライド不可能
}

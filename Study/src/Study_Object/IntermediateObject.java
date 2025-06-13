package Study_Object;

public class IntermediateObject {

	public static void main(String[] args) {
		
		/*
		 	継承とは、既存のクラスをもとに変数やメソッドを追加したクラスを作ること
		 	継承関係にある親のクラスをスーパークラス、子のクラスをサブクラス
		 	＊継承できるクラスは1つだけ
		 	＊コンストラクタは継承しない
		 */
		Students stu1 = new Students();
		//スーパークラスのメソッド
		stu1.setName("山田");
		stu1.display();
		//サブクラスのメソッド
		stu1.setStuNo(1);
		stu1.displayStuNo();
	}

}

class Person {
	private String name;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void display() { 
		System.out.println("名前 " + name);
	}
}

class Students extends Person {
	private int stuNo;
	
	public void setStuNo(int s) {
		stuNo = s;
	}
	
	public void displayStuNo() { 
		System.out.println("学籍番号 " + stuNo);
	}
	//オーバーライド
	//サブクラスでスーパークラスのメソッドを再定義することをオーバーライド
	public void display() {
		System.out.println("オーバーライドした");
		/*	メンバー変数nameはprivate指定されて、Personクラスの中でしか
		  	アクセスすることができないメンバー変数変数
		*/
		System.out.println("名前 " + getName());//getNameメソッドを経由して取得すること
	}
}

class Teachers extends Person {
	
}
package Study_Object;

public class ReferenceType {

	public static void main(String[] args) {
		//参照型の型変換
		Maker mkr1 = new Maker("HOMDA");
		Car car = mkr1;//自動で行われる
		Maker mk2 = (Maker)car;//キャストで明示する
		car.display();//オーバーライドを後の有効する
		
		//メモリ上にサブクラスの情報が存在しない
		//car.chgStuNo(); これはコンパイルエラーになる
		
		//メモリ上にサブクラスのメソッドが存在する
		mk2.chgCarNo();
	}

}

class Car {
	
	String name;
	
	//コンストラクタ
	public Car(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Carのdisplayメソッド");
	}
}

class Maker extends Car {
	
	int carNo;
	public Maker(String name) {
		super(name);
	}
	public void display() {
		System.out.println("Makerのdisplayメソッド");
	}
	public void chgCarNo() {
		System.out.println("MakerのchgCarNoメソッド");
	}
	
}
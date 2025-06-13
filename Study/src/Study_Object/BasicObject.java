package Study_Object;

public class BasicObject {
	
	public static void main(String[] args) {
		
		/*	オブジェクト指向
		 	
		 	＊実行用クラスと設計図クラスがある
		 	＊オブジェクト：クラスから作られる実体（エンティティ）
		 	＊オブジェクト指向：オブジェクトを中心にしてプログラムを作る考え方
			
			実行用クラス：mainメソッドを記述
			設計図クラス：属性と操作を記述
		*/
		
		/*	メソッド定義
	 	
	 		戻り値の型　メソッド名(引数リスト){(処理)}
		
			＊引数：呼び出し元から受け取る値
			＊戻り値：メソッドの処理の後に呼び出し元に返す値、returnで指定する。
			何も返さない場合は、戻り値の型にvoidを記述する
		 */
		Student stu1 = new Student();
		stu1.name = "山田 太郎";
		stu1.setScore(60, 60);
		stu1.display();
	}
}

class Student {
	//メンバ変数
	String name;
	int engScore;
	int mathScore;
	
	//メソッド
	void display() {
		System.out.println(name + "さん");
		System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
	}
	void setScore(int eng, int math) {
		engScore = eng;
		mathScore = math;
	}
	double getAvg() {
		double avg = (engScore + mathScore) / 2.0;
		return avg;
	}
}

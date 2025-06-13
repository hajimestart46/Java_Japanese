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
		
		/*	メソッド定義s
	 	
	 		戻り値の型　メソッド名(引数リスト){(処理)}
		
			＊引数：呼び出し元から受け取る値
			＊戻り値：メソッドの処理の後に呼び出し元に返す値、returnで指定する。
			何も返さない場合は、戻り値の型にvoidを記述する
		*/
		
		/*	カプセル化
		   
		   修飾子	| 同じクラス  |	 同じパッケージ	| サブクラス |	 他
		   ---------------------------------------------------------------
		   public   |     ○	  |	       ○		|     ○     |   ○
		   ---------------------------------------------------------------
		   protected|     ○	  |	       ○		|     ○     |
		   ---------------------------------------------------------------
		   (なし)   |     ○	  |	       ○       |            |
		   ---------------------------------------------------------------
		   private  |     ○	  |	                |            |
		*/
		
		//Studentクラスはインスタンス化
		Student stu1 = new Student("山田 太郎");
		Student stu2 = new Student("佐藤 太郎");
		//呼び出すメソッドは名前と引数の組合せで決めている
		stu1.setScore(60, 60);
		stu1.display();
		//stu1.phyScore = 10; これは代入可能
		//stu1.engScore = 10; これは代入不可能
		//オブジェクトを生成しなくても利用できる static型
		Student.info();
	}
}

class Student {
	//メンバ変数
	String name;
	private int engScore;//メンバ変数は隠ぺいした
	int mathScore;
	int phyScore;
	//学生をカウンタする
	static int counter = 0;
	
	
	//コンストラクタ
	/*	
 	＊名前がクラス名と同じ
 	＊戻り値を持たない
 	＊new クラス名(コンストラクタへの引数)
	*/
	Student(String n) {
		name = n;
		System.out.println(n + "さんをインスタンス化しました");
		counter++;
	}
	//メソッド
	void display() {
		System.out.println(name + "さん");
		System.out.println("英語" + engScore + "点・数学" + mathScore + "点・物理" + phyScore + "点");
	}
	void setScore(int eng, int math) {
		engScore = eng;
		mathScore = math;
	}
	//オーバーロード
	void setScore(int eng, int math, int phy) {
		engScore = eng;
		mathScore = math;
		phyScore = phy;
	}
	double getAvg() {
		double avg = (engScore + mathScore) / 2.0;
		return avg;
	}
	static void info() {
		System.out.println(counter + "名学生です");
	}
}

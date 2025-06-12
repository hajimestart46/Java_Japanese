
public class renshu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 // i1を作成（num = 100）
        Item i1 = new Item(100);

        // i2を作成（num = 200, next = i1）
        Item i2 = new Item(200, i1);

        // i1.next = i2 を設定
        i1.next = i2;

        // 出力（結果は700）
        System.out.println(i1.num + i2.num + i1.next.num + i2.next.next.num);
        // → 100 + 200 + 200 + 200 = 700
	}

}

//Item クラス
class Item {
 int num;
 Item next;

 // コンストラクタ1（numだけ）
 Item(int num) {
     this.num = num;
     this.next = null;
 }

 // コンストラクタ2（numとnext）
 Item(int num, Item next) {
     this.num = num;
     this.next = next;
 }
}


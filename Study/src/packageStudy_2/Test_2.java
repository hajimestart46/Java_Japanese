package packageStudy_2;
//他のパッケージのクラスを使うために import が必要
import packageStudy_1.Test_1;

public class Test_2 {
	public static void main(String[] args) {
		Test_1 t1= new Test_1("T1");
		t1.display();
	}
}

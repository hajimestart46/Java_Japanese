public class Basic {
	public static void main(String[] args) {
		
		//format　フォーマット　形式
				//クラスやインタフェース：大文字は1文字目
				//変数やメソッドやパッケージ：小文字は1文字目
				
				/*  変数名のルール
				    - 1文字目
				    英字(a-z,A-Z), _ , S
				    - 2文字目以降は数字も可
				    - キーワードは使えない
				*/
				int $a = 1;//int型は$aを宣言し、1を代入した
				//初期化する
				System.out.println($a);//$できる
				int _a = 1;
				System.out.println(_a);//_できる
				//_aを参照する
			    
			    float a = 11f;
			    System.out.println(a);
			    
			    /**  配列
			    	データ型[] 配列名 = new データ型[要素数];
			    	int[] score1 = new int[3];
			    	int[] score2 = {1,2,3};//[]内の数字は添字
			    **/
			    
			    //多次元配列
			    
			    /* int[][] multiArray = new int[2][3];
			    	multiArray[0][0] = 10;
				    multiArray[0][1] = 10;
				    multiArray[0][2] = 10;
				    multiArray[1][0] = 10;
				    multiArray[1][1] = 10;
				    multiArray[1][2] = 10;
				*/
			    
			    int[][] multiArray = {{10, 20, 30},{10, 20, 30}};

			    System.out.println(multiArray.length);
			    System.out.println(multiArray[0].length);
			    
			    int plus = 1;
			    int plus1 = plus++;
			    //int plus2 = ++plus;
			    
			    System.out.println("plus++ " + plus1);
			    System.out.println(plus == plus1);
			    //System.out.println("++plus " + plus2);
			    
			    /*	数値同士の演算や代入をする時に
			    	自動で行われる：表現できる値の幅が小->大
			    	キャストで明示する：表現できる値の幅が大->小
			    */
			    int sho = 1;
			    double dai = 10;
			    
			    dai = sho;
			    sho = (int)dai;//キャストが必要
		
	}
}

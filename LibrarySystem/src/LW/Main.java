package LW;

public class Main {
	public static void main(String[] args) {
		// 図書館オブジェクトを作成
		Library library = new Library();
		
		//ユーザーオブジェクトを作成
		User u1 = new User("田中");
		User u2 = new User("佐藤");
		
		// 書籍オブジェクトを作成
		Book book1 = new Book("走れメロス", "太宰治");
		Book book2 = new Book("ノルウェイの森", "村上春樹");
		Book book3 = new Book("自分の変え方　認知科学コーチングで新しい自分に会いに行く", "村岡 大樹");
		
		System.out.println("--------------------------------------------------------------");
		// 図書館に書籍を追加
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		// 蔵書一覧を表示
		library.showAllBooks();

		// 本を借りる処理
		library.bookBorrowed("走れメロス", u1);
		library.bookBorrowed("ノルウェイの森", u2);
		library.bookBorrowed("走れメロス", u2); 

		// 再度蔵書一覧を確認
		library.showAllBooks();
		
		// 本を返却する処理（違うユーザーを返却すると返却できない）
		library.bookReturned("走れメロス", u1);

	}
}

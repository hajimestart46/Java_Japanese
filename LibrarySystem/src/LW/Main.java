package LW;

public class Main {
	public static void main(String[] args) {
		// 図書館オブジェクトを作成
		Library library = new Library();

		// 書籍オブジェクトを作成
		Book book1 = new Book("走れメロス", "太宰治");
		Book book2 = new Book("ノルウェイの森", "村上春樹");

		// 図書館に書籍を追加
		library.addBook(book1);
		library.addBook(book2);

		// 蔵書一覧を表示
		library.showAllBooks();

		// 本を借りる処理
		library.bookBorrowed("走れメロス");
		library.bookBorrowed("ノルウェイの森");
		library.bookBorrowed("走れメロス"); 

		// 再度蔵書一覧を確認
		library.showAllBooks();
	}
}

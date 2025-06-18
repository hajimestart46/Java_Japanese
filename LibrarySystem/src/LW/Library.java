package LW;

import java.util.ArrayList;

public class Library {
	// 図書館にある本のリスト
	private ArrayList<Book> books;

	// コンストラクタ
	public Library() {
		books = new ArrayList<>();
	}

	// 図書館に本を追加するメソッド
	public void addBook(Book book) {
		books.add(book);
		System.out.println("「" + book.getBookName() + "」を図書館に追加しました。");
	}

	// 現在の蔵書の一覧を表示するメソッド
	public void showAllBooks() {
		System.out.println("現在の蔵書一覧:");
		for (Book book : books) {
			book.bookInfo(); // 各本の情報を表示
		}
	}

	// 本を借りる処理
	public void bookBorrowed(String bookName) {
		for (Book book : books) {
			if (book.getBookName().equals(bookName)) {
				book.borrow(); // Bookクラスのborrow()を呼び出す
				return;
			}
		}
		// 一致する本が見つからなかった場合
		System.out.println("「" + bookName + "」は図書館に存在しません。");
	}
}

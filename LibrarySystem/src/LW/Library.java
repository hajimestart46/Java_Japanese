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
		for(Book b : books) {
			// 本の配列の要素を取得して引数に渡した値と判断する
			if(b.getBookName().equals(book.getBookName())) {
				// 同じの場合は追加できない
				System.out.println("再追加できないです。");
				return; // 処理終了
			}
		}
		books.add(book);
		System.out.println("「" + book.getBookName() + "」を図書館に追加しました。");
		
 	}
	
	// 現在の蔵書の一覧を表示するメソッド
	public void showAllBooks() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("現在の蔵書一覧:");
		for(Book book : books) {
			book.bookInfo(); // 各本の情報を表示
		}
		System.out.println("--------------------------------------------------------------");
	}

	// 本を借りる処理
	public void bookBorrowed(String bookName,  User user) {
		for(Book book : books) {
			if(book.getBookName().equals(bookName)) {
				book.borrow(user); // Bookクラスのborrow()を呼び出す
				return; // 処理終了
			}
		}
		// 一致する本が見つからなかった場合
		System.out.println("「" + bookName + "」は図書館に存在しません。");
	}
	
	// 本を返す処理
	public void bookReturned(String bookName, User user) {
		for(Book book: books) {
			if(book.getBookName().equals(bookName)) {
				book.bookReturn(user);// BookクラスのbookReturn()を呼び出す
				return; // 処理終了
			}
		}
		// 一致する本が見つからなかった場合
		System.out.println("「" + bookName + "」は図書館に存在しません。");
	}
}

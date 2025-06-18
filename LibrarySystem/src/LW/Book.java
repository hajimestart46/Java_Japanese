package LW;

public class Book {
	// 書籍のタイトル
	private String bookName;
	// 著者名
	private String writer;
	// 借りられているかどうかの状態
	private boolean isBorrowed;

	// コンストラクタ
	public Book(String bookName, String writer) {
		this.bookName = bookName;
		this.writer = writer;
		this.isBorrowed = false;
	}

	// 書籍の基本情報と状態を表示
	public void bookInfo() {
		String status = isBorrowed ? "貸出中" : "利用可能";
		System.out.println("書籍: " + bookName + " / 著者: " + writer + " / 状態: " + status);
	}

	// 本を借りる処理（借りられていなければ貸出する）
	public void borrow() {
		if (!isBorrowed) {
			isBorrowed = true;
			System.out.println("「" + bookName + "」を借りました");
		} else {
			System.out.println("「" + bookName + "」はすでに貸出中です");
		}
	}

	// 本を返却する処理
	public void bookReturn() {
		if (isBorrowed) {
			isBorrowed = false;
			System.out.println("「" + bookName + "」を返却しました");
		} else {
			System.out.println("「" + bookName + "」はまだ借りられていません");
		}
	}

	// 本が貸出可能かを返す（true: 借りられていない）
	public boolean isAvailable() {
		return !isBorrowed;
	}

	// 本のタイトルを取得
	public String getBookName() {
		return bookName;
	}
}

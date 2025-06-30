package LW;

public class Book {
	// 書籍のタイトル
	private String bookName;
	// 著者名
	private String writer;
	// 借りられているかどうかの状態
	private boolean isBorrowed;
	// 誰に借りられた・返却した確定
	private User userBorrowed;
	
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
	public void borrow(User user) {
		try {
			if (!isBorrowed) {
				isBorrowed = true;
				//現在借りられたユーザーの値を代入する
				userBorrowed = user;
				System.out.println(user.userInfo() + " さんが「" + bookName + "」を借りました。");
			} else {
				System.out.println("「" + bookName + "」はすでに" + userBorrowed.userInfo() + "さんは貸出中です。");
			}
		} catch(Exception e) {
			System.out.println("ユーザーがないです。");
		}
	}

	// 本を返却する処理
	public void bookReturn(User user) {
		// 借りられたユーザーは返却するとき
		if (isBorrowed && userBorrowed.equals(user)) {
			isBorrowed = false;
			// ユーザーはNULL
			userBorrowed = null;
			System.out.println(user.userInfo() + " さんが「" + bookName + "」を返却しました。");
		} else {
			System.out.println("「" + bookName + "」はまだ借りられていません。");
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

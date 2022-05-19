package extendEx3;

public class Library extends People {
	String bookName;

	public Library(String name, int birthday, String address, String phoneNumber) {
		
		super(name, birthday, address, phoneNumber);
	}

	public void bookRental() {

		System.out.println(this.getName() + "님이 대출한 책은 "+ this.getBookName());
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}

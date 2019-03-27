package Classes;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shelve shelve = new Shelve();
		//	Book(String title, String courseID, int level, Person owner,  boolean availability, double price, String status)
//    Person(String name,String academicNum,int level, String phone,String email){
		//   public Owner(String Name,String OwnerID, int level, String phone,String email, boolean gotPaid,boolean graduating,int bookCount)

		Person p = new Owner("Jumana", "111", 5, "0505", "@",true, true, 4);
		System.out.println(p);
		Book network = new Book("network", "CIS", 5, p , true, 200, "Sale");
		System.out.println(network);
		shelve.addBook(network);
		System.out.println("Borrow books: " + shelve.booksForBorrow);
		System.out.println("Sale Books: " + shelve.booksForSale);
		System.out.println("get book by name " + shelve.getBooksByName("network"));
		System.out.println(shelve.getBooksOwnedBy(p));
	}

}

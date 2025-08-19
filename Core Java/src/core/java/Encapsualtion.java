package core.java;

class Book{
	int pages;
}

public class Encapsualtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.pages= 100;
		System.out.println(b.pages);
		b.pages= -100;
		System.out.println(b.pages);
	}

}


//---------No Security --- Direct Access---------//



//class Book{
//	private int pages;
//}
//
//public class Encapsualtion {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Book b = new Book();
//		b.pages= 100;
//		System.out.println(b.pages);
//		b.pages= -100;
//		System.out.println(b.pages);
//	}
//
//}


//---------Maximum Security --- No Access---------//



//class Book{
//	private int pages;
//	public void setData(int x) {
//		if (x>0) {
//			pages = x;
//		}
//	}
//	public int getData() {
//		return pages;
//	}
//}
//
//public class Encapsualtion {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Book b = new Book();
//		
//		b.setData(100);
//		System.out.println(b.getData());
//		b.setData(-100);
//		System.out.println(b.getData());
//		
//	}
//
//}

//---------------------Maximum Security ---- Controlled Access--//

package core.java;

//class student {
//	String name;
//	int age;
//	float height;
//	
//	
//}
//
//public class Constructor {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		student s = new student();
//
//		System.out.println(s.name);
//		System.out.println(s.age);
//		System.out.println(s.height);
//		System.out.println("-------Default Constructor-------- Added by Compiler----");
//	}
//
//}

class student {
	String name;
	int age;
	float height;
	
	student(String name,int age,float height){
		this.name=name;
		this.age=age;
		this.height=height;
	}
	//Added by Programmer
		student (){
		String name;
		int age;
		float height;
}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student("Raj",27,5.9f);

		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.height);
		System.out.println("---------------");
		
		student s1= new student();
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.height);
		System.out.println("-------parameterized Constructor---------");
	}

}
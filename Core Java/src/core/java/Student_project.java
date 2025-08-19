package core.java;
import java.util.Scanner;

class Student{
	
//	Private VAriables
	private String name;
	private int age;
	private double marks;

// Default Constructor
	Student(){
		this.name = "Unknown";
		this.age = 0;
		this.marks = 0.0;
	}
//Parameterized Constructor
	Student(String name,int age,double marks){
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
// Copy Constructor
	Student(Student s){
		this.name = s.name;
		this.age = s.age;
		this.marks = s.marks;
	}
// Getters
	public String getName() { 
		return name;
	}
	public int getAge() { 
		return age; 
	}
	public double getMarks() { 
		return marks; 
	}	
// Setters
    public void setName(String name) { 
    	this.name = name; 
    }
    public void setAge(int age) { 
    	this.age = age; 
    }
    public void setMarks(double marks) { 
    	this.marks = marks; 
    }
    
// Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
    
}
	
public class Student_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name of Student:");
		String name = sc.next();
		
		System.out.println("Enter age of Student:");
		int age = sc.nextInt();
		
		System.out.println("Enter marks of Student:");
		double marks = sc.nextDouble();
		
        // Creating student using parameterized constructor
        Student s1 = new Student(name, age, marks);

        // Display student details
        System.out.println("\n--- Student Details ---");
        s1.display();

        // Copy constructor demo
        Student s2 = new Student(s1);
        System.out.println("\n--- Copied Student Details ---");
        s2.display();

        sc.close();
	}

}

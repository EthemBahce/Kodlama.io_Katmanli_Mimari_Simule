package Controller;

import Entity.Category;
import Entity.Course;
import Entity.Instructor;
import Repository.HibernateRepository;
import Service.ServiceManager;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		Category category2 = new Category();
		category1.setCategoryName("Yaz�l�m");
		category2.setCategoryName("Donan�m");
		
		
		
		Course course1 = new Course();
		Course course2 = new Course();
		course1.setCourseName("Java programlama");
		course1.setCoursePrice(10);
		course2.setCourseName("Python programlama");
		course2.setCoursePrice(30);
		
	
		
		Instructor instructor1 = new Instructor();
		instructor1.setInstructorName("Engin Demiro�");
		
		
		
		if(course1.getCoursePrice() < 0 || course2.getCoursePrice() < 0) {
			System.out.println("S�f�rdan k���k de�er verilemez!");
			return;
		}
		
		else if(category1.getCategoryName().equals(category2.getCategoryName())) {
			System.out.println("Ayn� Kategori ismi girilemez!");
			return;
		}
		
		else if(course1.getCourseName().equals(course2.getCourseName())) {
			System.out.println("Ayn� kurs ismi tekrar edilemez!");
			return;
			
		}
		
		else {
			ServiceManager sm1 = new ServiceManager(category1, course1, instructor1);
			sm1.add(new HibernateRepository());
		}
		
		
		
	
		
		
		
		

		
		

	}

}

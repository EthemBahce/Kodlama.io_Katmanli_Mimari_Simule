package Repository;

import Entity.Category;
import Entity.Course;
import Entity.Instructor;

public class HibernateRepository implements IRepository{

	@Override
	public void add(Category category) {
		System.out.println("Kategori eklendi");
		System.out.println("Hibernate çalýþtý");
		System.out.println("Kategori : " + category.getCategoryName());
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eðitmen eklendi");
		System.out.println("Hibernate çalýþtý");
		System.out.println("Eðitmen : " + instructor.getInstructorName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Kategori silindi");
		System.out.println("Hibernate çalýþtý");
		System.out.println("Kategori : " + category.getCategoryName());
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Eðitmen silindi");
		System.out.println("Hibernate çalýþtý");
		System.out.println("Eðitmen : " + instructor.getInstructorName());
	}
	
	@Override
	public void add(Course course) {
		System.out.println("Kurs eklendi");
		System.out.println("Hibernate çalýþtý");
		System.out.println("Kurs : " + course.getCourseName());
		System.out.println("Kursun fiyatý :" + course.getCoursePrice());
	}

	@Override
	public void delete(Course course) {
		System.out.println("Kurs silindi");
		System.out.println("hibernate çalýþtý");
		System.out.println("Kurs : " + course.getCourseName());
		System.out.println("Kursun fiyatý :" + course.getCoursePrice());
		
	}

	

	

}

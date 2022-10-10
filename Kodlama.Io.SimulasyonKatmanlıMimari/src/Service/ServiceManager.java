package Service;


import Entity.Category;
import Entity.Course;
import Entity.Instructor;
import Repository.IRepository;

public class ServiceManager {
	
	
	private Category category;
	private Course course;
	private Instructor instructor;
	
	public ServiceManager(Category category,Course course,Instructor instructor) {
		this.category = category;
		this.course = course;
		this.instructor = instructor;
		
		
		
	}
	
	
	
	public void add(IRepository iRepository) {
			iRepository.add(category);
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			iRepository.add(course);
			System.out.println("                                                     ");
			System.out.println("-----------------------------------------------------");
			iRepository.add(instructor);
		}
	
	
	public void delete(IRepository iRepository) {
		iRepository.delete(category);
		System.out.println("                                                     ");
		System.out.println("-----------------------------------------------------");
		iRepository.delete(course);
		System.out.println("                                                     ");
		System.out.println("-----------------------------------------------------");
		iRepository.delete(instructor);
	}

}

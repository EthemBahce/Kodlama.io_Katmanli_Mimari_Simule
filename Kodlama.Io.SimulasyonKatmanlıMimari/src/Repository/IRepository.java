package Repository;

import Entity.Category;
import Entity.Course;
import Entity.Instructor;

public interface IRepository {

	public void add(Category category);
	public void add(Course course);
	public void add(Instructor instructor);
	public void delete(Category category);
	public void delete(Instructor instructor);
	public void delete(Course course);
}

package manvi_workspace;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.*;


@Entity
public class Course //pojo 
{
	@Id
	private int cid;
	private String name;
	@ManyToMany(mappedBy="course")
	private List<Student> student = new ArrayList<Student>();
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String name, List<Student> student) {
		super();
		this.cid = cid;
		this.name = name;
		this.student = student;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}

	/*@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", student=" + student + "]";
	}*/
	
	
	
	
	
	
	
	
	

}

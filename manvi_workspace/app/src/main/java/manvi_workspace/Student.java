package manvi_workspace;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.util.*;

@Entity
public class Student 
{
    @Id
	private String usn;	
	private String name;	
	private String adharno;

	@ManyToMany
	private List<Course> course = new ArrayList<Course>();
	
	@ManyToOne
	private Department dep;
	
	@OneToOne
	private Laptops lap;
	
    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}  


	
	public Student(String usn, String name, String adharno, List<Course> course, Department dep, Laptops lap) {
		super();
		this.usn = usn;
		this.name = name;
		this.adharno = adharno;
		this.course = course;
		this.dep = dep;
		this.lap = lap;
	}



	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	

	public List<Course> getCourse() {
		return course;
	}


	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}



	public Laptops getLap() {
		return lap;
	}



	public void setLap(Laptops lap) {
		this.lap = lap;
	}	
	
	

	/*@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", adharno=" + adharno + ", course=" + course + "]";
	}*/
    
    

	

}

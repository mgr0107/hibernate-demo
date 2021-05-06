package manvi_workspace;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;


@Entity
public class Department {
	@Id
	private int depid;
	private String hod;
	@OneToMany(mappedBy = "dep")
	private List<Student> stud = new ArrayList<Student>();
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Department(int depid, String hod, List<Student> stud) {
		super();
		this.depid = depid;
		this.hod = hod;
		this.stud = stud;
	}


	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getHod() {
		return hod;
	}
	public void setHod(String hod) {
		this.hod = hod;
	}
	public List<Student> getStud() {
		return stud;
	}
	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	
	
	
	

}

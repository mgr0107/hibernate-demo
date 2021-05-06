package manvi_workspace;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptops {
	@Id
	private String lid;
	private String name;
	@OneToOne
	private Student st;
	
	public Laptops() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptops(String lid, String name, Student st) {
		super();
		this.lid = lid;
		this.name = name;
		this.st = st;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	
	
	

}

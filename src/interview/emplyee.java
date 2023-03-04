package interview;

public class emplyee {
	
	private int id;
	private String name;
	@Override
	public String toString() {
		return "emplyee [id=" + id + ", name=" + name + "]";
	}
	public emplyee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public emplyee(int id) {
		super();
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 

}

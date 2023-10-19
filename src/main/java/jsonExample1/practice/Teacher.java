package jsonExample1.practice;

public class Teacher {

	int id;
	String name;
	String Last;
	Long Payment;
	public Teacher(int id, String name, String last, Long payment) {
		super();
		this.id = id;
		this.name = name;
		Last = last;
		Payment = payment;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return Last;
	}
	public void setLast(String last) {
		Last = last;
	}
	public Long getPayment() {
		return Payment;
	}
	public void setPayment(Long payment) {
		Payment = payment;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", Last=" + Last + ", Payment=" + Payment + "]";
	}
	
	
}

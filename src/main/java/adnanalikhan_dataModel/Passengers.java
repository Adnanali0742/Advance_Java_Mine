package adnanalikhan_dataModel;

public class Passengers {
	
	private String name;
	private String pClass;
	private double age;
	private String sex;
	private int servived;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpClass() {
		return pClass;
	}
	public void setpClass(String pClass) {
		this.pClass = pClass;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getServived() {
		return servived;
	}
	public void setServived(int servived) {
		this.servived = servived;
	}
	@Override
	public String toString() {
		return "Passengers [name=" + name + ", pClass=" + pClass + ", age=" + age + ", sex=" + sex + ", servived="
				+ servived + "]";
	}

}

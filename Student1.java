package package1;

public class Student1 {

	String name;
	 String sex;
	 String grade;
	 String major;
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public String getSex() {
	  return sex;
	 }
	 public void setSex(String sex) {
	  this.sex = sex;
	 }
	 public String getGrade() {
	  return grade;
	 }
	 public void setGrade(String grade) {
	  this.grade = grade;
	 }
	
	 public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
	  return "姓名"+name+",性别"+sex+",专业"+grade+",班级"+major;
	 }
	}



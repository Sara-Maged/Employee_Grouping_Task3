package filtration.Task3.aID;


public class Employee {
	 private String name, title, mobile;
	 
	 public Employee(String name, String title, String mobile) {

	        this.name = name;
	        this.title = title;
	        this.mobile = mobile;
	    }
	 
	 @Override public String toString() {
		 return String.format("\nName %s - Mobile %s", name, mobile); 
		 }


	 
	 //Setters & Getters
	 //Name
	 
	 public void setEmployeeName(String eName) {
			this.name = eName; 
		}
	 
	 public String getEmployeeName() {
			return this.name;
		}
	 //Title
	 
	 public void setEmployeeTitle(String eTitle) {
			this.name = eTitle; 
		}
	 
	 public String getEmployeeTitle() {
			return this.title;
		}
	 //Mobile Number
	 public void setEmployeeNo(String eNo) {
			this.name = eNo; 
		}
	 
	 public String getEmployeeNo() {
			return this.mobile;
		}
	 
}

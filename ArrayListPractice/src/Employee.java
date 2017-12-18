

public class Employee {
 
    // member variables
    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private String employeeDesignation;
 
    // 4-arg parameterized constructor
    public Employee(int employeeId, String employeeName, int employeeAge,
            String employeeDesignation) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeDesignation = employeeDesignation;
    }
 
    // override toString() method
    @Override
    public String toString() {
        return "employeeId:" + employeeId 
                + "\t employeeName:" + employeeName 
                + "\t employeeAge:" + employeeAge
                + "\t employeeDesignation:" + employeeDesignation;
    }

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
    
}

/*public String toString(){
    String ss=super.toString();
    return ss+"\t supervisor: "+supervisor;
}
    public String getOldestStudent(ArrayList<Student> students) {
    	int maxAge=0;
    	String oldestStudent = "";
    	for (int i = 0, i < students.size(); i++) {
    		
    		Student currentStudent = students.get(i);
    		if(currentStudent.getAge() > maxAge) {
    			maxAge = currentStudent.getAge();
    			oldestStudent = currentStudent.getFirstName();
    		}
    	}
    	return oldestStudent;
    }
}



getOldestStudent(students);*/
import java.util.ArrayList;
 
public class main {
 
    public static void main(String[] args) {
 
        // create ArrayList object to store employee records
        ArrayList<Employee> empRecords = new ArrayList<Employee>();
 
        // add employee records to AL object
        empRecords.add(new Employee(101, "SJ", 19, "Writer"));
        empRecords.add(new Employee(102, "RS", 17, "Developer"));
        empRecords.add(new Employee(103, "ZR", 25, "Supporter"));
        empRecords.add(new Employee(104, "IL", 27, "Manager"));
        empRecords.add(new Employee(105, "SR", 15, "Marketer"));
 
        // retrieving employee records using enhanced forEach loop
        /*for(Employee emp : empRecords) {
            System.out.println(emp);
            }
            */
           PrintAll(empRecords);
        }
   
        public static void PrintAll(ArrayList<Employee> empRecords){
        	System.out.print("Employee ID:\t");
        	for (int i=0; i<empRecords.size(); i++){
        		
        		System.out.print(empRecords.get(i).getEmployeeId()+"\t");
        	}
        	System.out.print("\nName:\t\t");
        	for (int i=0; i<empRecords.size(); i++){

        	System.out.print(empRecords.get(i).getEmployeeName()+"\t");
    }
        }
}

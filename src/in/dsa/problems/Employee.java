package in.dsa.problems;

public class Employee implements Comparable<Employee>{

	int eid;
	int ediff;
	
	public Employee(int eid, int edesg) {
		this.eid = eid;
		this.ediff = edesg;
	}

	
	//sorting in descending order of diff. If 2 emp has same diff then based on eid:
	@Override
	public int compareTo(Employee o) {
		
		if(this.ediff < o.ediff) return 1;
		else if(this.ediff > o.ediff) return -1;
		else {
			return o.eid - this.eid;
		}
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", edesg=" + ediff + "]";
	}
	
}

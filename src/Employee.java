import javax.management.RuntimeErrorException;

public class Employee implements Comparable{
    private String fullName;
    private Double salary;

    
    
    public Double getSalary() {
        return salary;
    }
    public String getFullNmae() {
        return fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public Employee(String fullName, Double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Full Name: "+getFullNmae()+"\nSalary: "+ getSalary();
    }
    @Override
    public int compareTo(Object other) {
        if (other instanceof Employee ) {
            Employee emp = (Employee)other; //unboxing - cast, he changes the other to an Employee type
            // return this.getFullNmae().compareTo(emp.getFullNmae());
            //return (int) Math.round((emp.getSalary()-this.getSalary())); dessending order
            return (int) Math.round((this.getSalary()-emp.getSalary()));//assending order
        }
        // TODO Auto-generated method stub
        throw new RuntimeException("An Error occured");
    }
    
}

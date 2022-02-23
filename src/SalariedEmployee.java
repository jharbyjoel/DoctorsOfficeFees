public class SalariedEmployee extends Employee {
    private double salary;

    // no argument constructor
    public SalariedEmployee(){

    }
    public SalariedEmployee(String name, Date hireDate, double salary){
        super(name,new Date(hireDate));
        this.salary = salary;
    }

    public SalariedEmployee(SalariedEmployee other){
        super(other);
        this.salary=other.salary;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary +
                '}';
    }

    public boolean equals(SalariedEmployee other) {
        return (getName().equals(other.getName()) &&
                getHireDate().equals(other.getHireDate()) &&
                getSalary()== other.getSalary());
    }
}

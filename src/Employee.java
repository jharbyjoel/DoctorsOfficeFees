public class Employee extends Person{
    // instance variable
    private Date hireDate;

    // no argument constructor
    public Employee(){
        this("John Doe",new Date());

    }

    // constructor
    public Employee(String name,Date hireDate){
        super(name);
        this.hireDate = new Date(hireDate);
    }
    public Employee(Employee other){
        super(other);
        this.hireDate = other.hireDate;


    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String toString() {
        return "Employee{" +
                "hireDate=" + hireDate +
                '}';
    }

    public boolean equals(Employee other) {
        return (getName().equals(other.getName()) &&
                getHireDate().equals(other.getHireDate()));
    }
}

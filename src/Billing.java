public class Billing extends Patient {
    Doctor primaryPhys1;
    Patient name;
    double amountDue;


    public Billing(){

    }

    public Billing(Patient name, Doctor primaryPhys,double amountDue){
        super(name.getName(),primaryPhys);
        this.amountDue = amountDue;
    }


    public Doctor getPrimaryPhys1() {
        return primaryPhys;
    }


    public void setPrimaryPhys(Doctor primaryPhys) {
        this.primaryPhys = primaryPhys;
    }


    public void setName(Patient name) {
        this.name = name;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    public String toString() {
        return "Patient: " + getName() +
                "\nDoctor: " + getPrimaryPhys().getName() +
                "\nAmount Due: $" + amountDue;
    }

    public boolean equals(Doctor other) {
        return super.equals(other);
    }
}

public class Patient extends Person {
    Doctor primaryPhys;

    public Patient(){

    }
    public Patient(String name, Doctor primaryPhys){
        super(name);
        this.primaryPhys = primaryPhys;
    }

    public Doctor getPrimaryPhys() {
        return primaryPhys;
    }

    public void setPrimaryPhys(Doctor primaryPhys) {
        this.primaryPhys = primaryPhys;
    }

    public String toString() {
        return "The name is: " + getName() + ", " + "The primary Doctor is: " + primaryPhys.getName();
    }

    public boolean equals(Patient other) {
        return getPrimaryPhys().equals(other.primaryPhys);
    }
}

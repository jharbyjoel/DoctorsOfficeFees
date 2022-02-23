import javax.print.Doc;
import java.time.LocalTime;
import java.sql.Time;
import java.util.Random;


public class Doctor extends SalariedEmployee {
    private String docSpeciality;
    private double officeFee;

    final Random random = new Random();
    final int millisInDay=24*60*60*1000;
    Time time = new Time((long)random.nextInt(millisInDay));

    public Doctor(){

        this("None",new Date(0,0,0),0,"None",0);

    }
    public Doctor(String name, Date hireDate, double salary, String docSpeciality, double officeFee){
        super(name, new Date(hireDate),salary);
        this.docSpeciality=docSpeciality;
        this.officeFee=officeFee;
    }
    public Doctor(Doctor other){
        super(other);
        this.docSpeciality = other.docSpeciality;
        this. officeFee = other.officeFee;
    }

    public String getDocSpeciality() {
        return docSpeciality;
    }

    public void setDocSpeciality(String docSpeciality) {
        this.docSpeciality = docSpeciality;
    }

    public double getOfficeFee() {
        return officeFee;
    }

    public void setOfficeFee(double officeFee) {
        this.officeFee = officeFee;
    }




    public String toString() {
        return
                 "The doctor " + getName() + " was hired on " + getHireDate() + " " + time + " EST" +
                " at Salary " + getSalary()  + "." +
                "\nThe speciality is " + docSpeciality +
                " and the visit fee is $" + officeFee + ".";
    }


    public boolean equals(Doctor other) {
        return (getName().equals(other.getName()) &&
                getHireDate().equals(other.getHireDate()) &&
                getSalary()== other.getSalary()) &&
                docSpeciality.equals(other.docSpeciality)
                && officeFee==other.officeFee;
    }
}

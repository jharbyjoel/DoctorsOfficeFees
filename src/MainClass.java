import java.time.LocalTime;
public class MainClass {
    public static void main(String args[]){
        System.out.println("=======================================================================");
        System.out.println("=======================================================================");
        System.out.println("*Doctor Information*");
        System.out.println("===============================");

        Doctor d1 = new Doctor("Jharby",new Date(02,6,2022),150000,"Surgeon",150.0);
        System.out.println(d1);

        Doctor d2 = new Doctor("Joel",new Date(1,1,2021),200000,"Pediatrist",200.0);
        System.out.println(d2);

        Doctor d3 = new Doctor("Saravia",new Date(1,1,1998),250000,"Kidney",500.0);
        System.out.println(d3);

        System.out.println("=======================================================================");
        System.out.println("=======================================================================");
        System.out.println("*Patient Information*");
        System.out.println("===============================");

        Patient p1 = new Patient("Fred",d1);
        System.out.println(p1);
        Patient p2 = new Patient("Bob",d2);
        System.out.println(p2);
        Patient p3 = new Patient("Lilly",d3);
        System.out.println(p3);

        System.out.println("=======================================================================");
        System.out.println("=======================================================================");
        System.out.println("*Billing information*");
        System.out.println("===============================");

        Billing b1 = new Billing(p1,d1,d1.getOfficeFee());
        System.out.println(b1);
        Billing b2 = new Billing(p2,d2,d2.getOfficeFee());
        System.out.println(b2);
        Billing b3 = new Billing(p3,d3,d3.getOfficeFee());
        System.out.println(b3);
        System.out.println("");
        System.out.println("The total income from billing records is: " + (d1.getOfficeFee() + d2.getOfficeFee() + d3.getOfficeFee()) );



    }

}

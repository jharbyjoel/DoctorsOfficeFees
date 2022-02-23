public class Person {
    // instance variables
    private String name;

    // no argument constructor (this constructor is called if super is not used in child class)
    public Person(){
        this("None");

    }
    // argument constructor (called when super is used)
    public Person(String name){
     this.name = name;

    }
    public Person(Person other){
        if(other == null){
            System.out.println("Error creating the Person");
            System.exit(0);
        }
        this.name= other.name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean equals (Person other){
        return (getName().equals(other.getName()));
    }
}

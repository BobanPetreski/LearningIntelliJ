package unitTest;

public class Account {
    String name;
    String lastName;
    int age;



    public static void main(String[] args) {

        Account a = new Account();

        a.setAge(32);
        a.setName("Boban");
        a.lastName("Petreski");
        System.out.println(a.getAge());
        System.out.println(a.getName());
        System.out.println(a.lastName());
        

        a.printDetails();
    }

    private void setlastName(String lastName) {
        this.lastName = lastName;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return  this.name;
    }
    public String getSurname() {
        return this.lastName;
    }
    private void printDetails() {

        System.out.println(name + ", " + age " + " lastName);
    }
}



    




package unitTest;

public class Account {
    String name;
    int age;



    public static void main(String[] args) {

        Account a = new Account();

        a.setAge(31);
        a.setName("Boban");
        System.out.println(a.getAge());
        System.out.println(a.getName());
        

        a.printDetails();
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


    private void printDetails() {

        System.out.println(name + ", " + age);

        System.out.println("Learning GIT");

        String name = "KlaraCvetanoska";

        System.out.println("learning how to push our changes");

        System.out.println("Pushing changes using git bash");
    }
}



    




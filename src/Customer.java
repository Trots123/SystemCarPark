public class Customer {
    private int id;
    private String name;
    private int age;
    private double balance;

    public Customer(int id, String name, int age, double balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

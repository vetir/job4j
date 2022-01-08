package job4j;

public class User {
    private int age;
    private String name;
    private String lastName;
    private char sex;
    private int salary ;

    public User() {
    }

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User(int age, String name, char sex, int salary) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    protected void finalize()throws Throwable {
        super.finalize();
        System.out.println(String.format("destory object user", this.name));
    }
}

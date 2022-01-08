package lifeCode;


import java.util.Objects;

public class User {

    private String firstName = null;
    private String LastName = null;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return firstName.equals(user.firstName) && LastName.equals(user.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, LastName);
    }

    public static void main(String[] args) {

        User user = new User();

    }


    public boolean equals(String s1, String s2) {
        return ( s1.equals(s2));
    }

//    public boolean equals(Man man) {
//        return this.dnaCode ==  man.dnaCode;
//    }

}






package khmil.java8.Lambda;

interface Userbuilder {
    User create(String name);
}

class User {


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public User(String firstName) {
        this.firstName = firstName;
    }
}

public class ConstructorRef {
    public static void main(String[] args) {
        Userbuilder userbuilder = User::new;
        User user = userbuilder.create("Ivan");
        System.out.println(user);

    }
}

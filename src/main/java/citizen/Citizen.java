package citizen;

public class Citizen {

    private final String firstName;
    private final String lastName;

    public Citizen(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void selectPill(String k) {
        System.out.println(" Citizen : " + firstName + "" + lastName + " selected : " + k);
    }

    public void type() {
        System.out.println(" Citizen : " + firstName + " " + lastName + " typed :" + " Welcome to Matrix , Neo ! ");
    }
}

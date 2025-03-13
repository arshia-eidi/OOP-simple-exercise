public class Main {
    public static void main(String[] args) {
        Person person = new Person("", 0);

        person.setName("Arshia");
        person.setAge(19);
        System.out.println("This is a test for getName method: " + person.getName());
        System.out.println("This is a test for getAge method: " + person.getAge());
        System.out.println("This is display method: ");
        person.display();
        System.out.println("This is isAdult method: ");
        person.isAdult();
    }
}

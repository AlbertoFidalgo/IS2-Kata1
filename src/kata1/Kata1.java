package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Alberto", new Date(101,11,11));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}

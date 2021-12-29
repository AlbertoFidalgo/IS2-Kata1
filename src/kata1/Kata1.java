package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        
        LocalDate date;
        date = LocalDate.of(1900, 11, 11);
        
        Person person = new Person("Alberto", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
    
}

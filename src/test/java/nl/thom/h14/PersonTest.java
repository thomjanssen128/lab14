package nl.thom.h14;


import nl.thom.h14.person.Human;
import nl.thom.h14.person.Person;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void personTest() {
        Person p1 = new Person("Jan", 45);

        p1.printHistory();

        p1.addHistory("Born");
        p1.addHistory("Went to school");
        p1.addHistory("Got a job");
        p1.addHistory("Got married");

        p1.printHistory();

        Human subHuman = p1.createSubHuman();
        String greet = subHuman.greet();
        System.out.println(greet);
    }
}
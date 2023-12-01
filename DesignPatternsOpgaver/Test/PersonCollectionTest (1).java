import Iterator.Person;
import Iterator.PersonCollection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class PersonCollectionTest {

    @Test
    void test_Iterator_next_returnsNext() {

        // Arrange
        PersonCollection personCollection = new PersonCollection();
        Person p1 = new Person("Anne");
        Person p2 = new Person("Bente");
        Person p3 = new Person("Caroline");
        personCollection.add(p1);
        personCollection.add(p2);
        personCollection.add(p3);
        Iterator iterator = personCollection.iterator();

        // Act & Assert
        assertEquals(p1, iterator.next());
        assertEquals(p2, iterator.next());
        assertEquals(p3, iterator.next());
    }

    @Test
    void test_Iterator_next_throwsException() {

        // Arrange
        PersonCollection personCollection = new PersonCollection();
        Person p1 = new Person("Anne");
        Person p2 = new Person("Bente");
        Person p3 = new Person("Caroline");
        personCollection.add(p1);
        personCollection.add(p2);
        Iterator iterator = personCollection.iterator();

        // Act & Assert
        iterator.next();
        personCollection.add(p3);
        assertThrows(ConcurrentModificationException.class, () -> {
            iterator.next();
        });
    }

    @Test
    void test_Iterator_hasNext_returnsTrueFalse() {

        // Arrange
        PersonCollection personCollection = new PersonCollection();
        Person p1 = new Person("Anne");
        Person p2 = new Person("Bente");
        Person p3 = new Person("Caroline");
        personCollection.add(p1);
        personCollection.add(p2);
        personCollection.add(p3);
        Iterator iterator = personCollection.iterator();

        // Act & Assert
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertTrue(iterator.hasNext());
        iterator.next();
        assertFalse(iterator.hasNext());
    }
}
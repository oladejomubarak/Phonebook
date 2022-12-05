package phoneBookTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import phoneBook.PhoneMemory;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class PhoneMemoryTest {
        private PhoneMemory phoneMemory;
        @BeforeEach
        void DoThisFirst(){
            phoneMemory = new PhoneMemory("Lakes" , "0803 673 8735");
        }
        @Test
        void testThatWeCanFindContactByName(){
            assertEquals("0803 673 8735", phoneMemory.findContactByName("Lakes"));
        }
        @Test
        void testThatWeCanFindContactByPhoneNumber(){
            assertEquals("Lakes", phoneMemory.findContactByPhoneNumber("0803 673 8735"));
        }
    }


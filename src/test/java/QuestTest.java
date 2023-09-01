import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import quest.model.Quest;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestTest {

    @Test
    public void TestConstructor() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        String expected = "1";
        String actual = quest.getCurrentState().getLabel();
        assertEquals(expected, actual);
    }

    @Test
    public void testStart() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.start();
        int expected = 1;
        int actual = quest.getLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetUser() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.setUser("Name");
        String expected = "Name";
        String actual = quest.getUser();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetIpAddress() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.setIpAddress("192.168.0.23");
        String expected = "192.168.0.23";
        String actual = quest.getIpAddress();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberGame() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.setNumberGames(3);
        int expected = 3;
        int actual = quest.getNumberGames();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLevel() throws JAXBException, FileNotFoundException {
        Quest quest = new Quest();
        quest.setLevel(4);
        int expected = 4;
        int actual = quest.getLevel();
        assertEquals(expected, actual);
    }
}

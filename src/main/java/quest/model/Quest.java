package quest.model;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import quest.model.XMLmodel.QuestXML;
import quest.model.XMLmodel.StateXML;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;

public class Quest {
    private State currentState;
    private State initState;
    private String user;
    private String ipAddress;
    private int numberGames;
    private int level;
    private QuestXML questXML;

    public Quest() throws JAXBException, FileNotFoundException {
        questXML = readXML(String.valueOf(getClass().getClassLoader().getResource("quest_xml.xml")));//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        initState = init(questXML);
        start();
    }

    private QuestXML readXML(String xml) throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(QuestXML.class);
    return (QuestXML) context.createUnmarshaller()
      .unmarshal(new FileReader(xml));
    }

    private State init(QuestXML questXML) {
        HashMap<String, State> stateMap = new HashMap<>();

        for (StateXML stateXML: questXML.getStates()) {
            stateMap.put(stateXML.getLabel(), new State(stateXML.getLabel()));
        }

        for (StateXML stateXML: questXML.getStates()) {
            State modelState = stateMap.get(stateXML.getLabel());
            modelState.setNextStates(stateMap.get(stateXML.getStateOne()), stateMap.get(stateXML.getStateTwo()));
        }

        return stateMap.get(questXML.getInitState());
    }

//    private State init() {
////        Locale locale = new Locale("en", "US");
////        ResourceBundle rb = ResourceBundle.getBundle("text");
//        State state1 = new State("1");
//        State state2 = new State("2");
//        State state3 = new State("3");
//        State win = new State("Win");
//        State fail = new State("Fail");
//        state1.setNextStates(state2, fail);
//        state2.setNextStates(state3, fail);
//        state3.setNextStates(win, fail);
//        numberGames = 1;
//
//        return state1;
//    }

    public void start() {
        currentState = initState;
        level = 1;
    }


    public void setNextState(String answer) {
        currentState = currentState.nextState(answer);
    }

    public State getCurrentState() {
        return currentState;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getNumberGames() {
        return numberGames;
    }

    public void setNumberGames(int numberGames) {
        this.numberGames = numberGames;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

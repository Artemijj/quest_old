package quest.model.XMLmodel;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import quest.model.State;

import java.util.ArrayList;

@XmlRootElement(name = "quest")

public class QuestXML {
    @XmlAttribute(name = "init")
    private String initState;
    @XmlElement //!!!!!!!!!!!!!!!!!!!
    private ArrayList<StateXML> states;

    public QuestXML() {

    }

    public QuestXML(String initState, ArrayList<StateXML> states) {
        this.initState = initState;
        this.states = states;
    }

    public String getInitState() {
        return initState;
    }

    public ArrayList<StateXML> getStates() {
        return states;
    }
}

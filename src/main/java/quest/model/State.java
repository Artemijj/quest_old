package quest.model;

import java.util.ResourceBundle;

public class State {
    private ResourceBundle rb;
    private String label;
    private State stateOne;
    private State stateTwo;

    public State(ResourceBundle rb, String label) {
        this.rb = rb;
        this.label = label;
    }

    public void setNextStates(State stateOne, State stateTwo) {
        this.stateOne = stateOne;
        this.stateTwo = stateTwo;
    }

    public State nextState(String answer) {
        State next = null;
        if (answer.equals("one")) {
            next = stateOne;
        } else if (answer.equals("two")) {
            next = stateTwo;
        }
        return next;
    }

    public String getLabel() {
        return label;
    }
}

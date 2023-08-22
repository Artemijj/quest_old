package quest.model;

public class State {
    private Quest quest;
    private String label;
    private State stateOne;
    private State stateTwo;
    public State(Quest quest) {
        this.quest = quest;
    }

    public State(Quest quest, String label) {
        this.quest = quest;
        this.label = label;
    }

    public void setNextStates(State stateOne, State stateTwo) {
        this.stateOne = stateOne;
        this.stateTwo = stateTwo;
    }

    public State nextState(String answer) {
        State next = null;
        if (answer.equals("one")) {
            next = getStateOne();
        } else if (answer.equals("two")) {
            next = getStateTwo();
        }
        return next;
    }

    public String getLabel() {
        return label;
    }
    public State getStateOne(){
        return stateOne;
    }
    public State getStateTwo() {
        return stateTwo;
    }
}

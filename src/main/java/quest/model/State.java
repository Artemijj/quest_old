package quest.model;

public class State {
    private Quest quest;
    private String message;
    private State stateOne;
    private State stateTwo;
    public State(Quest quest) {
        this.quest = quest;
    }

    public State(Quest quest, String message) {
        this.quest = quest;
        this.message = message;
    }

    public void setNextStates(State stateOne, State stateTwo) {
        this.stateOne = stateOne;
        this.stateTwo = stateTwo;
    }

    public String getMessage() {
        return message;
    }
    public State getStateOne(){
        return stateOne;
    }
    public State getStateTwo() {
        return stateTwo;
    }
}

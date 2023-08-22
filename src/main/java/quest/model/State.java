package quest.model;

public class State {
    private Quest quest;
    private String question;
    private String answerOne;
    private String answerTwo;
    private String message;
    private State stateOne;
    private State stateTwo;
    public State(Quest quest) {
        this.quest = quest;
//        this.question = question;
//        this.answerOne = answerOne;
//        this.answerTwo = answerTwo;
    }

    public State(Quest quest, String message) {
        this.quest = quest;
        this.message = message;
    }

    public void setNextStates(State stateOne, State stateTwo) {
//        if (getMessage() != null) {
//            return;
//        }
//        if (answer.equals(answerOne)) {
//            quest.setState(stateOne);
//        } else if (answer.equals(answerTwo)) {
//            quest.setState(stateTwo);
//        }
        this.stateOne = stateOne;
        this.stateTwo = stateTwo;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
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

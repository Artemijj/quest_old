package quest.model;

public class State {
    private Quest quest;
    private String question;
    private String answerOne;
    private String answerTwo;
    private String message;
    public State(Quest quest, String question, String answerOne, String answerTwo) {
        this.quest = quest;
        this.question = question;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
    }

    public State(Quest quest, String message) {
        this.quest = quest;
        this.message = message;
    }

    public void setNextState(State stateOne, State stateTwo, String answer) {
        if (getMessage() != null) {
            return;
        }
        if (answer.equals(answerOne)) {
            quest.setState(stateOne);
        } else if (answer.equals(answerTwo)) {
            quest.setState(stateTwo);
        }
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
}

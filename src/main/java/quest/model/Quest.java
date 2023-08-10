package quest.model;

public class Quest {
    private State state;
    private State firstState;
    private State secondState;
    private State thirdState;
    private State wrongState;
    private State winState;

    public Quest() {
        firstState = new FirstState(this);
        secondState = new SecondState(this);
        thirdState = new ThirdState(this);
        wrongState = new WrongState(this);
        winState = new WinState(this);
        state = firstState;
    }

    public void setState(State s) {
        this.state = s;
    }

    public State getState() {
        return state;
    }

    public State getFirstState() {
        return firstState;
    }

    public State getSecondState() {
        return secondState;
    }

    public State getThirdState() {
        return thirdState;
    }

    public State getWrongState() {
        return wrongState;
    }

    public State getWinState() {
        return winState;
    }
}

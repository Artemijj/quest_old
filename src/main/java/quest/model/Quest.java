package quest.model;

import java.util.Locale;
import java.util.ResourceBundle;

public class Quest {
    private State currentState;
    private State initState;
    private String user;
    private String ipAddress;
    private int numberGames;
    private int level;

    public Quest() {
        init();
        start();
    }

    private void init() {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("text");
        State state1 = new State(rb, "1");
        State state2 = new State(rb, "2");
        State state3 = new State(rb, "3");
        State win = new State(rb, "Win");
        State fail = new State(rb, "Fail");
        state1.setNextStates(state2, fail);
        state2.setNextStates(state3, fail);
        state3.setNextStates(win, fail);
        currentState = initState = state1;
        numberGames = 1;
    }

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

package quest.model;

import java.util.Locale;
import java.util.ResourceBundle;

public class Quest {
    private State state;
    private String user;
    private String ipAddress;
    private int numberGames;
    private String answer;
    private int level;
    private State state1;
    private State state2;
    private State state3;
    private State win;
    private State fail;

    public Quest() {
        init();
    }

    private void init() {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("text");
        state1 = new State(this, rb.getString("question1"), rb.getString("answerOne1"), rb.getString("answerTwo1"));
        state2 = new State(this, rb.getString("question2"), rb.getString("answerOne2"), rb.getString("answerTwo2"));
        state3 = new State(this, rb.getString("question3"), rb.getString("answerOne3"), rb.getString("answerTwo3"));
        win = new State(this, rb.getString("messageWin"));
        fail = new State(this, rb.getString("messageFail"));
        state = state1;
        level = 1;
        numberGames = 1;
    }

    public void setState(State s) {
        this.state = s;
    }

    public State getState() {
        return state;
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

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public State getState(int i) {
        State st = null;
        switch (i) {
            case 1:
                st = state1;
                break;
            case 2:
                st = state2;
                break;
            case 3:
                st = state3;
                break;
            case 4:
                st = win;
                break;
            case -1:
                st = fail;
                break;
        }
        return st;
    }
}

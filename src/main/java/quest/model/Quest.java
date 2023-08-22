package quest.model;

import java.util.ArrayList;
import java.util.List;
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
    private List<String> questions;
    private List<String> answersOne;
    private List<String> answersTwo;

    public Quest() {
        init();
        loadLists();
        levelStart();
    }

    private void init() {
//        Locale locale = new Locale("en", "US");
//        ResourceBundle rb = ResourceBundle.getBundle("text");
        state1 = new State(this);
        state2 = new State(this);
        state3 = new State(this);
        win = new State(this, "win");
        fail = new State(this, "fail");
        state1.setNextStates(state2, fail);
        state2.setNextStates(state3, fail);
        state3.setNextStates(win, fail);
        numberGames = 1;
    }

    private void loadLists() {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("text");
        questions = new ArrayList<>();
        questions.add(rb.getString("question1"));
        questions.add(rb.getString("question2"));
        questions.add(rb.getString("question3"));

        answersOne = new ArrayList<>();
        answersOne.add(rb.getString("answerOne1"));
        answersOne.add(rb.getString("answerOne2"));
        answersOne.add(rb.getString("answerOne3"));

        answersTwo = new ArrayList<>();
        answersTwo.add(rb.getString("answerTwo1"));
        answersTwo.add(rb.getString("answerTwo2"));
        answersTwo.add(rb.getString("answerTwo3"));
    }

    public void levelStart() {
        state = state1;
        level = 1;
    }

    public void setNextState(State st, String answer) {
        if (answer.equals("one")) {
            state = st.getStateOne();
        } else if (answer.equals("two")) {
            state = st.getStateTwo();
        }
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

    public String getQuestion(int i) {
        return questions.get(i);
    }

    public String getAnswerOne(int i) {
        return answersOne.get(i);
    }

    public String getAnswerTwo(int i) {
        return answersTwo.get(i);
    }
}

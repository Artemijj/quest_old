package quest.model;

public class Quest {
    private IState IState;
//    private IState firstIState;
//    private IState secondIState;
//    private IState thirdIState;
    private IState wrongIState;
//    private IState winIState;
    private String user;
    private String ipAddress;
    private int numberGames;

    public Quest() {
//        firstIState = new FirstIState(this);
//        secondIState = new SecondIState(this);
//        thirdIState = new ThirdIState(this);
        wrongIState = new WrongIState(this);
//        winIState = new WinIState(this);
//        IState = firstIState;
    }

    public void setState(IState s) {
        this.IState = s;
    }

    public IState getState() {
        return IState;
    }

//    public IState getFirstState() {
//        return firstIState;
//    }
//
//    public IState getSecondState() {
//        return secondIState;
//    }
//
//    public IState getThirdState() {
//        return thirdIState;
//    }

    public IState getWrongState() {
        return wrongIState;
    }

//    public IState getWinState() {
//        return winIState;
//    }

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
}

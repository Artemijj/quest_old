package quest.model;

public class WrongIState implements IState {
    private Quest quest;
    public WrongIState(Quest quest) {
        this.quest = quest;
    }
    @Override
    public void step(String reply) {
    }

    public void goToStart() {
        quest.setState(quest.getFirstState());
    }
}

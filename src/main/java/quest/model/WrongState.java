package quest.model;

import quest.model.Quest;

public class WrongState implements State {
    private Quest quest;
    public WrongState(Quest quest) {
        this.quest = quest;
    }
    @Override
    public void step(String reply) {
    }

    public void goToStart() {
        quest.setState(quest.getFirstState());
    }
}

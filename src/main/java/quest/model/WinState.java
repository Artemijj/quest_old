package quest.model;

import quest.model.Quest;

public class WinState implements State {
    private Quest quest;
    public WinState(Quest quest) {
        this.quest = quest;
    }
    @Override
    public void step(String reply) {
    }

    public void goToStart() {
        quest.setState(quest.getFirstState());
    }
}

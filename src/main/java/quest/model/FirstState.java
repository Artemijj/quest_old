package quest.model;

import quest.model.Quest;

public class FirstState implements State {
    private Quest quest;
    public FirstState(Quest quest) {
        this.quest = quest;
    }
    @Override
    public void step(String reply) {
        if (reply.equals("YES")) {
            quest.setState(quest.getSecondState());
        } else if (reply.equals("NO")) {
            quest.setState(quest.getWrongState());
        }
    }
}

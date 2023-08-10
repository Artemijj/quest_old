package quest.model;

import quest.model.Quest;

public class SecondState implements State {
    private Quest quest;
    public SecondState(Quest quest) {
        this.quest = quest;
    }
    @Override
    public void step(String reply) {
        if (reply.equals("YES")) {
            quest.setState(quest.getThirdState());
        } else if (reply.equals("NO")) {
            quest.setState(quest.getWrongState());
        }
    }
}

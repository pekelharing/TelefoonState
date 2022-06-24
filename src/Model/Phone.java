package Model;

import State.State;
import State.OffState;

public class Phone {

    private State state;


    public Phone() {
        this.state = new OffState(this);
    }

    public void doPress(){
        state.doPress();
    }

    public void setState(State state) {
        this.state = state;
    }
}

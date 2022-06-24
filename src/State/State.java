package State;

import Model.Phone;

public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    //TODO implementeer de doPress() methode in de drie states

    public abstract String doPress();
    public abstract String onLock();
    public abstract String onReady();
    public abstract String onOff();
}

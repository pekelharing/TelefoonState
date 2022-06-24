package State;

import Model.Phone;

public class ReadyState extends State {


    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onLock() {
        phone.setState(new LockedState(phone));
        return "locked";
    }

    @Override
    public String onReady() {
        String action = phone.doPress();
        phone.setState(new ReadyState(phone));
        return action;
    }
    @Override
    public String doPress() {

        return null;
    }
}

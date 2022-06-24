package State;

import Model.Phone;

public class LockedState extends State {
    LockedState(Phone phone) {
        super(phone);
        phone.setState(false);
    }

    @Override
    public String doPress() {

        return null;
    }

    @Override
    public String onLock() {
        if (phone.isState()) {
            phone.setState(new ReadyState(phone));
            return "stop playing?";
       } else {
            return "locked";
        }
    }

    @Override
    public String onReady() {
        phone.setState(new ReadyState(phone));
        return "ready";
    }

    @Override
    public String onOff() {
        return "off";
    }
}

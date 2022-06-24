package State;

import Model.Phone;

public class OffState extends State {

    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String doPress() {
        phone.setState(new LockedState(phone));
        return "phone locked";
    }

    @Override
    public String onOff() {
        return phone.setState();
    }
}

package CommandPattern;

import FactoryPattern.Toys;

public class needDoll implements Command {

    private Toys doll;

    public needDoll(Toys doll){
        this.doll = doll;
    }

    @Override
    public void ApplyCommand() {
            this.doll.DollDelivery();
    }
}

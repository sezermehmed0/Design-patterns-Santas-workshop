package CommandPattern;

import FactoryPattern.Toys;

public class needBike implements Command{

    private Toys bike ;

    public needBike(Toys bike){
        this.bike = bike;

    }

    @Override
    public void ApplyCommand() {
        this.bike.BikeDelivery();

    }
}

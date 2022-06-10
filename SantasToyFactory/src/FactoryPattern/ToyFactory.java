package FactoryPattern;

public  class ToyFactory  extends WorkShop {

    @Override
    public Product getWantedToy(String ToyName) {
        if (ToyName.equalsIgnoreCase("Doll")) {
            return new Doll();
        }
        if (ToyName.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        System.out.println("We don't have that kind of toy this year,hohoho");

        return null;
    }
}

package FactoryPattern;

public abstract class WorkShop {
    /**
     * @param ToyName;
     */
    public abstract Product getWantedToy(String ToyName);


    /**
     * @param ToyName;
     * @return toyProduct
     */
    public Product MakeToyReady(String ToyName){
        Product toyProduct = getWantedToy(ToyName);
        toyProduct.ToyDelivery();
        return toyProduct;
    }
}

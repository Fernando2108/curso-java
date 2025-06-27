package containers;
import java.util.Set;

import java.util.set;
import products.IProduct;



public class IContainer {

    // Getters

    String getReference();
    int getVolume();
    int getSurface();
    // int getResistance();
    ContainerType getype();
    Set<IProduct> getProducts();

    // logica de negocio

    int volumeDisposable();

    boolean canInsert(IProduct product);
    boolean isResistantTo(IProduct product);

}

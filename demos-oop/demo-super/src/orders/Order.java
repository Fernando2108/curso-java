package orders;

import java.util.Set;

import containers.IContainer;

public class Order implements IOrder {

    @Override
    public void addContainer(Icontainer container) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public IContainer addProduct(IProduct product) {

      for (IContainer container : containers){  
        if (container.canInsert(product)) {
        //container. getProducts().add(product);
        product.putInto(container);
        return container;
        }
    }
    return null;
 }

    @Override
    public Set<IContainers> getContainers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<IPiroduct> getProducts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getReference() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
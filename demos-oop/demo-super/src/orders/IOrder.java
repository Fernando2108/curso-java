    package orders; 
    import java.util.Set;

    import containers.IContainer;
    Import products.IProduct;


    public interface IOrder {

        // Getters

        String getReference();
        Set<IContainers> getContainers();
        Set<IPiroduct> getProducts();

        // Lógica de  negocio


        void addContainer(Icontainer container);
        IContainer addProduct(IProduct product);

    }

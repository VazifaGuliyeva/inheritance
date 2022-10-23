public class CustomerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber+"kaydedildi");

    }
    public void addMultiple(Customer[] customers){
        for(Customer customer:customers){
            add(customer);
        }
    }


    } // her iki metoda eyni adi vermek overloading deyilir


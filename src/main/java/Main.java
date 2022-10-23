public class Main {
    public static void main(String []args){
        IndividualCustomer engin=new IndividualCustomer();
        engin.customerNumber="123345";

        CorporateCustomer hepsiBurada=new CorporateCustomer();
        hepsiBurada.customerNumber="456789";

        CustomerManager customerManager=new CustomerManager();

        SendikaCustomer abc=new SendikaCustomer();
        abc.customerNumber="9999";

        Customer[] customers= {engin,abc,hepsiBurada};

        customerManager.addMultiple(customers);


    }
}

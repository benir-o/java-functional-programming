package Functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria= new Customer("Maria","99999");
        greetCustomer(maria);
        //Consumer Functional Interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria,false);

    }
    static Consumer<Customer> greetCustomerConsumer= customer->System.out.println("Hello "
            +customer.customerName
            +", Thanks for registering phone Number: "
            +customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2= (customer,showPhoneNumber)->System.out.println("Hello "
            +customer.customerName
            +", Thanks for registering phone Number: "
            +(showPhoneNumber? customer.customerPhoneNumber :"*******"));



    static void greetCustomer(Customer customer){
        System.out.println("Hello "
                +customer.customerName
                +", Thanks for registering phone Number: "
                +customer.customerPhoneNumber);
    }
    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

public class Customer {
    public Customer(String name, String lastName, CreditCard creditCard) {
        this(name, lastName, (int)(Math.random() * 100), creditCard);
    }

    public Customer(String name, String lastName, int customerNumber,  CreditCard creditCard) {
        this.name = name;
        this.customerNumber = customerNumber;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }

    public static String name;
    public static String lastName;
    public static int customerNumber;
    private static CreditCard creditCard;

    public static CreditCard getCreditCard() {
        return creditCard;
    }

    public static void setCreditCard(CreditCard creditcard) {
        Customer.creditCard = creditcard;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Customer.name = name;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        Customer.lastName = lastName;
    }

    public static int getCustomerNumber() {
        return customerNumber;
    }

    public static void setCustomerNumber(int customerNumber) {
        Customer.customerNumber = customerNumber;
    }

    public static void printName() {
        System.out.println("Customer " + name);
    }
}

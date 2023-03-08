public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Frodo", "Balings", new VisaCard(100));
        customer.getCreditCard().pay(10);
        System.out.println(customer.getCreditCard().getDebt());

        Customer customer2 = new Customer("Samwise", "Gamgee", new MasterCard(20));

    }
}

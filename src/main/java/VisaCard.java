public class VisaCard extends CreditCard {
    public VisaCard(int debt) {
        super(debt);
    }

    @Override
    public void pay(int amount) {
        amount = (int) (amount * 0.9);
        super.pay(amount);
    }
}

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person owner, Money limit) {
        this.owner = owner;
        this.creditLimit = new Money(limit); // copy
        this.balance = new Money(0.0);
        
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        Money temp = new Money(balance);
        temp.add(amount);
        if (temp.compareTo(creditLimit) <= 0) {
            balance.add(amount);
            System.out.println("Charge: " + amount);
        }
        else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}

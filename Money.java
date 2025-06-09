public class Money {
    private long cents;

    public Money(double amount) {
        this.cents = Math.round(amount * 100);
    }

    public Money(Money other) {
        this.cents = other.cents;
    }

    public void add(Money other) {
        this.cents += other.cents;
    }

    public void subtract(Money other) {
        this.cents -= other.cents;
    }

    public int compareTo(Money other) {
        return Long.compare(this.cents, other.cents);
    }

    public boolean equals(Money other) {
        return this.cents == other.cents;
    }

    public String toString() {
        return String.format("$%.2f", cents / 100.0);
    }
}

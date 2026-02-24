class Billing implements Billable {

    private double amount;

    Billing(double amount) {
        this.amount = amount;
    }

    @Override
    public void showBill() {
        System.out.println("Total Bill Amount: " + amount);
    }
}

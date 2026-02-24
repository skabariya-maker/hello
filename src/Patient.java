class Patient extends Person implements Schedulable {

    private int roomNo;

    Patient(String name, int roomNo) {
        super(name);
        this.roomNo = roomNo;
    }

    @Override
    public void schedule() {
        System.out.println("Appointment scheduled for " + getName());
    }

    public void showDetails() {
        System.out.println("Patient: " + getName() + ", Room: " + roomNo);
    }
}
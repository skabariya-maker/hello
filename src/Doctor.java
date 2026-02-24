class Doctor extends Staff {

    Doctor(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Dr. " + getName() + " is treating patients.");
    }
}
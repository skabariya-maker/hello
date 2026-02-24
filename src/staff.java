abstract class Staff extends Person {

    Staff(String name) {
        super(name);  // using super
    }

    abstract void work();   // must be overridden
}
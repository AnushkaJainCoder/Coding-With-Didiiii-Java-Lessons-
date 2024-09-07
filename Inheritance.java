

class Person {
    int eyes;
    int nose;

    Person() {
        this.eyes = 2;
        this.nose = 1;
    }

    boolean behavior() {
        boolean rude = false;
        boolean emotional = true;
        return rude;
    }
}

class Male extends Person {

    // Method overriding
    
    boolean behavior() {
        boolean rude = true;
        boolean emotional = false;
        return rude;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Male m = new Male();
        // Call the overridden behavior method
        System.out.println("The person is rude: true/false => " + m.behavior());
    }
}
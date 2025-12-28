
class accessModifiersExample {
    private void privateMethod() {
        System.out.println("Private Method - Accessible only within the same class");
    }

    void defaultMethod() {
        System.out.println("Default Method - Accessible within the same package");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method - Accessible in the same package and in subclasses");
    }

    public void publicMethod() {
        System.out.println("Public Method - Accessible everywhere");
    }

    public final void finalMethod() {
        System.out.println("Final Method - $Cannot be overridden in a subclass");
    }

    public static void staticMethod() {
        System.out.println("Static Method - *[Parent]Cannot be overridden in a subclass");
    }

}

class SubClass extends accessModifiersExample {

    @Override
    protected void protectedMethod() {
        System.out.println("Overridden Protected Method - Access modifier expanded to public");
    }

    @Override
    protected void defaultMethod() {
        System.out.println("Overridden Default Method - Access modifier expanded to public");
    }

    ////Attempting to override the final method will cause a compile-time error
    // @Override
    // public void finalMethod() {
    //    System.out.println("This will cause a compile-time error because final methods cannot be overridden");
    // }

    public static void staticMethod() {
        System.out.println("Hiding the static method - This is not true overriding");
    }
}


class SamePackage {
    void testAccessModifiers() {
        accessModifiersExample obj = new accessModifiersExample();

        // obj.privateMethod(); // Compile-time error: Not accessible outside the class
        obj.defaultMethod();   // Accessible in the same package
        obj.protectedMethod(); // Accessible in the same package
        obj.publicMethod();    // Accessible everywhere
    }
}


public class accessModifiers{

    public void staticMethodII(){System.out.println("See, it works!");}

    public static void main(String[] args) {
        accessModifiersExample obj = new accessModifiersExample();
        // obj.privateMethod(); // can not access this...
        // obj.defaultMethod();
        // obj.protectedMethod();
        // obj.publicMethod();
        // obj.defaultMethod();
        // obj.staticMethod();
        // obj.finalMethod();

        SubClass sb = new SubClass();
        sb.defaultMethod();
        sb.protectedMethod();
        sb.publicMethod();
        // sb.privateMethod();
        sb.staticMethod();
        sb.finalMethod();

        // pkg: collection of classes and interfaces
    }
}

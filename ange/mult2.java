class multip2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
    }
}
class Parent1 {
    void method1(){
        System.out.println("Method1 implementation");
    }
}

class Parent2 {
    void method2(){
        System.out.println("Method2 implementation");
    }
}

class Child {
    private Parent1 parent1 = new Parent1();
    private Parent2 parent2 = new Parent2();

    void method1(){
        parent1.method1();
    }
    void method2(){
        parent2.method2();
    }
}




 class juno {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw(); // Inherited from Shape
        myCircle.drawCircle();
    }
}class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle");
    }
}


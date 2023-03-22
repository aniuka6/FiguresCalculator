 class Square implements Shape {
     private double a;

     public Square(double a) {
         this.a = a;
     }

     public double getA() {
         return a;
     }

     public void setA(double a) {
         this.a = a;
     }

     @Override
     public double calculateArea() {
         return a * a;
     }

     @Override
     public double calculatePerimeter() {
         return 4 * a;
     }

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append("Kwadrat:");
         sb.append("bok A:" + a + ",");
         sb.append("pole:" + calculateArea() + ",");
         sb.append("obwód:" + calculatePerimeter());
         return sb.toString();
     }
 }

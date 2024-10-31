package Z1ClassesInternas.test;

public class OuterClassTest03 {
  private String name = "Igor";
 static class Nested {
      private String lasteName = "Castelo";
      void print() {
          System.out.println(new OuterClassTest03().name + " " + lasteName);
      }
  }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
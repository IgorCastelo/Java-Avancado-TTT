package Z1ClassesInternas.test;
class Animal{
    public void walk() {
        System.out.println("Animal walking");
    }
}
public class AnoymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Walking in the Shadows");
            }
        } ;
        animal.walk();
    }
}
package Z1ClassesInternas.test;

public class OuterClassTest02 {
    private String name = "Midoriya";
    void print() {
        String lastName = " Izuku"; // deve ser efetivamente final, nao pode ser alterada
        class LocalClass {// modificadores Abstract ou finall podem ser usados
            public void printLocal() {
                System.out.println(name + " " + lastName);
            }
        }
        /*LocalClass localClass = new LocalClass();
        localClass.printLocal();*/
        new LocalClass().printLocal();// em uma linha só
    }

    public static void main(String[] args) {

        OuterClassTest02 outer = new OuterClassTest02();
        outer.print();
    }
}
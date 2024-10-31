package Z1ClassesInternas.test;

public class OuterClassTest01 {
    private String name = " Monkey D. Ruffy";
    private int age = 16;
    class InnerClass{
        private void printOuterClassAtribute(){
            System.out.println(name);
            System.out.println(this);//this da classe interna
            System.out.println(OuterClassTest01.this);// this da classe primeira camada
        }private void printOuterClassAtribute2(){
            System.out.println(age + " anos");
        }

    }
    public static void main(String[] args) {
    OuterClassTest01 outerClass = new OuterClassTest01(); //instancia a primeira camada
     InnerClass innerClass = outerClass.new InnerClass();//chama a segunda camada apartir da primeira
     InnerClass innerClass2 = new OuterClassTest01().new InnerClass();
        innerClass.printOuterClassAtribute();//chaama o atributo que mostra a primeira camada
        innerClass2.printOuterClassAtribute2();
    }
}

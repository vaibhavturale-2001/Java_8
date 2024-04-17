package Lamda_Expression;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application Started.......");

        MyInter myInter=new MyInterImpl();
        myInter.hello();

  /*      MyInter i=new MyInter() {
            @Override
            public void hello() {
                System.out.println("This is first anonymous class");
            }
        };
        i.hello();*/

       // MyInter i=() -> System.out.println("I am using first time Lambda");  OR below

        MyInter i=() ->{
            System.out.println("I am using first time Lambda");
        };

        i.hello();
    }
}

package Lab_5;


public class Mobile5 extends Warning{

    public Mobile4 mobile4;

    public Mobile5(Mobile4 mobile4) {
        this.mobile4=mobile4;
    }

    @Override
    public void warning() {
        System.out.println("Увага розбили смартфон, зафіксуйте це!");
    }
}

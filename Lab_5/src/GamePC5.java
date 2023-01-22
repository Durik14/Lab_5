package Lab_5;



public class GamePC5 extends Warning {

    public GamePC4 gamePC4;

    public GamePC5(GamePC4 gamePC4) {
        this.gamePC4 = gamePC4;
    }


    @Override
    public void warning() {
        System.out.println("Стара версія ігри уже недоступна\n    Зявився новий товар!");
    }
}

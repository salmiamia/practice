package October2021.DrinkMaker;

public class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем молоко с пенкой");
    }

    @Override
    void pour() {
        System.out.println("Заливаем кофе");
    }
}

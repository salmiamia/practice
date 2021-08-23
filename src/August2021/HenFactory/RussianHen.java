package August2021.HenFactory;

public class RussianHen extends Hen {

    int CountOfEggsPerMonth = 25;

    int getCountOfEggsPerMonth() {
        return CountOfEggsPerMonth;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + CountOfEggsPerMonth + " яиц в месяц.";
    }
}

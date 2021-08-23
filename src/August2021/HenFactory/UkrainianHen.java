package August2021.HenFactory;

public class UkrainianHen extends Hen {

    int CountOfEggsPerMonth = 18;

    int getCountOfEggsPerMonth() {
        return CountOfEggsPerMonth;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + CountOfEggsPerMonth + " яиц в месяц.";
    }
}

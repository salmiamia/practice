package August2021.HenFactory;

public class BelarusianHen extends Hen {

    int CountOfEggsPerMonth = 22;

    int getCountOfEggsPerMonth() {
        return CountOfEggsPerMonth;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + com.javarush.task.task14.task1408.Country.BELARUS + ". Я несу " + CountOfEggsPerMonth + " яиц в месяц.";
    }

}

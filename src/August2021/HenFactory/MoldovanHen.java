package August2021.HenFactory;

public class MoldovanHen extends Hen {

    int CountOfEggsPerMonth = 20;

    int getCountOfEggsPerMonth() {
        return CountOfEggsPerMonth;
    }

    String getDescription() {
        return super.getDescription() + " Моя страна - " + com.javarush.task.task14.task1408.Country.MOLDOVA + ". Я несу " + CountOfEggsPerMonth + " яиц в месяц.";
    }
}

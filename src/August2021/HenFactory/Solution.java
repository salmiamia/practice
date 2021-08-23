package August2021.HenFactory;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        com.javarush.task.task14.task1408.Hen hen = HenFactory.getHen(com.javarush.task.task14.task1408.Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static com.javarush.task.task14.task1408.Hen getHen(String country) {
            com.javarush.task.task14.task1408.Hen hen = null;
            switch(country)
            {
                case "Belarus": hen = new com.javarush.task.task14.task1408.BelarusianHen(); break;
                case "Russia": hen = new com.javarush.task.task14.task1408.RussianHen(); break;
                case "Ukraine": hen = new com.javarush.task.task14.task1408.UkrainianHen(); break;
                case "Moldova": hen = new com.javarush.task.task14.task1408.MoldovanHen(); break;
            }
            return hen;
        }
    }
}
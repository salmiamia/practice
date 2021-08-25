package August2021.HenFactory;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch(country)
            {
                case "Belarus": hen = new BelarusianHen(); break;
                case "Russia": hen = new RussianHen(); break;
                case "Ukraine": hen = new UkrainianHen(); break;
                case "Moldova": hen = new MoldovanHen(); break;
            }
            return hen;
        }
    }
}
package August2021;

public class TypeCasting_04 {

    static class Animal
    {
        public void doAnimalActions(){}
    }
    static class Cat extends Animal
    {
        public void doCatActions(){}
    }
    static class Tiger extends Cat
    {
        public void doTigerActions(){}
    }

    public static void main(String[] args)
    {
        Animal animal = new Tiger();
        doAllAction(animal);

        Animal animal2 = new Cat();
        doAllAction(animal2);

        Animal animal3 = new Animal();
        doAllAction(animal3);
    }

    public static void doAllAction(Animal animal)
    {
        if (animal instanceof Tiger)
        {
            Tiger tiger = (Tiger) animal;
            tiger.doTigerActions();
        }

        if (animal instanceof Cat)
        {
            Cat cat = (Cat) animal;
            cat.doCatActions();
        }

        animal.doAnimalActions();
    }
}

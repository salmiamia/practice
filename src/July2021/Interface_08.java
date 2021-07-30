package July2021;

public class Interface_08 {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> //допишите здесь ваш код
    {
        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
}

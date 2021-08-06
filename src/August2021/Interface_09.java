package August2021;

public class Interface_09 {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    static class StringObject implements SimpleObject<String>{

        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }
}

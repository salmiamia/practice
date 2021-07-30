package July2021;

public class Interface_04 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Class implements Businessman{

    }

    public static class Class {
        public void workHard(){

        }
    }
}

package July2021;

import java.io.IOException;
import java.rmi.RemoteException;

public class Exception_09 {
    public static void main(String[] args) {
        handleExceptions(new Exception_09());

    }

    public static void handleExceptions(Exception_09 obj) {
        try
        {
            obj.method1();
            obj.method2();
            obj.method3();
        }
        catch (RemoteException e)
        {
            System.out.println("RemoteException exception has been caught.");
        }
        catch (IOException e)
        {
            System.out.println("IOException exception has been caught.");
        }
        catch (NoSuchFieldException e)
        {
            System.out.println("NoSuchFieldException exception has been caught.");
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}

package March2022.Threads_12;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static com.javarush.task.task16.task1631.common.ImageReader getImageReader(com.javarush.task.task16.task1631.common.ImageTypes a) {
        if(a == com.javarush.task.task16.task1631.common.ImageTypes.JPG) return new com.javarush.task.task16.task1631.common.JpgReader();
        else if(a == com.javarush.task.task16.task1631.common.ImageTypes.BMP) return new com.javarush.task.task16.task1631.common.BmpReader();
        else if(a == com.javarush.task.task16.task1631.common.ImageTypes.PNG) return new com.javarush.task.task16.task1631.common.PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}

package March2022.Threads_12;


public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes a) {
        if(a == ImageTypes.JPG) return new JpgReader();
        else if(a == ImageTypes.BMP) return new BmpReader();
        else if(a == ImageTypes.PNG) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}

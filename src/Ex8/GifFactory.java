package Ex8;

public class GifFactory extends  Factory{
    @Override
    public ImageReader GetView() {
        return new GifReader();
    }
}

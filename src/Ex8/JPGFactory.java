package Ex8;

public class JPGFactory extends Factory{
    @Override
    public ImageReader GetView() {
        return new JPGReader();
    }
}

package pl.wojciechsiwek;

public class SampleBlock implements Block {
    private String color;
    private String material;

    public SampleBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "SampleBlock{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

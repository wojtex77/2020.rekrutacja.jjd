package pl.wojciechsiwek;

public class Main {

    public static void main(String[] args) {
        Structure wall = new Wall();
        wall.addBlock(new SampleBlock("red", "clay"));
        wall.addBlock(new SampleBlock("blue", "clay"));
        wall.addBlock(new SampleBlock("green", "steel"));

        System.out.println(wall.findBlockByColor("red"));
        System.out.println(wall.findBlocksByMaterial("clay"));
        System.out.println(wall.count());
    }
}

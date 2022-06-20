package pl.wojciechsiwek;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Wall implements Structure {
    private List blocks;

    private Block getBlockOrNull(Object block) {
        return block instanceof Block ? ((Block) block) : null;
    }
    public void addToWall(Block block){
        blocks.add(block);
    }

    @Override
    public Optional findBlockByColor(String color) {


        return blocks.stream().filter(block -> Objects.requireNonNull(getBlockOrNull(block)).getColor().equals(color)).findAny();

    }

    @Override
    public List findBlocksByMaterial(String material) {

        return blocks.stream().filter(block -> Objects.requireNonNull(getBlockOrNull(block)).getMaterial().equals(material)).toList();
    }

    @Override
    public int count() {
        return blocks.size();
    }
}

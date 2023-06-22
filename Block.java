import processing.core.PApplet;

public class Block {

    private static PApplet a = Main.processing;
    public static int BlockWidth = 30;
    public static int BlockHeight = 30;
    private int BlockX;
    private int BlockY;
    private int BlockColorR;
    private int BlockColorG;
    private int BlockColorB;

    public Block(int blockX, int blockY, int blockColorR, int blockColorG, int blockColorB) {
        BlockX = blockX;
        BlockY = blockY;
        BlockColorR = blockColorR;
        BlockColorG = blockColorG;
        BlockColorB = blockColorB;
    }

    public static void makeBlocks(){

        for (int i = 0; i < 100; i++) {

            Main.blocks.add(new Block((int) a.random(80), (int) (-a.random(60, 120) - Main.blockDistanceY), (int) a.random(255), (int) a.random(255), (int) a.random(255)));

            Main.blocks.add(new Block((int) a.random(100, 160), (int) (-a.random(60, 120) - Main.blockDistanceY), (int) a.random(255), (int) a.random(255), (int) a.random(255)));

            Main.blocks.add(new Block((int) a.random(190, 270), (int) (-a.random(60, 120) - Main.blockDistanceY), (int) a.random(255), (int) a.random(255), (int) a.random(255)));

            Main.blocks.add(new Block((int) a.random(300, 370), (int) (-a.random(60, 120) - Main.blockDistanceY), (int) a.random(255), (int) a.random(255), (int) a.random(255)));

            Main.blockDistanceY += 120;
        }
    }

    public static void showSecondOne(){

        a.textSize(150);
        a.fill(0);
        a.text("1", 165F, (float) Main.secDis1);
        Main.secDis1 += 10;

    }

    public static void showSecondTwo(){

        a.textSize(150);
        a.fill(0);
        a.text("2", 165F, (float) Main.secDis2);
        Main.secDis2 += 10;

    }

    public static void showSecondThree(){

        a.textSize(150);
        a.fill(0);
        a.text("3", 165F, (float) Main.secDis3);
        Main.secDis3 += 10;

    }

    public int getBlockY() {
        return BlockY;
    }

    public void setBlockY(int blockY) {
        BlockY = blockY;
    }

    public int getBlockX() {
        return BlockX;
    }

    public int getBlockColorR() {
        return BlockColorR;
    }

    public int getBlockColorG() {
        return BlockColorG;
    }

    public int getBlockColorB() {
        return BlockColorB;
    }
}

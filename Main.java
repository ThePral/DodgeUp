import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import java.util.ArrayList;

public class Main extends PApplet {

    public static int lives = 5;
    public int headWidth;
    public static PImage bg;
    public static float score = 0;
    public static float highestScore = 0;
    public static PApplet processing;
    public static int blockDistanceY = 670;
    public static double blockSpeedY = 3;
    public static double secDis1 = 10;
    public static double secDis2 = 10;
    public static double secDis3 = 10;

    public static int forGamingOver = 0;
    public static ArrayList<Block> blocks = new ArrayList<Block>();

    public static void main(String[] args) {

        PApplet.main("Main", args);

    }

    @Override
    public void setup() {
        processing = this;
        Block.makeBlocks();
        bg = loadImage("bg5.jpg");
    }

    @Override
    public void settings() {

        size(400, 700);

    }

    @Override
    public void draw() {

        if (forGamingOver == 0) {

            background(133, 58, 256);
//            background(bg);
            headWidth = 20;
            headWidth += 3;

            Human human = new Human(mouseX, 20, 240, 0 , 0);
            human.makeAndShowObjects();

            for (Block c: blocks) {
                showBlocks(c.getBlockX(), c.getBlockY(), c.getBlockColorR(), c.getBlockColorG(), c.getBlockColorB());
            }

            Block.showSecondOne();

            if (secDis1 >= 780){
                Block.showSecondTwo();
            }

            if (secDis2 >= 780){
                Block.showSecondThree();
            }

            moveBlocks();
            fill(255);
            textSize(23);
            strokeWeight(5);
            text("Score: " + (int)score, 20, 65);
            text("Lives: " + lives, 310, 65);
            if ((int)highestScore > (int)score){
                text("Highest Score: " + (int)highestScore, 120, 40);
            }
            if ((int)highestScore == (int)score){
                highestScore += 0.1;
                fill(245, 221, 2);
                text("Highest Score: " + (int)highestScore, 120, 40);
            }
            score += 0.1;
            if ((int)score >= highestScore){
                highestScore = (int)score;
            }
//            blockRemove();
            checkCrushed();
        }else {
            lost();
        }

    }



    public void checkCrushed(){

        for (int i = 0; i < blocks.size(); i++) {
            if ((blocks.get(i).getBlockY() + Block.BlockHeight >= 560) && (blocks.get(i).getBlockY() <= 610) && (blocks.get(i).getBlockX() + Block.BlockWidth >= mouseX -15) && (blocks.get(i).getBlockX() <= mouseX + 15)) {
                blocks.remove(i);
                lives--;

//                Human human = new Human(mouseX, 20, 240, 0 , 0);
//                human.showWhenCrashed();

                background(245, 5, 17);

                if (lives == 0){
                    lost();
                }
            }
        }
    }

    public void blockRemove(){

        for (int i = 0; i < blocks.size(); i++) {
            if (blocks.get(i).getBlockY() + Block.BlockHeight >= 620){

            }
        }

    }

    public void lost(){

        forGamingOver = 1;
        background(0);
        if ((int)highestScore == (int)score){
            fill(240, 0, 10);
            textSize(50);
            text("GAME OVER!", 70, 150);
            textSize(30);
            text("Score: " + (int) score, 140, 200);
            text("Highest score: " + (int)highestScore, 90, 250);
            textSize(70);
            fill(245, 221, 2);
            text("New Record!", 20, 420);
        }else {
            fill(240, 0, 10);
            textSize(50);
            text("GAME OVER!", 70, 200);
            textSize(30);
            text("Score: " + (int) score, 140, 350);
            text("Highest score: " + (int)highestScore, 90, 400);
        }


        textSize(20);
        fill(255);
        text("Press any key to play again", 85, 600);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < blocks.size(); j++) {
                blocks.remove(j);
            }
        }


        blockDistanceY = 670;

        if (keyPressed == true){
            score = 0;
            lives = 5;
            secDis1 = 10;
            secDis2 = 10;
            secDis3 = 10;
            forGamingOver = 0;
            Block.makeBlocks();
        }
    }

    public void moveBlocks(){

        for (int i = 0; i < blocks.size(); i++) {
            blocks.get(i).setBlockY((int) (blocks.get(i).getBlockY() + blockSpeedY));
        }

    }

    public void showBlocks(int x, int y, int R, int G, int B){

        fill(R, G, B);
        stroke(0);
        strokeWeight(3);
        rect(x, y, Block.BlockWidth, Block.BlockHeight);

    }

}
import processing.core.PApplet;
import processing.core.PImage;

public class Human implements HumanInterface{

    private float humanHeadWidth;
    private float humanHeight;
    private float humanColorR;
    private float humanColorG;
    private float humanColorB;
    private static PApplet a = Main.processing;
    private static PImage sm;

    public Human(float humanHeadWidth, float humanHeight, float humanColorR, float humanColorG, float humanColorB) {
        this.humanHeadWidth = humanHeadWidth;
        this.humanHeight = humanHeight;
        this.humanColorR = humanColorR;
        this.humanColorG = humanColorG;
        this.humanColorB = humanColorB;
    }

    public void makeAndShowObjects(){

        a.fill(humanColorR, humanColorG, humanColorB);
        a.noStroke();
        a.fill(242, 241, 230);
        a.circle(humanHeadWidth, 567, 22);
        a.fill(0);
        a.circle(humanHeadWidth - 5, 564, 5);
        a.fill(0);
        a.circle(humanHeadWidth + 5, 564, 5);
        a.stroke(0);
        a.strokeWeight(3);
        a.line(humanHeadWidth - 6, 570, humanHeadWidth + 5, 570);
        a.noStroke();
        a.fill(214, 31, 21);
        a.rect(humanHeadWidth - 10, 577, 20, 22);
        a.stroke(0);
        a.strokeWeight(4);
        a.line(humanHeadWidth + 11, 578, humanHeadWidth + 11, 595);
        a.line(humanHeadWidth - 12, 578, humanHeadWidth - 12, 595);
        a.stroke(0);
        a.line(humanHeadWidth - 5, 600, humanHeadWidth - 5, 615);
        a.line(humanHeadWidth + 5, 600, humanHeadWidth + 5, 615);
//        a.line(humanHeadWidth + 15, 610, humanHeadWidth + 5, 615);
        a.stroke(242, 241, 160);
        a.strokeWeight(20);
        a.line(0, 620, 400, 620);
    }

    public void showWhenCrashed(){

        a.fill(humanColorR, humanColorG, humanColorB);
        a.noStroke();
        a.fill(242, 241, 230);
        a.circle(humanHeadWidth, 570, 16);
        a.fill(214, 31, 21);
        a.rect(humanHeadWidth - 10, 577, 20, 22);
        a.stroke(0);
        a.strokeWeight(4);
        a.line(humanHeadWidth + 11, 578, humanHeadWidth + 11, 595);
        a.line(humanHeadWidth - 12, 578, humanHeadWidth - 12, 595);
        a.stroke(0);
        a.line(humanHeadWidth - 5, 600, humanHeadWidth - 5, 615);
        a.line(humanHeadWidth + 5, 600, humanHeadWidth + 5, 615);
//        a.line(humanHeadWidth + 15, 610, humanHeadWidth + 5, 615);
        a.stroke(245, 5, 17);
        a.strokeWeight(20);
        a.line(0, 620, 400, 620);

    }
}

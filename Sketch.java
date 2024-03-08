import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {
	int intHeight;
  int intWidth;
	

  public void settings() {
	
    size(1200, 600);
  }

  
  public void setup() {

  Random myRandom = new Random();
    intHeight = myRandom.nextInt((height/8)+9);
    intWidth = myRandom.nextInt((height/8)+9);

    if (intHeight < 20){
      background(3, 177, 252); 
    } else {
      background(252, 3, 177);
    }
     // Show Current time
     int hr = hour();
     int min = minute();
 
     fill(0);
     textSize(70);
     text(hr, 300, 300);
     text(min, 300, 350);

    // Yellow Circle
      fill(255,213,000);
      ellipse(Math.round(600.0/1200.0 * width) - intWidth, Math.round(300.0/600.0 * height) - intHeight, Math.round(200.0/1200.0 * width), Math.round(200.0/600.0 * height));

    // Smile and Eyes
      fill(255, 255, 255);
      rect(Math.round(550.0/1200.0 * width) - intWidth, Math.round(325.0/600.0 * height) - intHeight, Math.round(100.0/1200.0 * width),Math.round(40.0/600.0 * height));
      ellipse(Math.round(550.0/1200.0 * width) - intWidth, Math.round(275.0/600.0 * height) - intHeight, Math.round(50.0/1200.0 * width), Math.round(50.0/600.0 * height));
      ellipse(Math.round(650.0/1200.0 * width) - intWidth, Math.round(275.0/600.0 * height) - intHeight, Math.round(50.0/1200.0 * width),Math.round(50.0/600.0 * height));

    // Pupils and Teeth
      fill(0,0,0);
      ellipse(Math.round(550.0/1200.0 * width)- intWidth, Math.round(275.0/600.0 * height) - intHeight, Math.round(20.0/1200.0 * width), Math.round(20.0/600.0 * height));
      ellipse(Math.round(650.0/1200.0 * width)- intWidth, Math.round(275.0/600.0 * height) - intHeight, Math.round(20.0/1200.0 * width), Math.round(20.0/600.0 * height));
      line(Math.round(570.0/1200.0 * width) - intWidth, Math.round(325.0/600.0 * height) - intHeight, Math.round(570.0/1200.0 * width) - intWidth, Math.round(365.0/600.0 * height) - intHeight);
      line(Math.round(590.0/1200.0 * width) - intWidth, Math.round(325.0/600.0 * height) - intHeight, Math.round(590.0/1200.0 * width) - intWidth, Math.round(365.0/600.0 * height) - intHeight);
      line(Math.round(610.0/1200.0 * width) - intWidth, Math.round(325.0/600.0 * height) - intHeight, Math.round(610.0/1200.0 * width) - intWidth, Math.round(365.0/600.0 * height) - intHeight);
      line(Math.round(630.0/1200.0 * width) - intWidth, Math.round(325.0/600.0 * height) - intHeight, Math.round(630.0/1200.0 * width) - intWidth, Math.round(365.0/600.0 * height) - intHeight);
      line(Math.round(550.0/1200.0 * width) - intWidth, Math.round(345.0/600.0 * height) - intHeight, Math.round(650.0/1200.0 * width) - intWidth, Math.round(345.0/600.0 * height) - intHeight);


    
    }
  }


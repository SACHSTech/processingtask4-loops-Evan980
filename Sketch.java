import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	//Stroke
  strokeWeight((float)0.003*height);
  stroke(40, 40, 40);

  //Quadrant 1
  for (int i = height/20; i <= height/2; i += height/20) {
    line(i, 0, i, height/2);
    line(0, i, width/2, i);
  }
    //Quadrant 2
    fill(204, 0, 102);
    for (int circleY = ((height)/14); circleY <= ((height/14)*7); circleY += ((height)/11)) {
      for (int circleX = ((width)/14)+250; circleX <= ((width/14)*7)+250; circleX += ((width)/11)) {
        ellipse(circleX, circleY, 25, 25);
      }
    }

    //
  }
  
  // define other methods down here.
}
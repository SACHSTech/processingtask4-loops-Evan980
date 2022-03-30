import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
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
  strokeWeight((float)0.006*height);
  stroke(40, 40, 40);

  //Quadrant 1
  for (int i = height/20; i <= height/2; i += height/20) {
    line(i, 0, i, height/2);
    line(0, i, width/2, i);
  }
    //Quadrant 2
  }
  
  // define other methods down here.
}
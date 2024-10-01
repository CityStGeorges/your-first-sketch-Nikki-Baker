

void setup() {
  size(600, 600);
  background(255,255,255);
}


void draw() {
  fill(255,0,0);
  strokeWeight(0);
  circle(300,300,440);
  fill(255,255,255);
  circle(300,300,280);
  fill(0,0,255);
  rect(50,250,500,100);
  fill(255,255,255);
  textSize(80);
  textAlign(CENTER);
  
  text("Underground", 300, 325);
}


void setup() {
  size(400, 300);
}

void draw() {
  
  var x = 150;
  var y = 40;

  //background(255,255,255);
  
  stroke(0, 0, 0);
  strokeWeight(4);

  fill(252, 135, 135);

  circle(20+x, 40+y, 20);
  rect(20+x, 30+y, 50, 20);
  circle(70+x, 50+y, 30);
  circle(70+x, 30+y, 30);

  stroke(240, 232, 218);
  strokeWeight(6);
  line(10+x, 40+y, mouseX, mouseY);
  if (mouseX > width/2){
    fill(255, 0,0);
  }
  else{
    fill(0,255,0);
  }
  textSize(35);
  text("Nob", 120,180);
}

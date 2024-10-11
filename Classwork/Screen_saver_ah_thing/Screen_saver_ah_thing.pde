
void setup(){
  size (1000,1000);
  frameRate(999999999);
}

void draw(){
  sqrLine();
}

void sqrLine(){
  var x = -30.0;
  var yTrue = 0.0;
  
  while(yTrue<width+30){
    
    var y = yTrue;
    while(x<width+30){
      rect(x,y,30,30);
      x+=random(1,8);
      y += random(-3,3);
    }
    
    x = 0;
    yTrue += random(5,20);
  
  }
}

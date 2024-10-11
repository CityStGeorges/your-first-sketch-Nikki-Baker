int itt = 0;
int lLength = 10;
String[] list = {"H","e","l","l","o","W","o","r","l","d","!"};

float x = 0;
float y = 0;

float r = 0;
float g = 0;
float b = 0;



void setup(){
  size(1000,800);
  frameRate(999999999);
  
}

  
  void draw() {
  if(itt == 0){
    x = random(925);
    y = random(800);
    
    r = random(255);
    g = random(255);
    b = random(255);
    fill(r,g,b);
  }
  else{
    x += 8;
    y += random(5)-2.5;
    r += random(100)-50;
    g += random(100)-50;
    b += random(100)-50;
    fill(r,g,b);
  }
  //background(250);
  var L = list[itt];
  text(L,x,y);
  
  itt += 1;
  if(itt>lLength){
    itt -= lLength+1;
  }
  
}

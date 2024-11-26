int lineWidth;
color lineColor;
PImage myPic;

void setup () {
  
  size(598,900);
  lineWidth = 5;
  lineColor = color(255,128);
  myPic = loadImage("C:\\Users\\georg\\Desktop\\Uni Work\\img1.jpg");
  image(myPic,0,0);
  
}

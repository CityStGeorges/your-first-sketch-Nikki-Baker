void setup(){
  size(600, 400);
  fill(203, 118, 122);
}
 
void draw(){
  background(255, 236, 149);
  rect(mouseX-60, mouseY-40, 120, 80);
}

// moving the background into the draw function will mean the rectangle will only
// appear under the mouse cursor (will not do the weird solitare cards thing).
// this is because the background is cleared each draw cycle so previously drawed
// instances will be covered.

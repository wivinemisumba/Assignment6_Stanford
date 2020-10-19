package ImageProcessing;

public class ImageProcessing {

}
private GImage flipHorizontal(GImage image) {
int[][] array = image.getPixelArray();
int width = array[0].length;
int height = array.length;
for (int row = 0; row < height; row++) {
for (int p1 = 0; p1 < width / 2; p1++) {
int p2 = width - p1 - 1;
int temp = array[row][p1];
array[row][p1] = array[row][p2];
array[row][p2] = temp;
}
}
return new GImage(array);
}

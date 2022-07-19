public class Photo {
    String url;
    String filename;
    int width;
    int height;

    public Photo(String cUrl, String cFilename, int cWidth, int cHeight){
        this.url = cUrl;
        this.filename = cFilename;
        this.width = cWidth;
        this.height = cHeight;
    }
    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}
    public String getFilename() {return filename;}
    public void setFilename(String filename) {this.filename = filename;}
    public int getWidth() {return width;}
    public void setWidth(int width) {this.width = width;}
    public int getHeight() {return height;}
    public void setHeight(int height) {this.height = height;}
}
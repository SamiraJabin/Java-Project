package coordinates;

public class Coordinates {
    int row;
    int col;

    public Coordinates(int row,int col){
        this.row = row;
        this.col = col;
    }

    public String printCoordinates(){
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(this.row).append(",").append(this.col).append("]");
        return sb.toString();
    }
    public int getRow(){ //this function is used to access row value. instead of this func we can also add public to int row and access in other classes
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
}

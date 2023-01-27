public class Point {
    public int x;
    public int y;

    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int a){
        this.x = a;
    }
    public void setY(int b){
        this.y = b;
    }
    public void move(int x){
        // x bernilai 1/2/3/4, 1 untuk ke kiri, 2 untuk ke atas, 3 untuk ke bawah, 4 untuk ke kanan
        if (x==1){
            this.x = (this.x - 1)%6;
        }
        else if (x==2){
            this.y = (this.y + 1)%6;
        }
        else if (x==3){
            this.x = (this.y - 1)%6;
        }
        else if (x==4){
            this.y = (this.x + 1)%6 ;
        }
    }
    
}

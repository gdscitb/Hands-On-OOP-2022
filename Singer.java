public class Singer{
    String title;
    String singer;
    
    Singer(String titleInput, String singerInput){
            this.title = titleInput;
            this.singer = singerInput;
    }

    void display(){
        System.out.println("Title = " + this.title);
        System.out.println("Singer= " + this.singer);
    }
}
    


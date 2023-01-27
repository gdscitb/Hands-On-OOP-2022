import java.util.*;
import java.io.IOException;
import java.lang.Math;
class World {
    public static void moveto(char[][] map, int a, Point p, char x){
        map[((p.x+6)%6)*6+3][((p.y+6)%6)*2+1]=' ';
        if (a==1){ //left
            p.move(1);
        } else if (a==2){ //up
            p.move(2);
        } else if (a==3){ //down
            p.move(3);
        } else if (a==4){ //right
            p.move(4);
        }
        map[(p.x+6+1)*6+3][(p.y+6)*2+1]=x;
    }
    public static void help(){
        System.out.println("=========================================\n");
        System.out.println("|                GUIDELINE              |\n");
        System.out.println("|=======================================|\n");
        System.out.println("| Command:                              |\n");
        System.out.println("| A: move left                          |\n");
        System.out.println("| W: move up                            |\n");
        System.out.println("| S: move down                          |\n");
        System.out.println("| D: move right                         |\n");
        System.out.println("| H: help                               |\n");
        System.out.println("| F: open inventory                     |\n");
        System.out.println("| B: put block                          |\n");
        System.out.println("|                                       |\n");
        System.out.println("| Attacked by enemymob --> hearts-=1    |\n");
        System.out.println("| hearts = 0 --> gameover               |\n");
        System.out.println("| kill livestock --> masuk inventory    |\n");
        System.out.println("| jumlah product di inventory akan di-  |\n");
        System.out.println("| konversi menjadi poin di akhir permai-|\n");
        System.out.println("| nan                                   |\n");
        System.out.println("=========================================\n");

    }
    public static void printmap(char[][] map,int row,int col){
        //cls in duluu
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.print(map[j][i]);
            
            }
            System.out.print('\n');
        }
    }

    public static int length(Item[] inventory, int row){
        int count=0;
        for (int i=0;i<row;i++){
            if (inventory[i]!=null){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner pname = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = pname.nextLine();
        Player host = new Player(name);
        System.out.println("Welcome, " + host.name);
        int row=79;
        int col=27;
        char[][] map= new char[row][col];

        for (int x=0;x<row;x++){
            for (int y=0;y<col;y++){
                map[x][y]=' ';
            }
        }
        for (int y=0;y<col;y+=2){
            for (int x=0;x<row;x++){
                map[x][y]='-';
            }
        }
        for (int y=0;y<col;y+=2){
            for (int x=1; x<row; x+=6){
                map[x][y]=' ';
            }
        }
        for (int y=0;y<col;y+=2){
            for (int x=5; x<row; x+=6){
                map[x][y]=' ';
            }
        }
        for (int x=0;x<row;x+=6){
            for (int y=0;y<col;y++){
                map[x][y]='|';
            }
        }
        for (int y=0;y<col;y+=2){
            for (int x=0; x<row; x+=6){
                map[x][y]='+';
            }
        }
        int max=6;
        int min=-6;

        int xcow=(int)(Math.random()*(max-min+1)+min);
        int ycow=(int)(Math.random()*(max-min+1)+min);
        Livestock cow = new Livestock("Cow", 4, "beef", new Point(xcow,ycow));
        map[(xcow+6)*6+3][(ycow+6)*2+1]='C';
        Livestock cow2 = new Livestock("Cow", 4, "beef", new Point((xcow+2)%2,(ycow+2)%6));
        map[((xcow+6+2)%6)*6+3][((ycow+6+2)%6)*2+1]='C';



        int xsheep=(int)(Math.random()*(max-min+1)+min);
        int ysheep=(int)(Math.random()*(max-min+1)+min);
        while (xsheep==xcow && ysheep==ycow){
            xsheep=(int)(Math.random()*(max-min+1)+min);
            ysheep=(int)(Math.random()*(max-min+1)+min);
        }
        Livestock sheep = new Livestock("Sheep", 2, "wool", new Point(xsheep, ysheep));
        map[(xsheep+6)*6+3][(ysheep+6)*2+1]='S';
        Livestock sheep2 = new Livestock("Sheep", 2, "wool", new Point((xsheep+1)%6, (ysheep+2)%6));
        map[((xsheep+6+1)%6)*6+3][((ysheep+6+2)%6)*2+1]='S';


        int xzb=(int)(Math.random()*(max-min+1)+min);
        int yzb=(int)(Math.random()*(max-min+1)+min);
        while ((xzb==xcow && yzb==ycow)||(xzb==xsheep && yzb==ysheep)){
            xzb=(int)(Math.random()*(max-min+1)+min);
            yzb=(int)(Math.random()*(max-min+1)+min);
        }
        Enemymobs zombie = new Enemymobs("Zombie", 20, 4, new Point(xzb, yzb));
        map[((xzb+6))*6+3][((yzb+6))*2+1]='Z';
        Enemymobs zombie2 = new Enemymobs("Zombie", 20, 4, new Point((xzb+1)%6, (yzb-1)%6));
        map[((xzb+1+6)%6)*6+3][((yzb-1+6)%6)*2+1]='Z';
        Enemymobs zombie3 = new Enemymobs("Zombie", 20, 4, new Point((xzb+2)%6, (yzb-2)%6));
        map[((xzb+2+6)%6)*6+3][((yzb-2+6)%6)*2+1]='Z';
        Enemymobs zombie4 = new Enemymobs("Zombie", 20, 4, new Point((xzb+1)%6, (yzb-3)%6));
        map[((xzb+1+6)%6)*6+3][((yzb-3+6)%6)*2+1]='Z';

        int xw=(int)(Math.random()*(max-min+1)+min);
        int yw=(int)(Math.random()*(max-min+1)+min);
        while ((xw==xcow && yw==ycow)||(xw==xsheep && yw==ysheep)||(xw==xzb&&yw==yzb)){
            xw=(int)(Math.random()*(max-min+1)+min);
            yw=(int)(Math.random()*(max-min+1)+min);
        }
        Enemymobs witch = new Enemymobs("Witch", 20, 8, new Point(xw,yw));
        map[((xw+6))*6+3][((yw+6))*2+1]='W';
        Enemymobs witch2 = new Enemymobs("Witch", 20, 8, new Point((xw+1)%6,(yw+3)%6));
        map[((xw+6+1)%6)*6+3][((yw+6+3)%6)*2+1]='W';
        Enemymobs witch3 = new Enemymobs("Witch", 20, 8, new Point((xw+2)%6,(yw+3)%6));
        map[((xw+6+2)%6)*6+3][((yw+6+3)%6)*2+1]='W';
        
        int xg=(int)(Math.random()*(max-min+1)+min);
        int yg=(int)(Math.random()*(max-min+1)+min);
        while ((xg==xcow && yg==ycow)||(xg==xsheep && yg==ysheep)||(xg==xzb&&yg==yzb)||(xg==xw&&yg==yw)){
            xg=(int)(Math.random()*(max-min+1)+min);
            yg=(int)(Math.random()*(max-min+1)+min);
        }
        Enemymobs ghast = new Enemymobs("Ghast", 20, 10, new Point(xg,yg));
        map[((xg+6))*6+3][((yg+6))*2+1]='G';
        Enemymobs ghast2 = new Enemymobs("Ghast", 20, 10, new Point((xg+2)%6,(yg-2)%6));
        map[((xg+6+2)%6)*6+3][((yg+6-2)%6)*2+1]='G';

        map[(host.position.x+6)*6+3][(host.position.y+6)*2+1]='P';
        
        Item[] inventory = new Item[20];
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                System.out.print(map[j][i]);
            
            }
            System.out.print('\n');
        }
        System.out.println("Welcome to the game!");
        System.out.println("Press 'H' for help!");
        int av=0;
        do {
            printmap(map,row,col);
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your command: ");
            String command = input.nextLine();
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),cow.position, 'C');
            cow.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),cow2.position, 'C');
            cow2.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),sheep.position, 'S');
            sheep.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),sheep2.position, 'S');
            sheep2.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),zombie.position, 'Z');
            zombie.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),zombie2.position, 'Z');
            zombie2.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),zombie3.position, 'Z');
            zombie3.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),zombie4.position, 'Z');
            zombie4.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),witch.position, 'W');
            witch.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),witch2.position, 'W');
            witch2.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),witch3.position, 'W');
            witch3.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),ghast.position, 'G');
            ghast.position.move((int)(Math.random()*(4-1+1)+1));
            World.moveto(map,(int)(Math.random()*(4-1+1)+1),ghast2.position, 'G');
            ghast2.position.move((int)(Math.random()*(4-1+1)+1));
            if (command=="A"){
                World.moveto(map, 1, host.position,'P');
                host.position.move(1);
            } else if (command=="W"){
                World.moveto(map, 2, host.position,'P');
                host.position.move(2);
            } else if (command=="S"){
                World.moveto(map, 3, host.position,'P');
                host.position.move(3);
            } else if (command=="D"){
                World.moveto(map, 4, host.position,'P');
                host.position.move(4);
            } else if (command=="H"){
                World.help();
            }
            map[(host.position.x+6)*6+3][(host.position.y+6)*2+1]='P';

            if (host.position.x==cow.position.x && host.position.y==cow.position.y){
                    System.out.print("You found livestock (cow) !");
                    // setelah di-kill direspawn di tempat lain
                    cow.position = new Point((int)(Math.random()*(max-min+1)+min),(int)(Math.random()*(max-min+1)+min));
                    inventory[av]=new Item(cow.product);
                    av+=1;
                    System.out.println("You got livestock product!");
            } else if (host.position.x==cow2.position.x && host.position.y==cow2.position.y){
                    System.out.print("You found livestock (cow) !");
                    cow.position = new Point((int)(Math.random()*(max-min+1)+min),(int)(Math.random()*(max-min+1)+min));
                    inventory[av]=new Item(cow2.product);
                    av+=1;
                    System.out.println("You got livestock product!");
            } else if (host.position.x==sheep.position.x && host.position.y==sheep.position.y){
                    System.out.print("You found livestock (sheep) !");
                    sheep.position = new Point((int)(Math.random()*(max-min+1)+min),(int)(Math.random()*(max-min+1)+min));
                    inventory[av]=new Item(sheep.product);
                    av+=1;
                    System.out.println("You got livestock product!");
            } else if (host.position.x==sheep2.position.x && host.position.y==sheep2.position.y){
                    System.out.print("You found livestock (sheep) !");
                    sheep2.position = new Point((int)(Math.random()*(max-min+1)+min),(int)(Math.random()*(max-min+1)+min));
                    inventory[av]=new Item(sheep2.product);
                    av+=1;
                    System.out.println("You got livestock product!");
                } 
            if (map[(host.position.x-1+6)*6+3][(host.position.y+6)*2+1]=='Z' || map[(host.position.x+1+6)*6+3][(host.position.y+6)*2+1]=='Z' || map[(host.position.x+6)*6+3][(host.position.y-1+6)*2+1]=='Z' || map[(host.position.x+6)*6+3][(host.position.y+1+6)*2+1]=='Z'){
                System.out.println("You attacked by zombie!");
                host.lives-=zombie.damage;
                System.out.println("You have "+host.lives+" lives left!");

            } else if (map[(host.position.x-1+6)*6+3][(host.position.y+6)*2+1]=='W' || map[(host.position.x+1+6)*6+3][(host.position.y+6)*2+1]=='W' || map[(host.position.x+6)*6+3][(host.position.y-1+6)*2+1]=='W' || map[(host.position.x+6)*6+3][(host.position.y+1+6)*2+1]=='W'){
                System.out.println("You attacked by witch!");
                host.lives-=witch.damage;
                System.out.println("You have "+host.lives+" lives left!");

            } else if (map[(host.position.x-1+6)*6+3][(host.position.y+6)*2+1]=='G' || map[(host.position.x+1+6)*6+3][(host.position.y+6)*2+1]=='G' || map[(host.position.x+6)*6+3][(host.position.y-1+6)*2+1]=='G' || map[(host.position.x+6)*6+3][(host.position.y+1+6)*2+1]=='G'){
                System.out.println("You attacked by ghast!");
                host.lives-=ghast.damage;
                System.out.println("You have "+host.lives+" lives left!");
            } 
            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } while (host.lives!=0 && av<=20);
        if (host.lives==0){
            System.out.println("You died!");
            System.out.println("You got "+av+" items!");
        } else if (av==20){
            System.out.println("You win! You got 20 items!");
        }
    }
}

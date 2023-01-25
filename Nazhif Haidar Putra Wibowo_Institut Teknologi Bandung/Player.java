import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
/* Tugas Hands-On OOP */
/*
 * Program: Feature paket langganan top up Genshin Impact
 */

abstract class Subscription{ //implementasi abstraksi
    private double price;
    public String name;
    public int duration = 30;
    public boolean isEffective = true;
    private long ate;
    public long currentDate;
    public int primo_amount;

    /* Implementasi Enkapsulasi */
    public long getSubsDate(){
        return this.ate;
    }
    public void setSubsDate(long date){
        this.ate = date;
    }
    void setPrice(double price){
        this.price = price;
    }
    double getPrice(){
        return this.price;
    }
    public void use(Player player, Subscription subs){
        try {
            currentDate = getSubsDate();
            while (isEffective){
                player.obtainPrimos(subs);
                System.out.println("Langganan day " + (currentDate - getSubsDate()));
                if (currentDate > getSubsDate() + 30){
                    isEffective = false;
                }
                currentDate++;
            }
        }
        catch (Exception e){
            System.out.println("Belum berlangganan");
        }
    }
    /* Implementasi Abstraksi/Interface dan penerapan SOLID yaitu Open Closed Principle*/
    abstract void activate(Player player);
}

/* Implementasi Inheritance */
class Welkin extends Subscription{

    private static Welkin instance = new Welkin();
    private Welkin(){
        primo_amount = 30;
        name = "Moon Welkin";
        setPrice(5d);
    }
    public static Welkin getInstance(){
        return instance;
    }

    /* Open Close Principle */
    public void activate(Player player){
        try{
            use(player, player.welkin);
        }
        catch (Exception e){
            System.out.println("Belum berlangganan");
        }
    }

}

class BattlePass extends Subscription{
    /* Implementasi design pattern menggunakan singleton design pattern,
     * alasan menggunakan implementasi ini adalah untuk menjamin bahwa hanya ada 1 buah objek
     * yang dibentuk. memastikan bahwa untuk setiap player hanya berlangganan pada 1 buah paket langganan.
     * i.e 1 player hanya bisa berlangganan 1 welkin.
    */

    private static BattlePass instance = new BattlePass();
    private BattlePass(){
        primo_amount = 90;
        name = "Battle Pass";
        setPrice(12d);
    }
    public static BattlePass getInstance(){
        return instance;
    }

    public void ObtainBPWeapons(){
        System.out.println("You got a BP Weapon");

    }

    /* Open Close Principle dan Polimorfisme */
    public void activate(Player player){
        try{
            use(player, player.battlePass);
            ObtainBPWeapons();
        }
        catch (Exception e){
            System.out.println("Belum berlangganan");
        }
    }
}


public class Player {
    public String nickname;
    public int adventureRank;
    public int worldLevel;
    private int numOfChar = 0;
    private int primogems = 0;

    public Welkin welkin;
    public BattlePass battlePass;
    public Player(String name){
        nickname = name;
        adventureRank = 1;
        worldLevel = 1;
    }
    public void obtainPrimos(Subscription subs){
        setPrimogem(getPrimogems() + subs.primo_amount);
    }

    private boolean subsToWelkin = false;
    private boolean subsToBP = false;
    public void setPrimogem(int primo){
        this.primogems = primo;
    }
    public int getPrimogems(){
        return this.primogems;
    }
    public void langgananWelkin(){
        welkin = Welkin.getInstance();
        welkin.setSubsDate(new Date().getTime());
        printLangganan(welkin);
    }
    public void langgananBattlePass(){
        battlePass = BattlePass.getInstance();
        battlePass.setSubsDate(new Date().getTime());
        printLangganan(battlePass);
    }
    // implementasi polimorfisme
    private void printLangganan(Subscription subs){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date(subs.getSubsDate());
        System.out.println("Anda berlangganan " + subs.name + " pada tanggal " + formatter.format(date));
    }
}

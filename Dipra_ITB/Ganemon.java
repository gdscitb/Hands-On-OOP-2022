// IN PROGRESS

String[] nature = ["light", "dark", "earth", "thunder"]
String[] elements = ["wind", "water", "fire", "wood"]

public class Ganemon {
    private String name;
    private String element; // interactive elemental damage
    private int HP, AT, DF, ULT;
    // HP = health points
    // AT = attack points
    // DF = defend points
    // ULT = Ultimate attack points

    // Construtor
    public Ganemon(String name="Ganebot", String element="Wind", int HP=150, int AT=75, int DF=20, int ULT=AT*1.5) {
        this.name = name;
        this.element= element;

        if(HP < 0 || HP > 400){
            this.HP = 400;
        }else this.HP = HP;

        if(AT < 0 || AT > 200){
            this.AT = 200;
        }else this.AT = AT;

        if(DF < 0 || DF > 125){
            this.DF = 125;
        }else this.DF = DF;

        this.ULT = ULT;
    }

    // Attack Methods
    public void attack(Ganemon attacker, Ganemon defender) {
        int hit = (attacker.AT - defender.DF)

        // HIT elemental reactions
        // Kalau elemen attacker beat element defender, attacknya +20%
        if (elements[(elements.findIndex(attacker.element)+1)%4] == defender.element) {
            hit *= 1.2;
        }

        // Kalau elemen defender beat element attacekr, defendnya -25%
        // ini mod -1 gimana?
        if (elements[(elements.findIndex(defender.element)+1)%4] == attacker.element) {
            hit *= 0.75;
        }

        defender.HP -= hit;
        String desc = MessageFormat.format("{0} attacks {1}. {1} health is reduced by {2}.", attacker.name, defender.name, hit)
        System.out.println(desc);

        if(defender.health == 0){
            System.out.println(defender.name + " is dead");
            defender.HP = 0;
        } else {
            System.out.println(defender.name + " health is " + defender.HP);
        }
    }

    // Special Elemental Skills in Progress

    // Healing Method only for water, light, wood

    // Shieldy Armour Method only for earth, 50% wood (resist for any attack)

    // Flying/Flash/Shadow Dodge Method only for wind, thunder, dark (unresist by Ultimate)

    // Powerful Ultimate Method only for fire, thunder, dark, light (*2)

    // getter settter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getAT() {
        return AT;
    }

    public void setAT(String AT) {
        this.AT = AT;
    }

    public int getDF() {
        return DF;
    }

    public void setDF(int DF) {
        this.DF = DF;
    }

    public int getULT() {
        return ULT;
    }

    public void setULT(int ULT) {
        this.ULT = ULT;
    }

}
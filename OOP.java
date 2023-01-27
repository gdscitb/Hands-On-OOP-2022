public class Staff {
    String name;
    int age;
    String section = "IT";

    public String updateSection(String newSection){
        section = newSection;
        return section;
    }

    public void getDetails(){
        System.out.println("Staff Name: " + name);
        System.out.println("Staff Age: " + age);
        System.out.println("Staff Section: " + section);
    }

    public static void main(String args[]) {
        Staff staff1 = new Staff();
        staff1.getDetails();
        staff1.updateSection("HR");
        staff1.getDetails();
    }
}
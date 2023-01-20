import java.util.ArrayList;
import java.util.List;

// MemberLogIn untuk login member
public class MemberLogIn {
    private List<Member> members;
    
    public MemberLogIn() {
        // Hardcoded list seperti database
        members = new ArrayList<>();
        members.add(new RegularMember("Udin", "passwordsatu", 18, 170, 80));
        members.add(new RegularMember("Joni", "passworddua", 20, 175, 75));
        members.add(new PremiumMember("Budi", "passwordtiga", 19, 168, 80));
        members.add(new PremiumMember("Dono", "passwordempat", 21, 169, 77));
    }
    
    // Mengecek login member
    public void login(String name, String password) {
        boolean isSuccessful = false;
        for (Member member : members) {
            if (member.getName().equals(name) && member.getPassword() != null && member.getPassword().equals(password)) {
                member.welcome();
                isSuccessful = true;
                break;
            }
        }
        if (!isSuccessful) {
            System.out.println("Login gagal. Nama atau password salah. Silahkan coba lagi.");
            System.exit(0);
        }
    }
}
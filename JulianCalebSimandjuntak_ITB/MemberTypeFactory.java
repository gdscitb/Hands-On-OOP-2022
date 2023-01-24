// Class untuk membuat member baru jika user register

public class MemberTypeFactory implements MemberFactory {
    public MemberTypeFactory(){};    
    @Override
    public Member createMember(String name, String password, int type, int age, int height, int weight) {
        if (type == 1) {
            return new RegularMember(name, password, age, height, weight);
        } else {
            return new PremiumMember(name, password, age, height, weight);
        }
    }
}
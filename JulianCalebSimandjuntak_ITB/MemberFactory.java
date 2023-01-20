// Interface MemberFactory untuk membuat member

public interface MemberFactory {
    public Member createMember(String name, String password, int type, int age, int height, int weight);
}
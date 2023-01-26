
package semartkompelek;

import java.util.ArrayList;

public class SemartKompelek {
    ArrayList<Users> userlist = new ArrayList<>();
    
    public void addUser(Users user){
        userlist.add(user);
    }
    
    public ArrayList<Users> getUserlist(){
        return this.userlist;
    }
    
    public static void main(String[] args) {
        SemartKompelek app = new SemartKompelek();
        Users user1 = new Users("user","user");  
        Users user2 = new Users("user2","user2");
        Users user3 = new Users("isal","isal");
       
        app.addUser(user1);
        app.addUser(user2);
        app.addUser(user3);
      
        LogIn lg = new LogIn(app.userlist);
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(LogIn.EXIT_ON_CLOSE);
    }
    
}

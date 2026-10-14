public class Admin {
    public static void main(String[] args) {

    boolean isLoggedIn = true;
    int securityLevel = 4;
    boolean isAdmin = true;

    if(isLoggedIn && (isAdmin||securityLevel <= 2)){
        System.out.println("Access granted");
    }else if(isLoggedIn && (!isAdmin||securityLevel > 2)){
        System.out.println("Unauthorized access");
    }else if(!isLoggedIn){
        System.out.println("Please Log in");
    }
    else{
        System.out.println("Access denied");

    }


    
}
}

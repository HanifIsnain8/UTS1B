import java.util.ArrayList;

public class Facebook {
    private String ID;
    private ArrayList<Postingan> MYPOST = new ArrayList<>();// dari database
    private ArrayList<JumlahPostingan> JUMPOST= new ArrayList<>();// dari database
    private boolean isLogin;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Postingan> getMYPOST() {
        return MYPOST;
    }

    public void setMYPOST(ArrayList<Postingan> MYPOST) {
        this.MYPOST = MYPOST;
    }

    public ArrayList<JumlahPostingan> getJUMPOST() {
        return JUMPOST;
    }

    public void setJUMPOST(ArrayList<JumlahPostingan> JUMPOST) {
        this.JUMPOST = JUMPOST;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public Facebook(){
        if(isLogin){
            Postingan MyPost = new Postingan();
            MyPost.ShowPostingan(MYPOST);
            JumlahPostingan JumPost = new JumlahPostingan():
            JumPost.ShowAllJumlahPostingan(JUMPOST);
        }
    }


    public static void main(String[] args) {
        int jumPost = 4;
        Scanner sc = new Scanner(System.in);
        UAS1B user1 =  new UAS1B();
        user1.setID("001");
        user1.setUserName("dbgb4a");
        user1.setFullName("Debby Gibson");
        ArrayList<String> myPost =  new ArrayList<>();
        for(int index=0; index<jumPost;index++){
            myPost.add(sc.nextLine());
        }
        user1.setPosted(myPost);
        System.out.println("Total Posted : " + user1.ShowNumberOfPost());

    }

}



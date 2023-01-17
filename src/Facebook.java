import java.util.ArrayList;

public class Facebook {
    private String  ID;

    private ArrayList<Postingan> POSTINGAN = new ArrayList<>();// dari database
    private ArrayList<Like> LIKE = new ArrayList<>();// dari database
    private boolean isLogin;


    public Facebook(){
        if(isLogin){
            Postungan POSTNGAN = new Postingan();
            Postingan.ShowPostingan(POSTINGAN);
            like LIKE = new Like():
            like.ShowAlllike(LIKE);
        }
    }

}

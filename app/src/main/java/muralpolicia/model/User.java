package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 10/09/2017.
 */

public class User implements Parcelable {
    private int id;
    private String usrLogin;
    private String usrSenha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String usrLogin, String usrSenha) {
        this.usrLogin = usrLogin;
        this.usrSenha = usrSenha;
    }

    public String getusrLogin() {
        return usrLogin;
    }

    public void setusrLogin(String usrLogin) {
        this.usrLogin = usrLogin;
    }

    public String getusrSenha() {
        return usrSenha;
    }

    public void setusrSenha(String usrSenha) {
        this.usrSenha = usrSenha;
    }

    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.usrLogin);
        dest.writeString(this.usrSenha);
    }

    public User(Parcel in){
        this.id = in.readInt();
        this.usrLogin = in.readString();
        this.usrSenha =  in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };

}

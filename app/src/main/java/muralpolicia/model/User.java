package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 10/09/2017.
 */

public class User implements Parcelable {

    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.login);
        dest.writeString(this.password);
    }

    public User(Parcel in){
        this.login = in.readString();
        this.password =  in.readString();
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

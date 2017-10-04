package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Olho implements Parcelable {
    int id;
    String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Olho(int id, String descricao) {

        this.id = id;
        this.descricao = descricao;
    }

    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.descricao);
    }

    public Olho(Parcel in) {
        this.id = in.readInt();
        this.descricao = in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Olho createFromParcel(Parcel in) {
            return new Olho(in);
        }

        public Olho[] newArray(int size) {
            return new Olho[size];
        }
    };
}

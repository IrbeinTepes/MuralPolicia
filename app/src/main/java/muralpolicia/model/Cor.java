package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Cor implements Parcelable {
    private int id;
    private String descricao;

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

    public Cor(int id, String descricao) {
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

    public Cor(Parcel in) {
        this.id = in.readInt();
        this.descricao = in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Cor createFromParcel(Parcel in) {
            return new Cor(in);
        }

        public Cor[] newArray(int size) {
            return new Cor[size];
        }
    };
}

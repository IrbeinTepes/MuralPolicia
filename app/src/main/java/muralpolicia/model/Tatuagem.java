package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 11/19/2017.
 */

public class Tatuagem implements Parcelable {

    private int id;
    private String tipoTatuagem;
    private String descricaoTatuagem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoTatuagem() {
        return tipoTatuagem;
    }

    public void setTipoTatuagem(String tipoTatuagem) {
        this.tipoTatuagem = tipoTatuagem;
    }

    public String getDescricaoTatuagem() {
        return descricaoTatuagem;
    }

    public void setDescricaoTatuagem(String descricaoTatuagem) {
        this.descricaoTatuagem = descricaoTatuagem;
    }


    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.tipoTatuagem);
        dest.writeString(this.descricaoTatuagem);
    }

    public Tatuagem(Parcel in) {
        this.id = in.readInt();
        this.tipoTatuagem = in.readString();
        this.descricaoTatuagem = in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Tatuagem createFromParcel(Parcel in) {
            return new Tatuagem(in);
        }

        public Tatuagem[] newArray(int size) {
            return new Tatuagem[size];
        }
    };


}

package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 11/19/2017.
 */

public class Cicatriz implements Parcelable {

    private int id;
    private String tipoCicatriz;
    private String descricaoCicatriz;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoCicatriz() {
        return tipoCicatriz;
    }

    public void setTipoCicatriz(String tipoCicatriz) {
        this.tipoCicatriz = tipoCicatriz;
    }

    public String getDescricaoCicatriz() {
        return descricaoCicatriz;
    }

    public void setDescricaoCicatriz(String descricaoCicatriz) {
        this.descricaoCicatriz = descricaoCicatriz;
    }


    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.tipoCicatriz);
        dest.writeString(this.descricaoCicatriz);
    }

    public Cicatriz(Parcel in) {
        this.id = in.readInt();
        this.tipoCicatriz = in.readString();
        this.descricaoCicatriz = in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Cicatriz createFromParcel(Parcel in) {
            return new Cicatriz(in);
        }

        public Cicatriz[] newArray(int size) {
            return new Cicatriz[size];
        }
    };


}

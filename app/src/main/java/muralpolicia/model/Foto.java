package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Foto implements Parcelable {

    int id;
    Individuo individuo;
    String foto;
    Date fotoData;

    public Foto(int id, Individuo individuo, String foto, Date fotoData) {
        this.id = id;
        this.individuo = individuo;
        this.foto = foto;
        this.fotoData = fotoData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Individuo getIndividuo() {
        return individuo;
    }

    public void setIndividuo(Individuo individuo) {
        this.individuo = individuo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Date getFotoData() {
        return fotoData;
    }

    public void setFotoData(Date fotoData) {
        this.fotoData = fotoData;
    }
    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeParcelable(this.individuo, 0);
        dest.writeString(this.foto);
        dest.writeSerializable(this.fotoData); //convert back to date to read
    }

    public Foto(Parcel in) {
        this.id = in.readInt();
        this.individuo = in.readParcelable(Individuo.class.getClassLoader());
        this.foto = in.readString();
        this.fotoData = (Date) in.readSerializable();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Foto createFromParcel(Parcel in) {
            return new Foto(in);
        }

        public Foto[] newArray(int size) {
            return new Foto[size];
        }
    };


}

package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Foto implements Parcelable {

    private int id;
    private String fotoArq;
    private Date fotoDt;
    private String fotoResp;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFotoArq() {
        return fotoArq;
    }

    public void setFotoArq(String fotoArq) {
        this.fotoArq = fotoArq;
    }

    public Date getFotoData() {
        return fotoDt;
    }

    public void setFotoData(Date fotoData) {
        this.fotoDt = fotoData;
    }
    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.fotoArq);
        dest.writeSerializable(this.fotoDt); //convert back to date to read
    }

    public Foto(int id, String foto, Date fotoData, String fotoResp) {
        this.id = id;
        this.fotoArq = foto;
        this.fotoDt = fotoData;
        this.fotoResp = fotoResp;
    }

    public Foto(Parcel in) {
        this.id = in.readInt();
        this.fotoArq = in.readString();
        this.fotoDt = (Date) in.readSerializable();
        this.fotoResp = in.readString();
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

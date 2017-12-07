package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Cabelo implements Parcelable {
    private int id;
    private  String indcabeloDs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndcabeloDs() {
        return indcabeloDs;
    }

    public void setIndcabeloDs(String indcabeloDs) {
        this.indcabeloDs = indcabeloDs;
    }

    public Cabelo(int id, String indcabeloDs) {
        this.id = id;
        this.indcabeloDs = indcabeloDs;
    }

    @Override
    public String toString() {
        return indcabeloDs;
    }

    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.indcabeloDs);
    }

    public Cabelo(Parcel in) {
        this.id = in.readInt();
        this.indcabeloDs = in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Cabelo createFromParcel(Parcel in) {
            return new Cabelo(in);
        }

        public Cabelo[] newArray(int size) {
            return new Cabelo[size];
        }
    };
}

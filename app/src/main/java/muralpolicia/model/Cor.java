package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Cor implements Parcelable {
    private int id;
    private String indcorDs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndcorDs() {
        return indcorDs;
    }

    public void setIndcorDs(String indcorDs) {
        this.indcorDs = indcorDs;
    }

    public Cor(int id, String indcorDs) {
        this.id = id;
        this.indcorDs = indcorDs;
    }

    @Override
    public String toString() {
        return indcorDs;
    }

    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.indcorDs);
    }

    public Cor(Parcel in) {
        this.id = in.readInt();
        this.indcorDs = in.readString();
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

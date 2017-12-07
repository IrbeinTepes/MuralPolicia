package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Olho implements Parcelable {
    private int id;
    private String indolhosDs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndolhosDs() {
        return indolhosDs;
    }

    public void setIndolhosDs(String indolhosDs) {
        this.indolhosDs = indolhosDs;
    }

    public Olho(int id, String indolhosDs) {

        this.id = id;
        this.indolhosDs = indolhosDs;
    }

    @Override
    public String toString() {
        return indolhosDs;
    }

    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.indolhosDs);
    }

    public Olho(Parcel in) {
        this.id = in.readInt();
        this.indolhosDs = in.readString();
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

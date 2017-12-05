package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 12/4/2017.
 */

public class IndividuoMural implements Parcelable {

    private Integer id;
    private String indmuralDataadd;
    private String indmuralMotivoadd;
    private Individuo indId;
    private User usrId;

    public IndividuoMural(Integer id, String indmuralDataadd, String indmuralMotivoadd, Individuo indId, User usrId) {
        this.id = id;
        this.indmuralDataadd = indmuralDataadd;
        this.indmuralMotivoadd = indmuralMotivoadd;
        this.indId = indId;
        this.usrId = usrId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndmuralDataadd() {
        return indmuralDataadd;
    }

    public void setIndmuralDataadd(String indmuralDataadd) {
        this.indmuralDataadd = indmuralDataadd;
    }

    public String getIndmuralMotivoadd() {
        return indmuralMotivoadd;
    }

    public void setIndmuralMotivoadd(String indmuralMotivoadd) {
        this.indmuralMotivoadd = indmuralMotivoadd;
    }

    public Individuo getIndId() {
        return indId;
    }

    public void setIndId(Individuo indId) {
        this.indId = indId;
    }

    public User getUsrId() {
        return usrId;
    }

    public void setUsrId(User usrId) {
        this.usrId = usrId;
    }

    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.indmuralDataadd);
        dest.writeString(this.indmuralMotivoadd);
        dest.writeParcelable(this.indId, 0);
    }

    public IndividuoMural(Parcel in) {
        this.id = in.readInt();
        this.indmuralDataadd = in.readString();
        this.indmuralMotivoadd = in.readString();
        this.usrId = in.readParcelable(User.class.getClassLoader());
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public IndividuoMural createFromParcel(Parcel in) {
            return new IndividuoMural(in);
        }

        public IndividuoMural[] newArray(int size) {
            return new IndividuoMural[size];
        }
    };

}

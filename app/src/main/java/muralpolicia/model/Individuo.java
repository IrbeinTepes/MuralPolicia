package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;
import java.util.List;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Individuo implements Parcelable {

    private int id;
    private String indNm;
    private String indAlcunha;
    private String indNmMae;
    private boolean indSexo;
    private String indRg;
    private String indRguf;
    private String indCpf;
    private Date indDtnasc;
    private String indFone;
    private Float indAltura;
    private String indTpTatoo;
    private String indDsTatoo;
    private String indTpScar;
    private String indDsScar;
    private String indObs;
    private int logId;
    private Integer logNr;
    private String indComplemento;
    private Date indDt;
    private String indResp;
    private Cabelo indcabeloId;
    private Cor indcorId;
    private Olho indolhosId;
    private List<Foto> inscitFotoCollection;

    public Individuo(int id, String indNm) {
        this.id = id;
        this.indNm = indNm;
    }

    public Individuo(int id, String indNm, String indAlcunha, String indNmMae, boolean indSexo, String indRg, String indRguf, String indCpf, Date indDtnasc, String indFone, Float indAltura, String indTpTatoo, String indDsTatoo, String indTpScar, String indDsScar, String indObs, int logId, Integer logNr, String indComplemento, Date indDt, String indResp, Cabelo indcabeloId, Cor indcorId, Olho indolhosId, List<Foto> inscitFotoCollection) {
        this.id = id;
        this.indNm = indNm;
        this.indAlcunha = indAlcunha;
        this.indNmMae = indNmMae;
        this.indSexo = indSexo;
        this.indRg = indRg;
        this.indRguf = indRguf;
        this.indCpf = indCpf;
        this.indDtnasc = indDtnasc;
        this.indFone = indFone;
        this.indAltura = indAltura;
        this.indTpTatoo = indTpTatoo;
        this.indDsTatoo = indDsTatoo;
        this.indTpScar = indTpScar;
        this.indDsScar = indDsScar;
        this.indObs = indObs;
        this.logId = logId;
        this.logNr = logNr;
        this.indComplemento = indComplemento;
        this.indDt = indDt;
        this.indResp = indResp;
        this.indcabeloId = indcabeloId;
        this.indcorId = indcorId;
        this.indolhosId = indolhosId;
        this.inscitFotoCollection = inscitFotoCollection;
    }

    public Individuo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndNm() {
        return indNm;
    }

    public void setIndNm(String indNm) {
        this.indNm = indNm;
    }

    public String getIndAlcunha() {
        return indAlcunha;
    }

    public void setIndAlcunha(String indAlcunha) {
        this.indAlcunha = indAlcunha;
    }

    public String getIndNmMae() {
        return indNmMae;
    }

    public void setIndNmMae(String indNmMae) {
        this.indNmMae = indNmMae;
    }

    public boolean isIndSexo() {
        return indSexo;
    }

    public void setIndSexo(boolean indSexo) {
        this.indSexo = indSexo;
    }

    public String getIndRg() {
        return indRg;
    }

    public void setIndRg(String indRg) {
        this.indRg = indRg;
    }

    public String getIndRguf() {
        return indRguf;
    }

    public void setIndRguf(String indRguf) {
        this.indRguf = indRguf;
    }

    public String getIndCpf() {
        return indCpf;
    }

    public void setIndCpf(String indCpf) {
        this.indCpf = indCpf;
    }

    public Date getIndDtnasc() {
        return indDtnasc;
    }

    public void setIndDtnasc(Date indDtnasc) {
        this.indDtnasc = indDtnasc;
    }

    public String getIndFone() {
        return indFone;
    }

    public void setIndFone(String indFone) {
        this.indFone = indFone;
    }

    public Float getIndAltura() {
        return indAltura;
    }

    public void setIndAltura(Float indAltura) {
        this.indAltura = indAltura;
    }

    public String getIndTpTatoo() {
        return indTpTatoo;
    }

    public void setIndTpTatoo(String indTpTatoo) {
        this.indTpTatoo = indTpTatoo;
    }

    public String getIndDsTatoo() {
        return indDsTatoo;
    }

    public void setIndDsTatoo(String indDsTatoo) {
        this.indDsTatoo = indDsTatoo;
    }

    public String getIndTpScar() {
        return indTpScar;
    }

    public void setIndTpScar(String indTpScar) {
        this.indTpScar = indTpScar;
    }

    public String getIndDsScar() {
        return indDsScar;
    }

    public void setIndDsScar(String indDsScar) {
        this.indDsScar = indDsScar;
    }

    public String getIndObs() {
        return indObs;
    }

    public void setIndObs(String indObs) {
        this.indObs = indObs;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public Integer getLogNr() {
        return logNr;
    }

    public void setLogNr(Integer logNr) {
        this.logNr = logNr;
    }

    public String getIndComplemento() {
        return indComplemento;
    }

    public void setIndComplemento(String indComplemento) {
        this.indComplemento = indComplemento;
    }

    public Date getIndDt() {
        return indDt;
    }

    public void setIndDt(Date indDt) {
        this.indDt = indDt;
    }

    public String getIndResp() {
        return indResp;
    }

    public void setIndResp(String indResp) {
        this.indResp = indResp;
    }

    public Cabelo getIndcabeloId() {
        return indcabeloId;
    }

    public void setIndcabeloId(Cabelo indcabeloId) {
        this.indcabeloId = indcabeloId;
    }

    public Cor getIndcorId() {
        return indcorId;
    }

    public void setIndcorId(Cor indcorId) {
        this.indcorId = indcorId;
    }

    public Olho getIndolhosId() {
        return indolhosId;
    }

    public void setIndolhosId(Olho indolhosId) {
        this.indolhosId = indolhosId;
    }

    public static Creator getCREATOR() {
        return CREATOR;
    }

    public List<Foto> getInscitFotoCollection() {
        return inscitFotoCollection;
    }

    public void setInscitFotoCollection(List<Foto> inscitFotoCollection) {
        this.inscitFotoCollection = inscitFotoCollection;
    }
    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.indNm);
        dest.writeString(this.indAlcunha);
        dest.writeString(this.indNmMae);
        dest.writeByte((byte)(this.indSexo ? 1 : 0));
        dest.writeString(this.indRg);
        dest.writeString(this.indRguf);
        dest.writeString(this.indCpf);
        dest.writeSerializable(this.indDtnasc);
        dest.writeString(this.indFone);
        dest.writeFloat(this.indAltura);
        dest.writeString(this.indTpTatoo);
        dest.writeString(this.indDsTatoo);
        dest.writeString(this.indTpScar);
        dest.writeString(this.indDsScar);
        dest.writeString(this.indObs);
        dest.writeInt(this.logId);
        dest.writeInt(this.logNr);
        dest.writeString(this.indComplemento);
        dest.writeSerializable(this.indDt);
        dest.writeString(this.indResp);
        dest.writeParcelable(this.indcabeloId, 0);
        dest.writeParcelable(this.indcorId, 0);
        dest.writeParcelable(this.indolhosId, 0);
        dest.writeTypedList(this.inscitFotoCollection);
    }

    public Individuo(Parcel in) {
        this.id = in.readInt();
        this.indNm = in.readString();
        this.indAlcunha= in.readString();
        this.indNmMae= in.readString();
        this.indSexo= in.readByte() != 0;
        this.indRg= in.readString();
        this.indRguf =in.readString();
        this.indCpf= in.readString();
        this.indDtnasc =  (java.util.Date) in.readSerializable();
        this.indFone= in.readString();
        this.indAltura=in.readFloat();
        this.indTpTatoo= in.readString();
        this.indDsTatoo =in.readString();
        this.indTpScar =in.readString();
        this.indDsScar =in.readString();
        this.indObs= in.readString();
        this.logId= in.readInt();
        this.logNr = in.readInt();
        this.indComplemento= in.readString();
        this.indDt =  (java.util.Date) in.readSerializable();
        this.indResp= in.readString();
        this.indcabeloId = in.readParcelable(Cabelo.class.getClassLoader());
        this.indcorId = in.readParcelable(Cor.class.getClassLoader());
        this.indolhosId = in.readParcelable(Olho.class.getClassLoader());
        in.readTypedList(this.inscitFotoCollection,Foto.CREATOR);
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Individuo createFromParcel(Parcel in) {
            return new Individuo(in);
        }

        public Individuo[] newArray(int size) {
            return new Individuo[size];
        }
    };


}

package muralpolicia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class Individuo implements Parcelable {

    int id;
    String nome;
    String alcunha;
    String nomeMae;
    Foto foto;
    Cabelo cabelo;
    Cor cor;
    Olho olho;
    String tipoTatoo;
    String descricaoTatoo;

    public Individuo(int id, String nome, String alcunha, String nomeMae, Foto foto, Cabelo cabelo, Cor cor, Olho olho, String tipoTatoo, String descricaoTatoo) {
        this.id = id;
        this.nome = nome;
        this.alcunha = alcunha;
        this.nomeMae = nomeMae;
        this.foto = foto;
        this.cabelo = cabelo;
        this.cor = cor;
        this.olho = olho;
        this.tipoTatoo = tipoTatoo;
        this.descricaoTatoo = descricaoTatoo;
    }

    public Individuo(int id, String nome, Foto foto) {
        this.id = id;
        this.nome = nome;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlcunha() {
        return alcunha;
    }

    public void setAlcunha(String alcunha) {
        this.alcunha = alcunha;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Cabelo getCabelo() {
        return cabelo;
    }

    public void setCabelo(Cabelo cabelo) {
        this.cabelo = cabelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Olho getOlho() {
        return olho;
    }

    public void setOlho(Olho olho) {
        this.olho = olho;
    }

    public String getTipoTatoo() {
        return tipoTatoo;
    }

    public void setTipoTatoo(String tipoTatoo) {
        this.tipoTatoo = tipoTatoo;
    }

    public String getDescricaoTatoo() {
        return descricaoTatoo;
    }

    public void setDescricaoTatoo(String descricaoTatoo) {
        this.descricaoTatoo = descricaoTatoo;
    }
    //Parcelable Things

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nome);
        dest.writeString(this.alcunha);
        dest.writeString(this.nomeMae);
        dest.writeParcelable(this.foto, 0);
        dest.writeParcelable(this.cabelo, 0);
        dest.writeParcelable(this.cor, 0);
        dest.writeParcelable(this.olho, 0);
        dest.writeString(this.tipoTatoo);
        dest.writeString(this.descricaoTatoo);
    }

    public Individuo(Parcel in) {
        this.id = in.readInt();
        this.nome = in.readString();
        this.alcunha = in.readString();
        this.nomeMae = in.readString();
        this.foto = in.readParcelable(Foto.class.getClassLoader());
        this.cabelo = in.readParcelable(Cabelo.class.getClassLoader());
        this.cor = in.readParcelable(Cor.class.getClassLoader());
        this.olho = in.readParcelable(Olho.class.getClassLoader());
        this.tipoTatoo = in.readString();
        this.descricaoTatoo = in.readString();
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

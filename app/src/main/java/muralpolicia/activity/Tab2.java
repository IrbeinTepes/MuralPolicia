package muralpolicia.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import muralpolicia.model.Foto;
import muralpolicia.model.Individuo;

/**
 * Created by IrbeinTepes on 26/09/2017.
 */

public class Tab2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);

        //grid
        final List<Individuo> listaIndividuosTeste = new ArrayList<>();
        listaIndividuosTeste.add(new Individuo(1,"nome1",new Foto(1,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(2,"nome1",new Foto(2,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(3,"nome1",new Foto(3,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(4,"nome1",new Foto(4,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(5,"nome1",new Foto(5,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(6,"nome1",new Foto(6,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(7,"nome1",new Foto(7,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(8,"nome1",new Foto(8,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));

        PesquisaGrid adapter = new PesquisaGrid(getActivity(), listaIndividuosTeste);

        GridView grid = rootView.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " +listaIndividuosTeste.get(position).getId(), Toast.LENGTH_SHORT).show();
                ((ViewPager)container).setCurrentItem(1);
            }
        });

        return rootView;
    }

}
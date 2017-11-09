package muralpolicia.activities;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import muralpolicia.model.Individuo;

/**
 * Created by IrbeinTepes on 11/8/2017.
 */

public class PesquisaGrid extends GenericGrid {

    public PesquisaGrid(Context c, List lista) {
        super(c, lista);
    }

    @Override
    protected void makeItem(View grid, int position) {
        //            TextView textView = grid.findViewById(R.id.grid_text);
        ImageView imageView = grid.findViewById(R.id.grid_image);
//            textView.setText(listaIndividuos.get(position).getNome());
        //imageView.setImageResource(listaIndividuos.get(position).getFoto().getId());

        Picasso.with(getContext()).load(((Individuo)getLista().get(position)).getFoto().getFoto()).fit().into(imageView);
//            Picasso.with(mContext).load("http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg").fit().into(imageView);
    }
}

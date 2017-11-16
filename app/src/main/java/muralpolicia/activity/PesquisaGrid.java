package muralpolicia.activity;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import muralpolicia.model.Individuo;

/**
 * Created by IrbeinTepes on 11/8/2017.
 */

public class PesquisaGrid extends GenericGrid {

    public PesquisaGrid(Context c, List lista, int layout) {
        super(c, lista,layout);
    }

    @Override
    protected void makeItem(View grid, int position) {
        TextView textView = grid.findViewById(R.id.grid_text);
        textView.setText(((Individuo)getLista().get(position)).getNome().toString());

    }
}

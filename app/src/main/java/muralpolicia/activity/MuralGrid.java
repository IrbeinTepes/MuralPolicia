package muralpolicia.activity;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import muralpolicia.model.IndividuoMural;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class MuralGrid extends GenericGrid {

    public MuralGrid(Context c, List lista, int layout) {
        super(c, lista,layout);
    }

    @Override
        protected void makeItem(View grid, int position) {
            ImageView imageView = grid.findViewById(R.id.grid_image);
            Picasso.with(getContext()).load(((IndividuoMural)getLista().get(position)).getIndId().getInscitFotoCollection().get(0).getFotoArq()).centerCrop().fit().into(imageView);
        }

}


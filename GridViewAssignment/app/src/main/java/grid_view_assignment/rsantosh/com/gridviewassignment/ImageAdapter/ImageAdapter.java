package grid_view_assignment.rsantosh.com.gridviewassignment.ImageAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import grid_view_assignment.rsantosh.com.gridviewassignment.R;

/**
 * Created by R.Santosh on 13-05-2016.
 */
public class ImageAdapter extends BaseAdapter{

    //Declaration of variables.
    private Context mContext;
    private int[] mResource;
    private LayoutInflater mLayoutInflater;

    //Constructor.
    public ImageAdapter(Context mContext, int Resource, int[] mResource) {
        this.mContext = mContext;
        this.mResource = mResource;
        this.mLayoutInflater = mLayoutInflater.from(mContext);

    }



    //Getting the size of Array list.
    @Override
    public int getCount() {
        return mResource.length;
    }

    //Getting the position of the array list.
    @Override
    public Object getItem(int position) {
        return mResource[position];
    }

    //Getting the item ID.
    @Override
    public long getItemId(int i) {
        return 0;
    }

    //Getting the display.
    @Override
    public View getView(int position, View Convertview, ViewGroup parent) {

        //Checking for the null value of the convert view.
        if(Convertview==null) {

            Convertview = mLayoutInflater.inflate(R.layout.item_grid_vew, parent, false);

        }

        //Declaring and initialisation of the image view.
        ImageView imageView = (ImageView) Convertview.findViewById(R.id.image_display);

        //ImageGrid image = new ImageGrid(mResource[position]);

        imageView.setImageResource(mResource[position]);


        //Returning the convert view value.
        return Convertview;
    }
}

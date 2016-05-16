package grid_view_assignment.rsantosh.com.gridviewassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import grid_view_assignment.rsantosh.com.gridviewassignment.ImageAdapter.ImageAdapter;

public class GridViewAssignment extends AppCompatActivity{

    //Declaration of the variables.
    private int[] mImageResource = {R.drawable.gingerbread1,R.drawable.honeycomb1,R.drawable.icecreamsandwich,R.drawable.jellybean,R.drawable.kitkat, R.drawable.lollipop1};
    private ImageAdapter ImgAdapter;
    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_assignment);

        //Initialiasation of variables.
        ImgAdapter = new ImageAdapter(getApplicationContext(),R.layout.item_grid_vew, mImageResource);
        mGridView = (GridView) findViewById(R.id.grid_view_assignment);
        mGridView.setAdapter(ImgAdapter);


    }


}

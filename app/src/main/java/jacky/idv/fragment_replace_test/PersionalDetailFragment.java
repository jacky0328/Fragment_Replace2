package jacky.idv.fragment_replace_test;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jacky on 2016/9/26.
 */
public class PersionalDetailFragment extends Fragment {

    TextView textView;
    Context thiscontext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        thiscontext = container.getContext();
        View v = inflater.inflate(R.layout.fragment_persionaldetail, container, false);

        textView = (TextView)v.findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                               Toast.makeText(thiscontext, "text onclick", Toast.LENGTH_SHORT).show();

            }
        });


        return v;
    }

}

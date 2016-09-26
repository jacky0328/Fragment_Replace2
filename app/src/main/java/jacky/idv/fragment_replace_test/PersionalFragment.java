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
public class PersionalFragment extends Fragment {

    TextView textView;
    Context thiscontext;
    View v2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_persional, container, false);
      //       v2 =  inflater.inflate(R.layout.activity_main, container, false);
        thiscontext = container.getContext();

        textView = (TextView)v.findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                /*
                MainActivity activity = (MainActivity)getActivity();
                ViewPager viewPager = (ViewPager) v2.findViewById(R.id.viewpager_allstamp);

                ViewPagerAdapter adapter = new ViewPagerAdapter(activity.getSupportFragmentManager());
                adapter.addFragment(new PersionalDetailFragment(), "個人章");
                adapter.addFragment(new CompanyFragment(), "公司章");
                viewPager.setAdapter(adapter);
                adapter.notifyDataSetChanged();
*/
                Toast.makeText(thiscontext, "text onclick", Toast.LENGTH_SHORT).show();

            }
        });

        return v;
    }

}

package id.co.blogspot.diansano.appfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {

    Button btnFragment2;
    TextView tvFragment1, tvFragment2;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        btnFragment2 = getActivity().findViewById(R.id.btnFragment2);
        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    tvFragment1 = getActivity().findViewById(R.id.tvFragment1);
                    String sF1 = tvFragment1.getText().toString();
                    tvFragment2 = getActivity().findViewById(R.id.tvFragment2);

                    tvFragment2.setText(sF1);
                //Toast.makeText(getActivity(), tvFragment1.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

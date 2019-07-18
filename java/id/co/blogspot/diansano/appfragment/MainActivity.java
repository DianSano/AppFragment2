package id.co.blogspot.diansano.appfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();

        int width = displayMetrics.widthPixels;
        int height = displayMetrics.heightPixels;

        if (width > height) {
            Fragment1 f1 = new Fragment1();
            fragmentTransaction.replace(android.R.id.content, f1);
        } else {
            Fragment2 f2 = new Fragment2();
            fragmentTransaction.replace(android.R.id.content, f2);
        }

        fragmentTransaction.commit();*/
    }
}

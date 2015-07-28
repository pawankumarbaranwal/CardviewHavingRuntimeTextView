package testpnr.pnr.android.com.cardview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    LinearLayout mLinearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout=(LinearLayout)findViewById(R.id.mLinearLayout);
        final int N = 10;
        String[] values =getResources().getStringArray(R.array.facilities);
        final TextView[] myTextViews = new TextView[N];

        for (int i = 0; i < values.length; i++) {
            final TextView rowTextView = new TextView(this);
            rowTextView.setText(values[i]);
            mLinearLayout.addView(rowTextView);
            myTextViews[i] = rowTextView;
        }
    }
}

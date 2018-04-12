package www.sakkawy.com.communicatordesignpatternwithmasterdetail;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {

        SecondFragment secondFragment = (SecondFragment)getSupportFragmentManager().findFragmentById(R.id.second_fragment);

        secondFragment.changeText(data);
    }
}

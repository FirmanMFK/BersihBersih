package id.firman.app.cleancode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

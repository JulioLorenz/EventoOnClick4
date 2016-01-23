package br.com.ftec.julio.eventoonclick4;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    private static final String TAG = "FTEC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBotao1(View view) {
        Log.d(TAG, "Clicou no botão 1");
    }

    public void onClickBotao2(View view) {
        Log.d(TAG, "Clicou no botão 2");
    }
}

package org.dync.swipebacklayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
    }

    public void click(View view) {
        if (view.getId() == R.id.button) {
            startActivity(new Intent(MainActivity.this, SecondActivity.class));
        } else {
            startActivityForResult(new Intent(MainActivity.this, ThirdActivity.class), 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String result = data.getStringExtra("result");
        if (requestCode == 1 && resultCode == 0) {
            textView.setText(result);
        }
    }
}

package org.dync.swipebacklayout;

import android.content.Intent;
import android.os.Bundle;

public class ThirdActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    @Override
    public void dothingBeforeFinish() {//这里是你要返回一些数据个启动的那个Activity，你可以在此做操作
        super.dothingBeforeFinish();
        Intent intent = new Intent();
        intent.putExtra("result", "来自ThirdActivity返回的值");
        setResult(0, intent);
    }
}

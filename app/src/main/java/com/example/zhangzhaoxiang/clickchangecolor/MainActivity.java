package com.example.zhangzhaoxiang.clickchangecolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Boolean b_sub_square = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button sub_square = (Button) findViewById(R.id.sub_square);
        sub_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_sub_square) {
                    b_sub_square = true;
                    //设置是否被激活状态，true表示被激活
                  sub_square.setActivated(b_sub_square);
                } else {
                    b_sub_square = false;
                    //设置是否被激活状态，false表示未激活
                    sub_square.setActivated(b_sub_square);
                }

            }
        });
    }
}

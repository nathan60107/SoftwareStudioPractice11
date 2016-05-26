package com.csclab.softwarestudiopractice11;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private Button send;
    private EditText edt;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** To Do:
         * (1) Find the UI element on xml file
         * **/
        send = (Button) findViewById(R.id.button);
        edt = (EditText) findViewById(R.id.textView);

        send.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendName();
            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void sendName() {

        /** To Do:
         * (1) Use intent and Bundle to pass string
         * (2) Change activity to Activity2
         * **/
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Activity2.class);
        Bundle bundle = new Bundle();

        bundle.putString("name", edt.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}

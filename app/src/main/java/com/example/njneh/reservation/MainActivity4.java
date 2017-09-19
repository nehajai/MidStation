package com.example.njneh.reservation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity4 extends Activity {
TextView from;
    TextView to;
    ListView lv1;
    TextView int1;
    Button ok;
    String city1[]={"Jaikota1","Jaikota2","Jaikota3"};
    String city2[]={"Delkota1","Delkota2","Delkota3"};
    String city3[]={"Jaidel1","Jaidel2","Jaidel3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity42);

        int1=(TextView)findViewById(R.id.int1);
        from = (TextView) findViewById(R.id.from);
        to = (TextView) findViewById(R.id.to);
       lv1=(ListView)findViewById(R.id.lv1);
        ok = (Button) findViewById(R.id.ok);

        from.setText(MainActivity.s);
        to.setText(MainActivity3.s3);

        int1.setText("Intermediate Stations Name" );

        if ((MainActivity.s == "Jaipur" && MainActivity3.s3 == "Kota")||
        (MainActivity3.s3 == "Jaipur" && MainActivity.s == "Kota"))
        {
            lv1=(ListView)findViewById(R.id.lv1);
            ArrayAdapter<String> ar= new ArrayAdapter<String>(MainActivity4.this,android.R.layout.simple_list_item_1,city1);
            lv1.setAdapter(ar);
        }


        if ((MainActivity.s == "Jaipur" && MainActivity3.s3 == "Delhi")||
                (MainActivity3.s3 == "Jaipur" && MainActivity.s == "Delhi"))
        {
            lv1=(ListView)findViewById(R.id.lv1);
            ArrayAdapter<String> ar= new ArrayAdapter<String>(MainActivity4.this,android.R.layout.simple_list_item_1,city3);
            lv1.setAdapter(ar);
        }
        if ((MainActivity.s == "Kota" && MainActivity3.s3 == "Delhi")||
                (MainActivity3.s3 == "Kota" && MainActivity.s == "Delhi"))
        {
            lv1=(ListView)findViewById(R.id.lv1);
            ArrayAdapter<String> ar= new ArrayAdapter<String>(MainActivity4.this,android.R.layout.simple_list_item_1,city2);
            lv1.setAdapter(ar);
        }
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

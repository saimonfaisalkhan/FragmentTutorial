package faisal.com.fragmenttutorial;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button fr1;
private Button fr2;
private Button fr3;
FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
        fr1=(Button) findViewById(R.id.mbtn1);
        fr2=(Button) findViewById(R.id.mbtn2);
        fr3=(Button) findViewById(R.id.mbtn3);
        fr1.setOnClickListener(this);
        fr2.setOnClickListener(this);
        fr3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(fr1.getId()==v.getId())
        {
           // Toast.makeText(getBaseContext(),"BTN Clicked!",Toast.LENGTH_LONG).show();
           manager.beginTransaction().replace(R.id.displaylayout,new Fragment1()).commit();
           // manager.beginTransaction().replace(R.id.diplayparent,new Fragment1()).commit();
        }
        else if(fr2.getId()==v.getId())
        {
            manager.beginTransaction().replace(R.id.displaylayout,new Fragment2()).commit();
        }
       else if(fr3.getId()==v.getId())
        {

        }
    }

    public void startNav(View view) {

        Intent intent=new Intent(MainActivity.this,NavActivity.class);
        startActivity(intent);
        finish();
    }
}

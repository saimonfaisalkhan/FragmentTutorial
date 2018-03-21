package faisal.com.fragmenttutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by saimon420420420 on 16/03/2018.
 */

public class Fragment1 extends Fragment implements View.OnClickListener{
    private Button okbtn;
    private EditText inputname;
    private TextView displaytext;
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       view=inflater.inflate(R.layout.layoutfrag1,container,false);

       okbtn=(Button) view.findViewById(R.id.fr1btn);
       inputname=(EditText) view.findViewById(R.id.fr1input);
       displaytext=(TextView) view.findViewById(R.id.fr1display);
       okbtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(okbtn.getId()==v.getId())
        {
            String s=inputname.getText().toString();
            displaytext.setText(s);
            inputname.setText("");
        }

    }
}

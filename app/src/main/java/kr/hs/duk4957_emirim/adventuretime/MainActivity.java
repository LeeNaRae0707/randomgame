package kr.hs.duk4957_emirim.adventuretime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName=(EditText) findViewById(R.id.name);
        mButton =(Button) findViewById(R.id.btn_show_me_the_char);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "싸워요!",Toast.LENGTH_LONG).show();
    }
}


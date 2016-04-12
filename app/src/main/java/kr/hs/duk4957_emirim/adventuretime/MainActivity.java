package kr.hs.duk4957_emirim.adventuretime;

import android.content.Intent;
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
    public void onClick(View v)
    {
        String name=mName.getText().toString();

        try {
            Toast.makeText(this,name+"님의 캐릭터를 불러오는 중입니다...", Toast.LENGTH_LONG).show();
            Intent intent=new Intent(this, ResultActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("age",18);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        } catch(NullPointerException e)
        {
            Toast.makeText(this,"이름을 입력해주세요 XD", Toast.LENGTH_LONG).show();
        }catch(Exception e)
        {
            Toast.makeText(this,"에러가 발생한것 같네요!", Toast.LENGTH_LONG).show();
        }

    }
}


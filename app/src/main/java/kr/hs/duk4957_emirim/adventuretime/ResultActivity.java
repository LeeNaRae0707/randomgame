package kr.hs.duk4957_emirim.adventuretime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreate22 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {
    static String TAG=" 어드벤처타임:Resultivity";
    TextView mResult;
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mResult =(TextView)findViewById(R.id.result);
        mImageView =(ImageView) findViewById(R.id.imageView);
        Log.d(TAG,"텍스트뷰,이미지뷰 연결 성공!");

        Random r= new Random();
        int result=r.nextInt(6);
        Log.d(TAG,"랜덤값 생성! :"+result);

        mImageView.setImageResource(R.drawable.icon10+result);
        //if를 사용해서 랜덤이미지를 발생시켰을때
        /*if(result==0)
        {
            mImageView.setImageResource(R.drawable.icon10);
        }
        else if(result==1)
        {
            mImageView.setImageResource(R.drawable.icon4);
        }
        else if(result==2)
        {
            mImageView.setImageResource(R.drawable.icon5);
        }
        else if(result==3)
        {
            mImageView.setImageResource(R.drawable.icon6);
        }
        else if(result==4)
        {
            mImageView.setImageResource(R.drawable.icon8);
        }
        else if(result==5)
        {
            mImageView.setImageResource(R.drawable.icon9);
        }*/
        //switch 를 이용해서 랜덤이미지를 발생
        /*switch(result)
        {
            case 0:
            {
                mImageView.setImageResource(R.drawable.icon10); break;
            }
            case 1:
            {
                mImageView.setImageResource(R.drawable.icon4); break;
            }
            case 2:
            {
                mImageView.setImageResource(R.drawable.icon5); break;
            }
            case 3:
            {
                mImageView.setImageResource(R.drawable.icon6); break;
            }
            case 4:
            {55fi
                mImageView.setImageResource(R.drawable.icon8); break;
            }
            case 5:
            {
                mImageView.setImageResource(R.drawable.icon9); break;
            }

        }*/
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Log.d(TAG,"인텐트값 읽기<name> :"+name);
        int age=intent.getIntExtra("age",-1);
        Log.d(TAG,"인텐트값 읽기<age> :"+age);
        mResult.setText(name+"님, 당신의 캐릭터입니다!");
    }
}
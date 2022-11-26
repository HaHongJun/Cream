package com.example.cream;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button GameStart, AnswerTry;
    ImageButton CBtn;
    RadioButton Chk1, Chk2, Chk3, Chk4;
    RadioGroup radiogroup;
    int a = 0;
    int trynum = 0;
    int ansnum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GameStart = (Button) findViewById(R.id.GameStartBtn);
        AnswerTry = (Button) findViewById(R.id.AnswerTryBtn);
        CBtn = (ImageButton) findViewById(R.id.CreamBtn);
        radiogroup = (RadioGroup) findViewById(R.id.RG1);
        Chk1 = (RadioButton) findViewById(R.id.ChkBx1);
        Chk2 = (RadioButton) findViewById(R.id.ChkBx2);
        Chk3 = (RadioButton) findViewById(R.id.ChkBx3);
        Chk4 = (RadioButton) findViewById(R.id.ChkBx4);

        GameStart.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                AnswerTry.setVisibility(View.VISIBLE);
                CBtn.setVisibility(View.VISIBLE);
                Chk1.setVisibility(View.VISIBLE);
                Chk2.setVisibility(View.VISIBLE);
                Chk3.setVisibility(View.VISIBLE);
                Chk4.setVisibility(View.VISIBLE);
                return false;
            }
        });

        CBtn.setImageResource(R.drawable.appleone);
        Chk1.setText("포도");
        Chk2.setText("사과");
        Chk3.setText("메론");
        Chk4.setText("토마토");

        CBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                if (trynum == 0) {
                    if (a > 10) {
                        CBtn.setImageResource(R.drawable.appletwo);
                    }
                    if ( a > 24) {
                        CBtn.setImageResource(R.drawable.applethree);
                    }
                }

                else if( trynum == 1) {

                    if (a > 10) {
                        CBtn.setImageResource(R.drawable.chocolatetwo);
                    }

                    if (a > 24) {
                        CBtn.setImageResource(R.drawable.chocolatethree);
                        //Toast.makeText(MainActivity.this, "" + trynum, Toast.LENGTH_SHORT).show();
                    }
                }

                else if( trynum == 2) {

                    if (a > 10) {
                        CBtn.setImageResource(R.drawable.strawberrytwo);
                    }

                    if (a > 24) {
                        CBtn.setImageResource(R.drawable.strawberrythree);
                    }
                }



                else if( trynum == 3) {

                    if (a > 10) {
                        CBtn.setImageResource(R.drawable.macaroontwo);
                    }

                    if (a > 24) {
                        CBtn.setImageResource(R.drawable.macaroonthree);
                    }
                }
            }
        });

        AnswerTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = 0;
                trynum = trynum + 1;
                if (trynum == 1) {
                    //trynum = trynum + 1;
                    if (Chk2.isChecked()) {
                        ansnum++;
                        Toast.makeText(MainActivity.this, " 1번 문제 정답", Toast.LENGTH_SHORT).show();

                        CBtn.setImageResource(R.drawable.chocolateone);
                        Chk1.setText("초콜릿");
                        Chk2.setText("마카롱");
                        Chk3.setText("비스킷");
                        Chk4.setText("사탕");
                        //return false;
                    } else {
                        Toast.makeText(MainActivity.this, "1번 문제 땡", Toast.LENGTH_SHORT).show();

                        CBtn.setImageResource(R.drawable.chocolateone);
                        Chk1.setText("초콜릿");
                        Chk2.setText("마카통");
                        Chk3.setText("비스킷");
                        Chk4.setText("사탕");
                        //return false;
                    }

                }

                if (trynum == 2) {
                    //trynum = trynum + 1;
                    //Toast.makeText(MainActivity.this, "" + trynum, Toast.LENGTH_SHORT).show();
                    if (Chk1.isChecked()) {
                        ansnum++;
                        Toast.makeText(MainActivity.this, "2번 문제정답", Toast.LENGTH_SHORT).show();
                        //trynum++;
                        CBtn.setImageResource(R.drawable.strawberryone);
                        Chk1.setText("수박");
                        Chk2.setText("블루베리");
                        Chk3.setText("딸기");
                        Chk4.setText("포도");
                        //return false;
                    } else {
                        Toast.makeText(MainActivity.this, "2번 문제 땡", Toast.LENGTH_SHORT).show();
                        //trynum++;
                        CBtn.setImageResource(R.drawable.strawberryone);
                        Chk1.setText("수박");
                        Chk2.setText("블루베리");
                        Chk3.setText("딸기");
                        Chk4.setText("포도");
                        //return false;
                    }
                }

                if (trynum == 3) {
                    //trynum = trynum + 1;
                    if (Chk3.isChecked()) {
                        ansnum++;
                        Toast.makeText(MainActivity.this, "3번 문제 정답", Toast.LENGTH_SHORT).show();
                        //trynum++;
                        CBtn.setImageResource(R.drawable.macaroonone);
                        Chk1.setText("빼빼로");
                        Chk2.setText("초코파이");
                        Chk3.setText("사탕");
                        Chk4.setText("마카롱");
                        //return false;
                    } else {
                        Toast.makeText(MainActivity.this, "3번 문제 땡", Toast.LENGTH_SHORT).show();
                        //trynum++;
                        CBtn.setImageResource(R.drawable.macaroonone);
                        Chk1.setText("빼빼로");
                        Chk2.setText("초코파이");
                        Chk3.setText("사탕");
                        Chk4.setText("마카롱");
                        //return false;
                    }
                }

                if (trynum == 4) {
                    //trynum = trynum + 1;
                    if (Chk4.isChecked()) {
                        ansnum++;
                        Toast.makeText(MainActivity.this, "4번 문제 정답", Toast.LENGTH_SHORT).show();
                        //return false;
                    } else {
                        Toast.makeText(MainActivity.this, "4번 문제 땡", Toast.LENGTH_SHORT).show();
                        //return false;
                    }

                    if (ansnum == 1) {
                        Toast.makeText(MainActivity.this, "정답: " + ansnum + ", bad", Toast.LENGTH_SHORT).show();
                        //trynum = trynum + 1;
                        //return false;
                    }

                    if (ansnum <= 3) {
                        Toast.makeText(MainActivity.this, "정답: " + ansnum + ", good", Toast.LENGTH_SHORT).show();
                        //trynum = trynum + 1;
                        //return false;
                    }

                    else {
                        Toast.makeText(MainActivity.this, "정답: " + ansnum + ", perfect", Toast.LENGTH_SHORT).show();
                        //trynum = trynum + 1;
                        //return false;
                    }


                }


            }

        });
    }
}
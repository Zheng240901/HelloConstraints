package com.example.helloconstraints;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    private Button setZeroButton;
    private Button switchCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.show_count);
        setZeroButton = findViewById(R.id.button_zero);
        switchCountButton = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countup(View view) {
        mCount++;
        if(mShowCount !=null)
            mShowCount.setText(Integer.toString(mCount));
        setZeroButton.setBackgroundColor(Color.MAGENTA);

        /*switchCountButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        switchCountButton.setClickable(true);*/
        if(mCount % 2==0)
            //if mCount mod 2 is 0, number is even otherwise odd
            view.setBackgroundColor(Color.BLUE);

        else
            view.setBackgroundColor(Color.GREEN);
    }

    public void setZero(View view)
    {
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));

        setZeroButton.setBackgroundColor(Color.GRAY);
        switchCountButton.setBackgroundColor(Color.BLUE);
    }
}
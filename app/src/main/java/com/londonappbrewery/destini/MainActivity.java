package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private  Button mTopButton;
    private  Button mBottomButton;
    private TextView mStory;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mStory = (TextView) findViewById(R.id.storyTextView);

        mStory.setText(R.string.T1_Story);
        mTopButton.setText(R.string.T1_Ans1);
        mBottomButton.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStory.setText(R.string.T3_Story);
                mTopButton.setText(R.string.T3_Ans1);
                mTopButton.setText(R.string.T3_Ans2);

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStory.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2){
                    mStory.setText(R.string.T4_End);
                }
            }
        });

    }
}
    // Update


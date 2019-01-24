package program.sample.praveen.butterknifeexample;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Praveen John on 24,January,2019
 */

public class MainActivity extends AppCompatActivity {
    /**
     * To use Butterknife and and lambda expressions in your code add the following to your project level gradle
     *         classpath 'com.jakewharton:butterknife-gradle-plugin:8.5.1'
     *         classpath 'me.tatarka:gradle-retrolambda:3.2.0'
     * And add the following to your app level gradle
     *         implementation 'com.jakewharton:butterknife:8.5.1'
     */


    @BindView(R.id.mButton_normal)                  //Binding the Button using butterknife
    Button mButton;
    @BindView(R.id.mTextview_normal)                 //Binding the Text_view using butterknife
    TextView mTextView;
    @BindString(R.string.app_name)                   //Binding the String using butterknife
    String mString;
    
    @BindDrawable(R.drawable.ic_launcher_background) //Binding the drawable using butterknife
    Drawable launcher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * By using Butterknife we can simplify the code like this
         * its not needed to find the view by id as it is already binded
         */

        ButterKnife.bind(this);                      //Butterknife
        /**
         * By using retro_lambda we can use lambda expressions in our code
         */
        mButton.setOnClickListener(e -> updateText());     //retrolambda


    }

    private void updateText() {
        mTextView.setText(mString);;
    }

}

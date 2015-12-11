package example.epic.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by charlesamoss on 12/11/15.
 */
public class SetTime extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        Button button = (Button) findViewById(R.id.mainSetTimeButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Intent intent = new Intent(SetTime.this, CountDown.class);
                startActivity(intent);


                Log.d("click", "hello setTime, this is the on click");
            }
        });
    }
}

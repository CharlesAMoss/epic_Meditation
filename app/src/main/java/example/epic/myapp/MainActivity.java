package example.epic.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
      //  setSupportActionBar(myToolbar);

        Button button = (Button) findViewById(R.id.mainButton);
        final EditText editText = (EditText) findViewById(R.id.nameEditText);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                    Intent intent = new Intent(MainActivity.this, SetTime.class);
                startActivity(intent);


                Log.d("click","hello editText this is the on click");
            }
        });
    }
}

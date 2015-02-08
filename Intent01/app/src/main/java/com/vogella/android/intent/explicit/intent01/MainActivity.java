package com.vogella.android.intent.explicit.intent01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
//        EditText text = (EditText) findViewById(R.id.inputforintent);
//        // used later
//        String value = text.getText().toString();
//        // TODO 1 create new Intent(context, class)
//        // use the activity as context parameter
//        // and "ResultActivity.class" for the class parameter
//        Intent intent = new Intent(this, ResultActivity.class);
//        intent.putExtra("yourKey",value);
//        // TODO 2 start second activity with
////        startActivity(intent);
//        startActivityForResult(intent, 10);
          Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vogella.com"));
          startActivity(intent);
    }

    // TODO 3 Implement this method
    // assumes that "returnkey" is used as key to return the result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == 10) {
            if (data.hasExtra("returnKey")) {
                String result = data.getExtras().getString("returnKey");
                if (result != null && result.length() > 0) {
                    Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}

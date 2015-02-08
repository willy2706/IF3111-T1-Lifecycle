package com.vogella.android.intent.explicit.intent01;

/**
 * Created by WILLY on 2/5/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Intent i = getIntent();
        EditText text = (EditText) findViewById(R.id.returnValue);
        String res = i.getStringExtra("yourKey");
        text.setText(res);
    }

    @Override
    public void finish() {

        // TODO 1 create new Intent
         Intent intent = new Intent();

        // TODO 2 read the data of the EditText field
        // with the id returnValue
        EditText editText = (EditText) findViewById(R.id.returnValue);

        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();
        String value = editText.getText().toString();
        intent.putExtra("returnKey", "yang serius");

        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application
        setResult(RESULT_OK,intent);
        super.finish();
    }
}
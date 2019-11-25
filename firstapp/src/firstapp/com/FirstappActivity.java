package firstapp.com;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstappActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final Button b1 = (Button)findViewById(R.id.button1);
        b1.setText("Click me");
        
        TextView t1 = (TextView)findViewById(R.id.textView1);
        t1.setText("This is TextField 1");
        
        final EditText mEdit = (EditText) findViewById(R.id.editText1);
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.loadUrl("http://www.google.com");
        
        b1.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                    	Log.v("EditText", mEdit.getText().toString());
                    }
                });
    }
    
    public void onClick(WebView v)
    {
    	
    }
    
}
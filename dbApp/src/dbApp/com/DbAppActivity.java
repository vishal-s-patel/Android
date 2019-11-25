package dbApp.com;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DbAppActivity extends Activity {
    /** Called when the activity is first created. */
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b2=(Button)findViewById(R.id.button1);
        final EditText name = (EditText)findViewById(R.id.editText1);
        final EditText age = (EditText)findViewById(R.id.editText2);
        final EditText marks = (EditText)findViewById(R.id.editText3);
        
	    b2.setOnClickListener(new View.OnClickListener(){
	   	public void onClick(View v){  
	   		SQLiteDatabase my;
			my=openOrCreateDatabase("students1.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
			String query="CREATE Table if Not Exists student(name VARCHAR(25),marks Number,age Number)";
			my.execSQL(query);
			ContentValues values=new ContentValues();
			values.put("name",name.getText().toString());
			values.put("age",age.getText().toString());
			values.put("marks",marks.getText().toString());
			        try{
			        	long id=my.insert("student", null, values);
			        	   Toast.makeText(getApplicationContext(),id+"",Toast.LENGTH_LONG ).show();
			 			  
			        }
			        catch(Exception e){
			        	
			        }
			       //    Toast.makeText(getApplicationContext(), "Button Has Clicked", Toast.LENGTH_LONG).show();
			   		  
	    	  }
	    });
    }
}
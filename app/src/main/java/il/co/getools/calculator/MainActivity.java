package il.co.getools.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button plus;
    private Button minus;
    private Button divide;
    private Button multiply;
    private TextView result;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        operand1 = (EditText)findViewById(R.id.editText);
        operand2 = (EditText)findViewById(R.id.editText2);
        plus = (Button)findViewById(R.id.button);
        minus = (Button)findViewById(R.id.button2);
        divide = (Button)findViewById(R.id.button3);
        multiply = (Button)findViewById(R.id.button4);
        result = (TextView)findViewById(R.id.textView3);
        btnClear = (Button)findViewById(R.id.clear);

        btnClear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                operand1.setText("");
                operand2.setText("");
                result.setText("0.0");
                operand1.requestFocus(); 
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operand1.getText().length()>0 && operand2.getText().length()>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double res = oper1 + oper2;
                    result.setText(Double.toString(res));
                }else {
                    Toast.makeText(MainActivity.this,"Please enter numbers in both fields",Toast.LENGTH_LONG).show();
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(operand1.getText().length()>0 && operand2.getText().length()>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double res = oper1 - oper2;
                    result.setText(Double.toString(res));
                }else {
                    Toast.makeText(MainActivity.this,"Please enter numbers in both fields",Toast.LENGTH_LONG).show();
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(operand1.getText().length()>0 && operand2.getText().length()>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double res = oper1 / oper2;
                    result.setText(Double.toString(res));
                }else {
                    Toast.makeText(MainActivity.this,"Please enter numbers in both fields",Toast.LENGTH_LONG).show();
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(operand1.getText().length()>0 && operand2.getText().length()>0) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double res = oper1 * oper2;
                    result.setText(Double.toString(res));
                }else {
                    Toast.makeText(MainActivity.this,"Please enter numbers in both fields",Toast.LENGTH_LONG).show();
                }
            }
        });
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
}

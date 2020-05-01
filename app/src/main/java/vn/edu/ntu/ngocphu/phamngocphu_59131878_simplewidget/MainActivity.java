package vn.edu.ntu.ngocphu.phamngocphu_59131878_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    RadioGroup rg;
    RadioButton rb1, rb2;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    addView();
    addEvents();
    }
    void addView(){
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt3 = findViewById(R.id.edt3);

        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

        bt = findViewById(R.id.bt);
    }
    void addEvents(){
       bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String text ="";
               text += edt1.getText().toString();
               text += "\nNgày sinh: " + edt2.getText().toString();

               switch (rg.getCheckedRadioButtonId()) {
                   case R.id.rb1: text += "\nGiới tính: Nam";break;
                   case R.id.rb2: text += "\nGiới tính: Nữ";break;
               }
               text += "\nSở thích :";
               if (cb1.isChecked()) text += cb1.getText().toString() + ";";
               if (cb2.isChecked()) text += cb2.getText().toString() + ";";
               if (cb3.isChecked()) text += cb3.getText().toString() + ";";
               if (cb4.isChecked()) text += cb4.getText().toString() + ";";
               if (cb5.isChecked()) text += cb5.getText().toString() + ";";
               text += ";" + edt3.getText().toString();
               Toast.makeText(getApplicationContext(),text,Toast.LENGTH_LONG).show();
           }
        });
    }
}

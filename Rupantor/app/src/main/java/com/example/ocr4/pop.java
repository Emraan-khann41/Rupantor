package com.example.ocr4;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pop extends Activity implements View.OnClickListener{

    EditText editfile;
    Button ok;
    Button cancel;
    String filename;
    String image;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_window);

         image =  getIntent().getStringExtra("image");

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8) , (int)(height*.3));

        textedit();

    }
    private void textedit()
    {
        editfile = (EditText) findViewById(R.id.editfile);
        ok =(Button) findViewById(R.id.ok);
        cancel = (Button) findViewById(R.id.cancel);
        ok.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ok:
                filename = editfile.getText().toString();
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                intent.putExtra("filename" , filename);
                intent.putExtra("text" , image);
                startActivity(intent);
                break;
            case R.id.cancel:
                Intent in = new Intent(getApplicationContext(), Main2Activity.class);
               // in.putExtra("filename" , "");
                startActivity(in);
                break;
        }

    }
}

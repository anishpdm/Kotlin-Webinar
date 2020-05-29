package com.anish.linkurcodesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var name=findViewById<EditText>(R.id.uname);
        var pass=findViewById<EditText>(R.id.pass);
        var loginbutton=findViewById<Button>(R.id.loginbut);


        loginbutton.setOnClickListener {


            var getName=name.text.toString()
            var getPass=pass.text.toString()
          Toast.makeText(applicationContext,getName,Toast.LENGTH_LONG).show()
          Toast.makeText(applicationContext,getPass,Toast.LENGTH_LONG).show()

            if(getName.equals("admin")&&getPass.equals("1234"))
            {
                var intent=Intent(applicationContext,Dashboard::class.java)
                startActivity(intent)

            }
            else{
                Toast.makeText(applicationContext,"Invalid Credentials",Toast.LENGTH_LONG).show()

            }


        }




    }
}

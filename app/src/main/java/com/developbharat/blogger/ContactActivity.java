package com.developbharat.blogger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void onBtnSendClick(View view){
        try {


            EditText txtMessage = findViewById(R.id.txtMessage);
            String message = txtMessage.getText().toString();

            if(message.isEmpty()){
                Toast.makeText(getApplicationContext(), "Message cannot be empty", Toast.LENGTH_LONG).show();
                return;
            }

            SmsManager manager = SmsManager.getDefault();

            manager.sendTextMessage("7015108956", null, message, null, null);
            Toast.makeText(getApplicationContext(), "Message Sent", Toast.LENGTH_LONG).show();

        }catch(Exception ex){
            Toast.makeText(getApplicationContext(), ex.getMessage(), Toast.LENGTH_LONG).show();
        }

    }
}

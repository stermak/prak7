package com.example.prak7;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;

public class MainActivity extends AppCompatActivity {

    /*private static final int PICK_CONTACT_REQUEST = 1;

    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Uri web = Uri.parse("https://www.rutube.ru");
        Intent callIntent = new Intent(Intent.ACTION_VIEW, web);
        startActivity(callIntent);

        Uri location = Uri.parse("geo:55.664110, 37.482602");
        Intent callIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(callIntent);
         */
        Uri num = Uri.parse("tel:89032627353");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, num);
        startActivity(callIntent);


        Intent result = new Intent("com.example.RESULT.ACTION", Uri.parse("content://result_uri"));
        setResult(Activity.RESULT_OK,result);
        finish();

    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ( requestCode == PICK_CONTACT_REQUEST ) {
            if (resultCode == RESULT_OK){
                Uri contactUri = data.getData();
                String[] projection = {
                    ContactsContract.CommonDataKinds.Phone.NUMBER};
                Cursor cursor = getContentResolver()
                        .query(contactUri, projection, null , null , null);
                cursor.moveToFirst();
                int column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
                String number = cursor.getString(column);
            }


        }
    }
     */
}
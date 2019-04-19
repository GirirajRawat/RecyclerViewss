package com.yuskay.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailsActivity extends AppCompatActivity {

    CircleImageView circImg;
    TextView tvName,tvPhone,tvEmail,tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        circImg=findViewById(R.id.imgProfile);
        tvName=findViewById(R.id.tvName);
        tvPhone=findViewById(R.id.tvPhone);
        tvAddress=findViewById(R.id.tvAddress);
        tvEmail=findViewById(R.id.tvEmail);


        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            circImg.setImageResource(bundle.getInt("image"));
            tvPhone.setText(bundle.getString("phone"));
            tvName.setText(bundle.getString("name"));
            tvEmail.setText(bundle.getString("email"));
            tvAddress.setText(bundle.getString("address"));
        }

    }
}

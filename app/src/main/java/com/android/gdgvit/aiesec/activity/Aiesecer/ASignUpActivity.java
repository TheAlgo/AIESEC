package com.android.gdgvit.aiesec.activity.Aiesecer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.gdgvit.aiesec.R;
import com.android.gdgvit.aiesec.activity.EP.EPSignUpActivity;
import com.android.gdgvit.aiesec.activity.Main.ActivityLogin;
import com.android.gdgvit.aiesec.model.AiesecSignupResponse;
import com.android.gdgvit.aiesec.model.SignupResponse;
import com.android.gdgvit.aiesec.rest.ApiClient;
import com.android.gdgvit.aiesec.rest.ApiInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ASignUpActivity extends AppCompatActivity {


    EditText aName, aEmail, aPassword, aContactno, aDept;
    Button signup;
    private String BaseUrl = "http://139.59.62.236:8000/aiesec/";
    String name, pass, email, cont, dept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asign_up);


        aName = (EditText) findViewById(R.id.aName);
        aEmail = (EditText) findViewById(R.id.aEmail);
        aPassword = (EditText) findViewById(R.id.aPassword);
        aContactno = (EditText) findViewById(R.id.aContact);
        aDept = (EditText) findViewById(R.id.aDept);
        signup = (Button) findViewById(R.id.abtnSignUp);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = aName.getText().toString();
                pass = aPassword.getText().toString();
                email = aEmail.getText().toString();
                cont = aContactno.getText().toString();
                dept = aDept.getText().toString();


                ApiInterface apiService = ApiClient.getClient(ASignUpActivity.this,BaseUrl).create(ApiInterface.class);
                Call<AiesecSignupResponse> signup = apiService.signupUser(email,pass,name,cont, dept);



                signup.enqueue(new Callback<AiesecSignupResponse>() {
                    @Override
                    public void onResponse(Call<AiesecSignupResponse> call, Response<AiesecSignupResponse> response) {


                        if(response.body().getStatus().toString().equals("not_aiesec_member")){

                            Toast.makeText(ASignUpActivity.this, "Not a member", Toast.LENGTH_SHORT).show();
                        }

                        if (response.body().getStatus().toString().equals("already_a_member")) {

                            Toast.makeText(ASignUpActivity.this, "Already a member", Toast.LENGTH_SHORT).show();
                            Intent in = new Intent(ASignUpActivity.this, ActivityLogin.class);
                            startActivity(in);
                            // Log.d("User_name:",""+response.body().getUser().getName());
                        }
                    }

                    @Override
                    public void onFailure(Call<AiesecSignupResponse> call, Throwable t) {

                    }
                });

            }





        });



        getSupportActionBar().setTitle("Sign Up");




    }

}

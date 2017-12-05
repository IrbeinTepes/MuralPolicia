package muralpolicia.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import muralpolicia.model.User;
import muralpolicia.service.IService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button salvarButton;
    EditText loginEdit;
    EditText passwordEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEdit = (EditText) findViewById(R.id.editText_Login);
        passwordEdit = (EditText) findViewById(R.id.editText_Password);
        loginEdit.setText("admin");
        passwordEdit.setText("admin");
        salvarButton = (Button) findViewById(R.id.button_Salvar);
        salvarButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_Salvar:
                User user;

                //user = LoginBusiness.ValidateLogin(loginEdit.getText().toString(),passwordEdit.getText().toString());
                /*
                if(user != null) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    intent.putExtra("user", LoginBusiness.ValidateLogin(loginEdit.getText().toString(),passwordEdit.getText().toString()));
                    startActivity(intent);
                }
                */
                //Service

                user = new User(loginEdit.getText().toString(),passwordEdit.getText().toString());
                Call<User> userCall = IService.retrofit.create(IService.class).validaLogin(user);
                userCall.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if(response.body() != null) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            intent.putExtra("user", response.body());
                            startActivity(intent);
                        }else{
                            Toast.makeText(getApplicationContext() , "LOGIN OU SENHA INVÁLIDO", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Toast.makeText(getApplicationContext() , "ERRO AO ESTABELECER CONEXÃO", Toast.LENGTH_SHORT).show();
                    }
                });


                break;
        }
    }
}

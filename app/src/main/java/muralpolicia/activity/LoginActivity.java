package muralpolicia.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import muralpolicia.business.LoginBusiness;
import muralpolicia.model.User;

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
                User user = LoginBusiness.ValidateLogin(loginEdit.getText().toString(),passwordEdit.getText().toString());
                if(user != null) {
                    Intent intent = new Intent(this, MainActivity.class);
                    intent.putExtra("user", user);
                    startActivity(intent);
                }
                break;
        }
    }
}

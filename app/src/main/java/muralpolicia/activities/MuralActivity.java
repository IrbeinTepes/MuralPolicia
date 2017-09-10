package muralpolicia.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import muralpolicia.model.User;

public class MuralActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mural);
        User user = (User) getIntent().getExtras().getParcelable("user");
        Toast.makeText(this, "USER: "+user.getLogin() + "\n André é bixa", Toast.LENGTH_LONG).show();
    }
}

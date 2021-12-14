package Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvp.R;

public class MainActivity extends AppCompatActivity  implements Actorview{
    ActorPresenter presenter=new ActorPresenter(this);
    Button GetButton;
    TextView Name_textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetButton =findViewById(R.id .get);
        Name_textView=findViewById(R.id.textView);
        GetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.GetActorName();
            }
        });






    }

    @Override
    public void OnGetActorName(String Actor) {
        Name_textView.setText(Actor);

    }
}
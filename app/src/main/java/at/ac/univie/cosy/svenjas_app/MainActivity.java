package at.ac.univie.cosy.svenjas_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String studentLabel = getString(R.string.label_student);
        studentLabel = String.format(studentLabel, "Hamlet Mkrtchyan");

        String matrikelNummerLabel = getString(R.string.label_MatricelNummer);
        matrikelNummerLabel = String.format(matrikelNummerLabel, "1468003");

        TextView studentTextView = (TextView) findViewById(R.id.label_Student);
        studentTextView.setText(studentLabel);

        TextView matrikelNummerTextView = (TextView) findViewById(R.id.label_matrikelNummer);
        matrikelNummerTextView.setText(matrikelNummerLabel);
    }
}

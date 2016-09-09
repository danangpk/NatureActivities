package id.sch.smktelkom_mlg.tugas01.xirpl5009.pendaftarankegiatanalam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etND, etNB;
    RadioGroup rgJK;
    Spinner sK;
    CheckBox cbMG, cbPT, cbCV, cbSK, cbRF, cbSV;
    Button bD;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etND = (EditText) findViewById(R.id.editTextND);
        etNB = (EditText) findViewById(R.id.editTextNB);

        rgJK = (RadioGroup) findViewById(R.id.radioGroupJK);

        sK = (Spinner) findViewById(R.id.spinnerK);

        cbMG = (CheckBox) findViewById(R.id.checkBoxMG);
        cbPT = (CheckBox) findViewById(R.id.checkBoxPT);
        cbCV = (CheckBox) findViewById(R.id.checkBoxCV);
        cbSK = (CheckBox) findViewById(R.id.checkBoxSK);
        cbRF = (CheckBox) findViewById(R.id.checkBoxRF);
        cbSV = (CheckBox) findViewById(R.id.checkBoxSV);

        bD = (Button) findViewById(R.id.buttonD);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);
    }
}

package id.sch.smktelkom_mlg.tugas01.xirpl5009.pendaftarankegiatanalam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etND, etNB;
    RadioButton rbL, rbP;
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

        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        rbP = (RadioButton) findViewById(R.id.radioButtonP);

        sK = (Spinner) findViewById(R.id.spinnerK);

        cbMG = (CheckBox) findViewById(R.id.checkBoxMG);
        cbPT = (CheckBox) findViewById(R.id.checkBoxPT);
        cbCV = (CheckBox) findViewById(R.id.checkBoxCV);
        cbSK = (CheckBox) findViewById(R.id.checkBoxSK);
        cbRF = (CheckBox) findViewById(R.id.checkBoxRF);
        cbSV = (CheckBox) findViewById(R.id.checkBoxSV);

        bD = (Button) findViewById(R.id.buttonD);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isValid()) ;

                String nama = etND.getText().toString();
                String nama1 = etNB.getText().toString();

                String hsl1 = null;
                if (rbL.isChecked()) {
                    hsl1 = rbL.getText().toString();
                } else if (rbP.isChecked()) {
                    hsl1 = rbL.getText().toString();
                }

                String wishact = sK.getSelectedItem().toString();

                String hsl2 = "Kegiatan yang Pernah Anda Lakukan :\n";
                int startlen = hsl2.length();
                if (cbMG.isChecked()) hsl2 += cbMG.getText() + "\n";
                if (cbPT.isChecked()) hsl2 += cbPT.getText() + "\n";
                if (cbCV.isChecked()) hsl2 += cbCV.getText() + "\n";
                if (cbSK.isChecked()) hsl2 += cbSK.getText() + "\n";
                if (cbRF.isChecked()) hsl2 += cbRF.getText() + "\n";
                if (cbSV.isChecked()) hsl2 += cbSV.getText() + "\n";
                if (hsl2.length() == startlen) hsl2 += "Belum Pernah Melakukan Kegiatan";

                tvHasil.setText("Nama Depan :\n" + nama + "\n\nNama Belakang : \n" + nama1 + "\n\nJenis Kelamim : \n" + hsl1 + "\n\n Kegiatan yang Pernah Anda Ikuti : \n" + wishact + "\n\n" + hsl2);
            }
        });
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etND.getText().toString();
        String nama1 = etNB.getText().toString();

        if (nama.isEmpty()) {
            etND.setError("Anda Belum Mengisi Nama Depan");
        }

        if (nama1.isEmpty()) {
            etNB.setError("Anda Belum Mengisi Nama Depan");
        }

        return valid;
    }
}

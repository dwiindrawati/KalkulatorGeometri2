package ins.kalkulatorgeometri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnHitung(View view) {
        Spinner bangun= (Spinner) findViewById(R.id.spinnerr);
        EditText inp1 = (EditText) findViewById(R.id.input_1);
        EditText inp2 = (EditText) findViewById(R.id.input_2);
        TextView luas = (TextView) findViewById(R.id.hasilluas);
        TextView kel = (TextView) findViewById(R.id.hasilkeliling);


        String angka1=inp1.getText().toString();
        String angka2=inp2.getText().toString();
        int i1=Integer.parseInt(angka1);
        int i2=Integer.parseInt(angka2);

        if(bangun.getSelectedItem().toString().equals("Persegi")) {
            int hasilluas=i1*i2;
            String hasill=String.valueOf(hasilluas);
            luas.setText(hasill);

            int hasilkeliling=(2*i1)+(2*i2);
            String hasill2=String.valueOf(hasilkeliling);
            kel.setText(hasill2);
        }

        else if (bangun.getSelectedItem().toString().equals("Lingkaran")){
            double pi = Math.PI;


            double hasilluas= pi*(i1*i1);
            String hasill=String.valueOf(hasilluas);
            luas.setText(hasill);

            double hasilkeliling= pi*(2*i1);
            String hasill2=String.valueOf(hasilkeliling);
            kel.setText(hasill2);
        }

        else if (bangun.getSelectedItem().toString().equals("Segitiga")){
            double hasilluas= (i1*i2)/2;
            String hasill=String.valueOf(hasilluas);
            luas.setText(hasill);

            double sqrt = (float) Math.sqrt((i1*i1)+(i2*i2));
            double hasilkeliling= i1+i2+sqrt;
            String hasill2=String.valueOf(hasilkeliling);
            kel.setText(hasill2);



        }

    }
}

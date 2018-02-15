package curcon.promact.com.currencyconvertorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity
{

    EditText RUB;
    TextView INR;
    TextView USD;
    TextView RIG;
    TextView DIN;
    TextView HUN;
    TextView JAP;
    TextView SWI;
    ImageButton sub;
    ImageButton sub1;
    ImageButton sub2;
    ImageButton sub3;
    ImageButton sub4;
    ImageButton sub5;
    ImageButton sub6;
    ImageButton sub7;
    double rub,inr,usd,rig,din,hun,jap,swi;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub =  findViewById(R.id.btnSubmit);
        sub1 = findViewById(R.id.btnSubmit1);
        sub2 = findViewById(R.id.btnSubmit2);
        sub3 = findViewById(R.id.btnSubmit3);
        sub4 = findViewById(R.id.btnSubmit4);
        sub5 = findViewById(R.id.btnSubmit5);
        sub6 = findViewById(R.id.btnSubmit6);
        sub7 = findViewById(R.id.btnSubmit7);



        RUB = findViewById(R.id.editText1);
        INR = findViewById(R.id.editText2);
        USD = findViewById(R.id.editText3);
        RIG = findViewById(R.id.editText4);
        DIN = findViewById(R.id.editText5);
        HUN = findViewById(R.id.editText6);
        JAP = findViewById(R.id.editText7);
        SWI = findViewById(R.id.editText8);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (RUB.getText().toString().equals("")) {
                    // sub.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Enter Any Amount", Toast.LENGTH_SHORT).show();

                } else {
                    double r = Double.parseDouble(RUB.getText().toString());
                     inr = r * 1.11;
                     usd = r * 0.017;
                     rig = r * 0.068;
                     din = r * 0.006;
                     hun = r * 4.370;
                     jap = r * 1.89;
                     swi = r * 0.016;

                    INR.setText(inr + "");
                    USD.setText(usd + "");
                    RIG.setText(rig + "");
                    DIN.setText(din + "");
                    HUN.setText(hun + "");
                    JAP.setText(jap + "");
                    SWI.setText(swi + "");
                }
            }
        });
        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (INR.getText().toString().equals("")) {
                    // sub.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Enter Any Amount", Toast.LENGTH_SHORT).show();

                } else {
                    double i = Double.parseDouble(INR.getText().toString());
                    rub = i*  0.8941;
                    usd = i * 0.0155;
                    rig = i * 0.0608;
                    din = i * 0.0058;
                    hun = i * 3.9019;
                    jap = i * 1.6932;
                    swi = i * 0.0145;

                    RUB.setText(rub + "");
                    USD.setText(usd + "");
                    RIG.setText(rig + "");
                    DIN.setText(din + "");
                    HUN.setText(hun + "");
                    JAP.setText(jap + "");
                    SWI.setText(swi + "");
                }
            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (USD.getText().toString().equals("")) {
                    // sub.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Enter Any Amount", Toast.LENGTH_SHORT).show();

                } else {
                    double u = Double.parseDouble(USD.getText().toString());
                    rub = u * 57.4481;
                    inr = u * 64.2903;
                    rig = u * 3.9126;
                    din = u * .0376;
                    hun = u * 250.2708;
                    jap = u * 108.9071;
                    swi = u * 0.9339;

                    RUB.setText(rub + "");
                    INR.setText(inr + "");
                    RIG.setText(rig + "");
                    DIN.setText(din + "");
                    HUN.setText(hun + "");
                    JAP.setText(jap + "");
                    SWI.setText(swi + "");
                }
            }
        });


        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (RIG.getText().toString().equals("")) {
                    // sub.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Enter Any Amount", Toast.LENGTH_SHORT).show();

                } else {
                    double rin = Double.parseDouble(RIG.getText().toString());
                    rub = rin*  14.6633;
                    usd = rin * 0.2555;
                    inr = rin * 16.4344;
                    din = rin * 0.0961;
                    hun = rin * 64.1226;
                    jap = rin * 27.8328;
                    swi = rin * 0.2388;

                    RUB.setText(rub + "");
                    INR.setText(inr + "");
                    USD.setText(usd + "");
                    DIN.setText(din + "");
                    HUN.setText(hun + "");
                    JAP.setText(jap + "");
                    SWI.setText(swi + "");
                }
            }
        });

        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (DIN.getText().toString().equals("")) {
                    // sub.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Enter Any Amount", Toast.LENGTH_SHORT).show();

                } else {
                    double d = Double.parseDouble(DIN.getText().toString());
                    rub = d * 152.6186;
                    usd = d * 2.6595;
                    rig = d * 10.4095;
                    inr = d * 170.895;
                    hun = d * 666.9613;
                    jap = d * 289.5963;
                    swi = d * 2.4839;

                    RUB.setText(rub + "");
                    USD.setText(usd + "");
                    RIG.setText(rig + "");
                    INR.setText(inr + "");
                    HUN.setText(hun + "");
                    JAP.setText(jap + "");
                    SWI.setText(swi + "");
                }
            }
        });

        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (HUN.getText().toString().equals("")) {
                    // sub.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Enter Any Amount", Toast.LENGTH_SHORT).show();

                } else {
                    double h = Double.parseDouble(HUN.getText().toString());
                    rub = h * 0.2288;
                    usd = h * 0.0032;
                    rig = h * 0.0156;
                    din = h * 0.0014;
                    inr = h * 0.2561;
                    jap = h * 0.4344;
                    swi = h * 0.0037;

                    RUB.setText(rub + "");
                    USD.setText(usd + "");
                    RIG.setText(rig + "");
                    DIN.setText(din + "");
                    INR.setText(inr + "");
                    JAP.setText(jap + "");
                    SWI.setText(swi + "");
                }
            }
        });

        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (JAP.getText().toString().equals("")) {
                    // sub.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Enter Any Amount", Toast.LENGTH_SHORT).show();

                } else {
                    double j = Double.parseDouble(JAP.getText().toString());
                    rub = j * 0.5221;
                    usd = j * 0.0091;
                    rig = j * 0.0358;
                    din = j * 0.0034;
                    hun = j * 2.2851;
                    inr = j * 0.587;
                    swi = j * 0.0085;

                    RUB.setText(rub + "");
                    USD.setText(usd + "");
                    RIG.setText(rig + "");
                    DIN.setText(din + "");
                    HUN.setText(hun + "");
                    INR.setText(inr + "");
                    SWI.setText(swi + "");
                }
            }
        });

        sub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (SWI.getText().toString().equals("")) {
                    // sub.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Enter Any Amount", Toast.LENGTH_SHORT).show();

                } else {
                    double s = Double.parseDouble(SWI.getText().toString());
                    rub = s * 61.2213;
                    usd = s * 1.0706;
                    rig = s * 4.1875;
                    din = s * 0.4025;
                    hun = s * 267.7758;
                    jap = s * 116.6162;
                    inr = s * 68.7123;

                    RUB.setText(rub + "");
                    USD.setText(usd + "");
                    RIG.setText(rig + "");
                    DIN.setText(din + "");
                    HUN.setText(hun + "");
                    JAP.setText(jap + "");
                    INR.setText(inr + "");
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RUB.setText(String.valueOf(""));
        INR.setText(String.valueOf(""));
        USD.setText(String.valueOf(""));
        RIG.setText(String.valueOf(""));
        DIN.setText(String.valueOf(""));
        HUN.setText(String.valueOf(""));
        JAP.setText(String.valueOf(""));
        SWI.setText(String.valueOf(""));
        return true;
    }
}

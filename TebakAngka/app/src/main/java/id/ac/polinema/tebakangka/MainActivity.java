package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	private int number;
	private EditText numberInput;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
        numberInput = findViewById(R.id.number_input);
        initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
        Random rand = new Random();
        int r = rand.nextInt(50);
        number = r;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
        String angka = numberInput.getText().toString();
        int input = Integer.parseInt(angka);

        if(input == number){
            Toast.makeText(this, "Tebakan anda benar!", Toast.LENGTH_SHORT).show();
        }
        else if(input < number ){
            Toast.makeText(this, "Tebakan anda terlalu besar!", Toast.LENGTH_SHORT).show();
        }
        else if(input > number){
            Toast.makeText(this, "Tebakan anda terlalu kecil!", Toast.LENGTH_SHORT).show();
        }
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
        numberInput.setText("");
        initRandomNumber();
	}
}

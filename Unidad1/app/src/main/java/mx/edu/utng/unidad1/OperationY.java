package mx.edu.utng.unidad1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jorge on 19/01/2017.
 */
public class OperationY extends AppCompatActivity {
    private EditText edtY;
    private Button btnCalculateY;
    private TextView txvResultY;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operation_y_main);
        edtY=(EditText)findViewById(R.id.edt_y);
        btnCalculateY=(Button)findViewById(R.id.btn_calculate_y);
        txvResultY=(TextView)findViewById(R.id.txv_result_y);


        btnCalculateY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float y= Float.parseFloat(edtY.getText().toString());
                float resultY = 0;

                resultY = (y*y-2)*(y*y+2);

                txvResultY.setText(""+resultY);
            }
        });
    }
}

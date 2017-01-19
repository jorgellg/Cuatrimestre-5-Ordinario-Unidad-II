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
public class OperationX extends AppCompatActivity {

    private EditText edtX;
    private Button btnCalculateX;
    private TextView txvResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operation_x_main);
        edtX =(EditText)findViewById(R.id.edt_x);
        btnCalculateX=(Button)findViewById(R.id.btn_calculate_x);
        txvResult=(TextView)findViewById(R.id.txv_result);

        btnCalculateX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = Float.parseFloat(edtX.getText().toString());
                float resultX = 0;

                resultX = (x+4)*(x-4);

                txvResult.setText(""+resultX);
            }
        });
    }
}

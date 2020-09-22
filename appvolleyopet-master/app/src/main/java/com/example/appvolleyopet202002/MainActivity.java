package com.example.appvolleyopet202002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResult);
    }

    public void solicitarDado(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        //String url = "https://www.google.com";
        String url = "https://cidades.ibge.gov.br/brasil";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            BolsaFamilia bolsaFamilia = new BolsaFamilia();
                            textResultado.setText(bolsaFamilia.valor);
                        }
                        catch (JSONException error){
                            textResultado.setText(error.getMessage());
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        textResultado.setText(error.getMessage());
                    }
                }
        );
        queue.add(request);
    }
}
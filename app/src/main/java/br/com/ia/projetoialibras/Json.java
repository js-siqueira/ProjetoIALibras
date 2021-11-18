package br.com.ia.projetoialibras;

import android.os.Build;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Base64;

@RequiresApi(api = Build.VERSION_CODES.O)
public class Json extends AppCompatActivity {

    ImageView image = (ImageView) findViewById(R.id.imagem);


    // Integer imagemCodificada = Base64.getEncoder().encodeToString(image, Base64.getEncoder());

    /*public void enviarDados(List<ClassSintomas> selecionados) throws Exception {
        String json = gerarJSON(selecionados);
        try {
            RequestQueue requestQueue = Volley.newRequestQueue(this);
            StringRequest sr = new StringRequest(Request.Method.POST, getURL(),
                    jsonResp -> tratarRespostaServidor(jsonResp),
                    error -> tratarRespostaErro(error)) {
                @Override
                public String getBodyContentType() {
                    return "application/json; charset=utf-8";
                }
                @Override

                public byte[] getBody() throws AuthFailureError {
                    try {
                        return json.getBytes("utf-8");
                    } catch (UnsupportedEncodingException uee) {
                        VolleyLog.wtf("Unsupported Encoding. Bytes of %s using %s", json, "utf-8");
                        return null;
                    }
                }

            };
            requestQueue.add(sr);
        } catch (Exception ex) {
            Log.e("t", ex.getMessage());
            Toast.makeText(this, "Erro ao decodificar dados",
                    Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }
    }

     */

}

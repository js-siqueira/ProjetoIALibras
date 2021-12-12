from flask import Flask, jsonify
from flask import request

app = Flask(__name__)

@app.route("/", methods=['GET', 'POST'])
def conexaoAndroid():
    
    json=request.get_json()
    if json is None:
        print("esta faltando json, não um request valido")
        return jsonify({'error': 'esta faltando json, não um request valido'})
    else:
        img_data = json['img']
        convert_and_save(img_data)

      # metodo para alterar a string base64 em img
     
        
    ia = joblib.load('svm_model_pkl')
    resultado = ia.predict([img_data])
    doenca = ''.join(map(str,resultado))
    return doenca

def convert_and_save(b64_string):
    with open("imageToSave.png", "wb") as fh:
        fh.write(upload_base64_file.b64decode()(b64_string.encode()))



if __name__ == "__main__":
    app.run()

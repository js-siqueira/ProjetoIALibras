from flask import Flask, jsonify
from flask import request

app = Flask(__name__)

@app.route("/", methods=['GET', 'POST'])
def conexaoAndroid():
    
    json=request.get_json()
    if json is None:
        print("No valid request body, json missing!")
        return jsonify({'error': 'No valid request body, json missing!'})
    else:
        img_data = json['img']
        convert_and_save(img_data)

      # this method convert and save the base64 string to image
     
        
    ia = joblib.load('svm_model_pkl')
    resultado = ia.predict([img_data])
    doenca = ''.join(map(str,resultado))
    return doenca

def convert_and_save(b64_string):
    with open("imageToSave.png", "wb") as fh:
        fh.write(upload_base64_file.b64decode()(b64_string.encode()))



if __name__ == "__main__":
    app.run()
package com.psalms.platenumberocr;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;



public class Verification extends AppCompatActivity {
    ImageView mImageView;
    Button btn_image;
    TextView txt_image;
    public static int REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        mImageView = findViewById(R.id.image);
        btn_image = findViewById(R.id.btnImage);
        txt_image = findViewById(R.id.txt_image);

//        btn_image.setOnClickListener(view -> chooseImage());
    }

//    private void chooseImage() {
//        //Check permission
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (checkSelfPermission(Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//                //Grant permission
//                requestPermissions(new String[]{Manifest.permission.CAMERA},REQUEST_CODE);
//            }
//        }
//        //Open the camera
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(intent,REQUEST_CODE);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        //Extract the image
//        Bundle bundle = data.getExtras();
//        Bitmap bitmap = (Bitmap) bundle.get("data");
//        mImageView.setImageBitmap(bitmap);
//
//        //Create a FirebaseVisionImage object from your image/bitmap.
//        FirebaseVisionImage firebaseVisionImage = FirebaseVisionImage.fromBitmap(bitmap);
//
//        FirebaseVision firebaseVision = FirebaseVision.getInstance();
//        FirebaseVisionTextRecognizer firebaseVisionTextRecognizer = firebaseVision.getOnDeviceTextRecognizer();
//
//        //Process the Image
//        Task<FirebaseVisionText> task = firebaseVisionTextRecognizer.processImage(firebaseVisionImage);
//
//        task.addOnSuccessListener(firebaseVisionText -> {
//            //Set recognized text from image in our TextView
//            String text = firebaseVisionText.getText();
//            txt_image.setText(text);
//        });
//        task.addOnFailureListener(e -> {
//            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
//        });
//    }
}
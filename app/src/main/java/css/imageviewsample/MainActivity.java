package css.imageviewsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView myIimageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myIimageView = findViewById(R.id.imageView);

        String imageUrl = "https://www.dndbeyond.com/avatars/thumbnails/6/254/420/618/636271781394265550.png";

        // Load and display the image using Picasso
        Picasso.get().load(imageUrl).into(myIimageView);

    }
}
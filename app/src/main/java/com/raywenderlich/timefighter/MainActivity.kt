package com.raywenderlich.timefighter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//TODO: Add a "Tap Me" Button
//TODO: Add Text for game score
//TODO: Add Text for Time Left
//TODO: When you tap the button the game starts and timer counts down
//TODO: Tapping the button again increments the score.
//TODO: When timer reaches zero show the score and reset the game.
//TODO: When phone is held in landscape mode rotate the game.
//TODO: It Should look nice.
//TODO: Submit it to Google Play Store.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

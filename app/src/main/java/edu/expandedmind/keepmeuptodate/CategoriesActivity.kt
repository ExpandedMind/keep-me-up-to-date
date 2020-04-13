package edu.expandedmind.keepmeuptodate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_categories.*

class CategoriesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        setupUIListeners()
    }

    private fun setupUIListeners() {
        downloadBtn.setOnClickListener {view ->
            //TODO add code here to open up FeedsActivity
        }
    }


}

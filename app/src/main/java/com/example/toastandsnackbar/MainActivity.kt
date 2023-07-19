package com.example.toastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener{
            Toast.makeText(this, "Toast Clicked", Toast.LENGTH_SHORT).show()
        }
        binding.btnToastLong.setOnClickListener{
            Toast.makeText(this, "Toast Long Clicked", Toast.LENGTH_LONG).show()
        }
        binding.btnSnackLong.setOnClickListener{
        Snackbar.make(binding.root, "Snackbar Long", Snackbar.LENGTH_LONG)
            .setAction("OK") {}
            .show()
        }
        binding.btnSnackShort.setOnClickListener{
        Snackbar.make(binding.root, "Snackbar Short", Snackbar.LENGTH_SHORT)
            .setAction("OK") {}
            .show()
        }
        binding.btnSnackIndefinite.setOnClickListener{
        Snackbar.make(binding.root, "Snackbar Indefinite", Snackbar.LENGTH_INDEFINITE)
            .setAction("OK") {}
            .show()
        }

    }
}
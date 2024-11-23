package com.ruslanhuseynov.toycarsrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.ruslanhuseynov.toycarsrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ToyCarsAdapter
    private var carList = ArrayList<Cars>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val car0 = Cars("Classic Car",8.99,R.drawable.classic1)
        val car1 = Cars("Classic Car",9.99,R.drawable.classic2)
        val car2 = Cars("Classic Car",7.80,R.drawable.classic3)
        val car3 = Cars("New Car",10.99,R.drawable.classic4)
        val car4 = Cars("Sport Car",12.99,R.drawable.classic5)
        val car5 = Cars("New Car",9.99,R.drawable.classic6)
        val car6 = Cars("Sport Car",11.99,R.drawable.car7)
        val car7 = Cars("Old Car",13.99,R.drawable.classic8)
        val car8 = Cars("Sport Car",15.99,R.drawable.sports9)
        val car9 = Cars("Old Car",7.99,R.drawable.classic10)
        val car10 = Cars("Classic Sport Car",18.99,R.drawable.classic11)
        val car11 = Cars("Classic Car",9.99,R.drawable.classic12)
        val car12 = Cars("Classic Car",10.0,R.drawable.classic13)
        val car13 = Cars("Classic Car",11.99,R.drawable.classic14)
        val car14 = Cars("Classic Sport Car",13.99,R.drawable.classic15)

        carList.add(car0)
        carList.add(car1)
        carList.add(car2)
        carList.add(car3)
        carList.add(car4)
        carList.add(car5)
        carList.add(car6)
        carList.add(car7)
        carList.add(car8)
        carList.add(car9)
        carList.add(car10)
        carList.add(car11)
        carList.add(car12)
        carList.add(car13)
        carList.add(car14)

        adapter = ToyCarsAdapter(this,carList)

        binding.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        binding.rv.adapter = adapter
    }
}
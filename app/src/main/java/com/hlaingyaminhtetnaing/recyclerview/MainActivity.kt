package com.hlaingyaminhtetnaing.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hlaingyaminhtetnaing.recyclerview.adapter.FlowerAdapter
import com.hlaingyaminhtetnaing.recyclerview.model.Flower
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var flowerlist = ArrayList<Flower>()
        flowerlist.add(Flower("Daisy", 32.0, R.drawable.raisy))//R.=Int
        flowerlist.add(Flower("Rose", 32.0, R.drawable.rose_flower))
        flowerlist.add(Flower("Jasmine",30.00,R.drawable.jasmine))
        flowerlist.add(Flower("Lee",30.00,R.drawable.lee))
        flowerlist.add(Flower("Lotus",30.00,R.drawable.lotus))
        flowerlist.add(Flower("Gardenia",30.00,R.drawable.gardenia))


        var flowerAdapter=FlowerAdapter(flowerlist)
        flowerRecycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        flowerRecycler.adapter=flowerAdapter
    }
}
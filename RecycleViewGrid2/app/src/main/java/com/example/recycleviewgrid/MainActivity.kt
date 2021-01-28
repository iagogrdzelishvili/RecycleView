package com.example.recycleviewgrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var  recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recycleviewgrid)

        val products= ArrayList<products>()
        products.add(products(id=1,R.drawable.download))
        products.add(products(id=1,R.drawable.download__1_))
        products.add(products(id=1,R.drawable.download__2_))
        products.add(products(id=1,R.drawable.download__3_))
        products.add(products(id=1,R.drawable.download__4_))
        products.add(products(id=1,R.drawable.priory_of_sion))
        products.add(products(id=1,R.drawable.chuck_norris_nikita_abakumov))
        products.add(products(id=1,R.drawable.ic_launcher_foreground))
        products.add(products(id=1,R.drawable.ic_launcher_background))





        val adapter=product_item(products)

        recyclerView.layoutManager= GridLayoutManager(this,2)
        recyclerView.adapter=adapter


    }
}
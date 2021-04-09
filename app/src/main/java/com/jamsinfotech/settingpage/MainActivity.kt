package com.jamsinfotech.settingpage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.robertlevonyan.views.expandable.Expandable
import com.robertlevonyan.views.expandable.ExpandingListener


class MainActivity : AppCompatActivity() {
    lateinit var ExpandableCard:Expandable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ExpandableCard = findViewById(R.id.expandable)
        ExpandableCard.setExpandingListener(object : ExpandingListener {
            override fun onExpanded() {

                //some stuff on expand
            }

            override fun onCollapsed() {

                //some stuff on collapse
            }
        }
        )
    }
}
package com.conamobile.pdpgridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ListView
import com.conamobile.pdpgridview.adapter.MemberAdapter
import com.conamobile.pdpgridview.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var listView: GridView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        listView = findViewById(R.id.list_view)

        val members: ArrayList<Member> = ArrayList<Member>()
        for (i in 0..30){
        members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
        members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
        members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
        members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
        members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
        }
        refreshAdapter(members)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = MemberAdapter(this, members)
        listView!!.adapter = adapter
    }
}
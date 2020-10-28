package com.example.counter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.counter.R
import com.example.counter.ui.home.HomeViewModel
import kotlinx.android.synthetic.main.fragment_firstcounter.*

import kotlinx.android.synthetic.main.nav_header_main.*
import org.w3c.dom.Text


class FirstCounter : Fragment() {

    var count = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_firstcounter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttontambah.setOnClickListener{
            onTapTambah(it)
        }

        buttonkurang.setOnClickListener{
            onTapKurang(it)
        }
    }

    fun onTapTambah(view: View) {
        count++

        val counter_int = textview_counter as TextView
        counter_int.text = count.toString()
    }

    fun onTapKurang(view: View) {
        if(count > 0) {
            count--
        } else {
            count = 0
        }

        val counter_int = textview_counter as TextView
        counter_int.text = count.toString()
    }
}

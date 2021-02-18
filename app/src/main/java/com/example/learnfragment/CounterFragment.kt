package com.example.learnfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_counter.*


class CounterFragment : Fragment() {
    private var showCounterFragment : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //memanggil xmlnya
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = activity as MainActivity

       btn_plus.setOnClickListener {
               showCounterFragment++
               activity.controllerData(showCounterFragment)
                btn_minus.setEnabled(true)

        }
        btn_minus.setOnClickListener {
            if(showCounterFragment > 0) {
                showCounterFragment--
                activity.controllerData(showCounterFragment)
                btn_minus.setEnabled(true)
            } else {
                activity.controllerData(showCounterFragment)
                btn_minus.setEnabled(false);
                Toast.makeText(requireContext(), "Please Try Again", Toast.LENGTH_SHORT).show()
            }


            }
    }
}
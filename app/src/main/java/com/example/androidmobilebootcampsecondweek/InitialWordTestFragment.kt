package com.example.androidmobilebootcampsecondweek

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import android.content.Intent


/**
 * A simple [Fragment] subclass.
 * Use the [InitialWordTestFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class InitialWordTestFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_initial_word_test, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var buttonInitial: Button? = view?.findViewById(R.id.buttonInitial)

        var string : String = "Visualize"
        val stringArr : Array<String> = arrayOf("Görselleştirmek", "Altında", "Bağış", "Ensülin")

        buttonInitial?.setOnClickListener {
            val intent = Intent(activity, WordTestActivity::class.java)
            intent.putExtra("string", string)
            intent.putExtra("string array", stringArr)
            activity?.startActivity(intent)
        }

    }





}
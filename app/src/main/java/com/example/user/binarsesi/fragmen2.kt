package com.example.user.binarsesi

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class fragment2 : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragmen2, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        childFragmentManager.beginTransaction().replace(R.id.frame_layout_1, fragment1()).commit()
        childFragmentManager.beginTransaction().replace(R.id.frame_layout_2, fragment3()).commit()
    }

}
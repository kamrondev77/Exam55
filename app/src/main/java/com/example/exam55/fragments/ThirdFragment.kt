package com.example.exam55.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam55.R
import com.example.exam55.adapter.Fr3Adapter
import com.example.exam55.model.Messages

class ThirdFragment : Fragment() {

    var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    fun initViews() {

        recyclerView = view?.findViewById(R.id.recyclerViewFr3)
        recyclerView!!.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Messages>) {
        val adapter = Fr3Adapter(requireContext(), chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats() : ArrayList<Messages> {
        var chats = ArrayList<Messages>()

        chats.add(Messages(R.drawable.im_sample1))
        chats.add(Messages(R.drawable.im_sample2))
        chats.add(Messages(R.drawable.im_sample3))
        chats.add(Messages(R.drawable.im_sample4))
        chats.add(Messages(R.drawable.im_sample5))
        chats.add(Messages(R.drawable.im_sample6))
        chats.add(Messages(R.drawable.im_sample1))
        chats.add(Messages(R.drawable.im_sample2))
        chats.add(Messages(R.drawable.im_sample1))
        chats.add(Messages(R.drawable.im_sample2))
        chats.add(Messages(R.drawable.im_sample3))
        chats.add(Messages(R.drawable.im_sample4))
        chats.add(Messages(R.drawable.im_sample5))
        chats.add(Messages(R.drawable.im_sample6))
        chats.add(Messages(R.drawable.im_sample1))
        chats.add(Messages(R.drawable.im_sample2))

        return chats
    }
}
package com.example.exam55.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam55.R
import com.example.exam55.adapter.Fr4Adapter
import com.example.exam55.model.Search

class FourthFragment : Fragment() {

    var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    fun initViews() {
        recyclerView = view?.findViewById(R.id.recyclerViewFr4)
        recyclerView!!.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        refreshAdapter(getAllItems())
    }

    fun refreshAdapter(items: ArrayList<Search>) {
        val adapter = Fr4Adapter(requireContext(), items)
        recyclerView!!.adapter = adapter
    }

    fun getAllItems() : ArrayList<Search> {
        var items = ArrayList<Search>()
        items.add(Search(R.drawable.im_restaurant, "Lupa Tralaforia"))
        items.add(Search(R.drawable.im_rec1_fr13, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_rec1_fr13, "Filippe"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Italian"))
        items.add(Search(R.drawable.im_rec1_fr13, "Doppio"))
        items.add(Search(R.drawable.im_rec1_fr1, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Negato"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        items.add(Search(R.drawable.im_restaurant, "Doppio"))
        return items
    }
}
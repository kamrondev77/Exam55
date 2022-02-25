package com.example.exam55.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam55.R
import com.example.exam55.adapter.Fr1Rec1Adapter
import com.example.exam55.adapter.Fr1Rec2Adapter
import com.example.exam55.model.Categories
import com.example.exam55.model.Restaurants

class FirstFragment : Fragment() {

    var recyclerView1: RecyclerView? = null
    var recyclerView2: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    fun initViews() {
        recyclerView1 = requireView().findViewById(R.id.recyclerView1Fr1)
        recyclerView1!!.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        recyclerView2 = requireView().findViewById(R.id.recyclerView2Fr1)
        recyclerView2!!.layoutManager = GridLayoutManager(requireContext(), 2)

        refreshAdapter1(getAllCategories())
        refreshAdapter2(getAllRestaurants())
    }

    fun refreshAdapter1(categories: ArrayList<Categories>) {
        val adapter = Fr1Rec1Adapter(requireContext(), categories)
        recyclerView1!!.adapter = adapter
    }

    fun refreshAdapter2(restaurants: ArrayList<Restaurants>) {
        val adapter = Fr1Rec2Adapter(requireContext(), restaurants)
        recyclerView2!!.adapter = adapter
    }

    fun getAllCategories() : ArrayList<Categories> {
        var categories = ArrayList<Categories>()

        categories.add(Categories(R.drawable.im_restaurant, "Restaurants"))
        categories.add(Categories(R.drawable.im_rec1_fr1, "Coffee Shops"))
        categories.add(Categories(R.drawable.im_rec1_fr12, "Shopping"))
        categories.add(Categories(R.drawable.im_rec1_fr13, "Entertainment"))
        categories.add(Categories(R.drawable.im_restaurant, "Restaurants"))
        categories.add(Categories(R.drawable.im_rec1_fr1, "Coffee Shops"))
        categories.add(Categories(R.drawable.im_rec1_fr12, "Shopping"))
        categories.add(Categories(R.drawable.im_rec1_fr13, "Entertainment"))

        return categories
    }

    fun getAllRestaurants() : ArrayList<Restaurants> {
        var resta = ArrayList<Restaurants>()

        resta.add(Restaurants(R.drawable.im_restaurant, "Gamine"))
        resta.add(Restaurants(R.drawable.im_restaurant, "Doppio Zero"))
        resta.add(Restaurants(R.drawable.im_restaurant, "Gamine"))
        resta.add(Restaurants(R.drawable.im_restaurant, "Gamine"))
        resta.add(Restaurants(R.drawable.im_restaurant, "Gamine"))
        resta.add(Restaurants(R.drawable.im_restaurant, "Gamine"))
        resta.add(Restaurants(R.drawable.im_restaurant, "Gamine"))
        resta.add(Restaurants(R.drawable.im_restaurant, "Gamine"))


        return resta
    }
}
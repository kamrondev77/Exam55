package com.example.exam55.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exam55.R
import com.example.exam55.adapter.Fr2Adapter
import com.example.exam55.model.CategoryFragment

class SecondFragment : Fragment() {

    var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    fun initViews() {
        recyclerView = requireView().findViewById(R.id.recyclerViewFr2)
        recyclerView!!.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

        refreshAdapter(getAllCategories())
    }

    fun refreshAdapter(categories: ArrayList<CategoryFragment>) {
        val adapter = Fr2Adapter(requireContext(), categories)
        recyclerView!!.adapter = adapter
    }

    fun getAllCategories() : ArrayList<CategoryFragment> {
        var categories = ArrayList<CategoryFragment>()

        categories.add(CategoryFragment(R.drawable.im_restaurant, "Restaurants"))
        categories.add(CategoryFragment(R.drawable.im_hotels, "Hotels"))
        categories.add(CategoryFragment(R.drawable.im_car, "Cars"))
        categories.add(CategoryFragment(R.drawable.im_furniture, "Furnitures"))
        categories.add(CategoryFragment(R.drawable.im_job, "Jobs"))
        categories.add(CategoryFragment(R.drawable.im_restaurant, "Restaurants"))
        categories.add(CategoryFragment(R.drawable.im_hotels, "Hotels"))
        categories.add(CategoryFragment(R.drawable.im_car, "Cars"))
        categories.add(CategoryFragment(R.drawable.im_furniture, "Furnitures"))
        categories.add(CategoryFragment(R.drawable.im_job, "Jobs"))

        return categories
    }
}
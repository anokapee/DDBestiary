package com.dynamicdevs.ddbestiary.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dynamicdevs.ddbestiary.databinding.FragmentSearchBinding
import com.dynamicdevs.ddbestiary.model.data.dd.monster.DDMonsterResult

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    private lateinit var databaseDelegate: DatabaseDelegate
    private lateinit var apiDelegate : APIDelegate

    interface DatabaseDelegate{
        fun insertNewMonster(monster:DDMonsterResult)
        fun removeMonster(monster:DDMonsterResult)
    }

    interface APIDelegate{
        fun searchMonster(query:String)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(
            inflater,
            container,
            false
        )
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view:View, savedInstanceState:Bundle?){
        super.onViewCreated(view, savedInstanceState)
        binding.searchButton.setOnClickListener{
            val monsterName = binding.monsterNameEditText.text.toString().trim()
            //apiDelegate.searchMonster(monsterName);
        }
    }

    /*companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SearchFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SearchFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }*/
}
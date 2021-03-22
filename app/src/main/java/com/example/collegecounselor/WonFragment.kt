package com.example.collegecounselor


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.collegecounselor.databinding.FragmentWonBinding
import kotlinx.android.synthetic.main.fragment_won.*


/**
 * A simple [Fragment] subclass.
 */
class WonFragment : Fragment() {
    lateinit var binding:FragmentWonBinding
    var total = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_won, container, false)
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_won,container,false)
        binding.playAgain.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_wonFragment_to_unlockFragment)
        }

//        binding.value = this
        return binding.root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//
//        arguments?.let {
//            val args = WonFragmentArgs.fromBundle(it)
//            total = args.score.toInt()
//            if (args.score>1){
//                butscore.visibility = View.VISIBLE
//                Log.d(" value :",total.toString())
//            }
//            Log.d(" value :",total.toString())
//
//        }
//    }
}

package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        option = arguments?.getInt("index")?:-1 //null 이면 -1 로 하겠다
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        setResult(option)
        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }
    fun setResult(option : Int){//상세결과를 바꾸기 위함
        when(option){
            1 -> {
                tv_main.text = "You are a QUITTER!"
                tv_sub.text = "You can let the person easily"
            }
            2->{
                tv_main.text = "You should focus \non yourself"
                tv_sub.text = "You become really clingy to your ex."
            }
            3->{
                tv_main.text = "You should take it easy"
                tv_sub.text = "Yout can do crazy things no matter what it takes."
            }
            4->{
                tv_main.text = "You are pretty mature"
                tv_sub.text = "You can easily accept the break-up."
            }
        }
    }

}
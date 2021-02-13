package com.example.lovetest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.lovetest.R
import kotlinx.android.synthetic.main.fragment_question.*


class QuestionFrament : Fragment(),View.OnClickListener {

    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=Navigation.findNavController(view)

        btn_next.setOnClickListener(this)
        //버튼 동작 인터페이스
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question, container, false)
    }
    //이런 방식으로 만들면 한페이지에 여러개의 클릭 이벤트를 같이 관리할수있음
    override fun onClick(v: View?) {
       when(v?.id){
           R.id.btn_next->{
               navController.navigate(R.id.action_questionFrament_to_selectionFragment)
           }
       }
    }


}
package org.danielcastelao.bdiaznunez.kotlindosfragments
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,

                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        return inflater!!.inflate(R.layout.fragment_second, container, false)

    }

    override fun onAttach(context: Context?) {

        super.onAttach(context)



    }



    override fun onDetach() {

        super.onDetach()



    }

}

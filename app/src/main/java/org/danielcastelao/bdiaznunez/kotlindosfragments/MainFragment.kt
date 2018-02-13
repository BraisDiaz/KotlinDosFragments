package org.danielcastelao.bdiaznunez.kotlindosfragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
//import org.jetbrains.anko.support.v4.toast

// para poder acceder a los elementos del layout
// libreria Anko para facilitar (aún mas) código

//import org.jetbrains.anko.support.v4.toast

class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
        /**
         * Cargamos el layout del fragment
         */

        override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View? {
            return inflater!!.inflate(R.layout.fragment_main, container, false)

        }

        override fun onDetach() {

            super.onDetach()

        }

        override fun onAttach(context: Context?) {

            super.onAttach(context)

    }

        /**
         * Una vez cargado el layout podemos utilizar sus elementos
         */

        override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

            super.onViewCreated(view, savedInstanceState)

            // añadimos funcionalidad al boton

            main_button.setOnClickListener {

                // Mostramos una toast

                // Para utilizar este método necesitamos la librería Anko que completa las funcionalidades de Kotlin

                // https://github.com/Kotlin/anko

                // es necesario

                // toast("Mensaje: ${main_editText.text}")

                // mostramos en el TextView lo que introducimos en el EditText

                //toast("Mensaje: ${main_editText}.text")

                main_textview.text = main_editText.text

                // Utilizamos 'activity' para indicar el context,

                // como es un fragment el context es la activity que lo contiene

                val datos = Intent(activity,Main2Activity::class.java)

                datos.putExtra("key1","valor1")

                startActivity(datos)

            }

        }
}

package com.sk.cleartripdemoapplication.presentation.login_sign_up

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sk.cleartripdemoapplication.R
import com.sk.cleartripdemoapplication.databinding.FragmentLoginSignUpBinding

/**
 * A simple [Fragment] subclass.
 * Use the [LoginSignUpFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginSignUpFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var loginSignUpBinding: FragmentLoginSignUpBinding? = null

    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        loginSignUpBinding = FragmentLoginSignUpBinding.inflate(inflater, container, false)
        return loginSignUpBinding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        initObserver()

        loginSignUpBinding?.apply {

            btnLoginSignup.setOnClickListener {
                loginViewModel.loginOrRegister(etEmail.text.toString(), etPassword.text.toString())
            }
        }
    }

    private fun initObserver() {
        loginViewModel.loginSignUpUIState.observe(viewLifecycleOwner) {
            when (it) {
                is LoginSignUpUIState.LoginSuccess -> {
                    findNavController().navigate(R.id.action_to_plp)
                }
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoginSignUpFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoginSignUpFragment().apply {
                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
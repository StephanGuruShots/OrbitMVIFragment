package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.orbitmvi.orbit.ContainerHost

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val viewModel: FirstViewModel by viewModels()

    val flow: Channel<Int> = Channel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        viewModel.observe(
            state = ::render,
            sideEffect = ::handleSideEffect,
            lifecycleOwner = viewLifecycleOwner
        )

    }

    private fun render(state: StateFlow<FirstViewModel.CalculatorState>) {

//        viewLifecycleOwner.collectUntilChanged(
//            state = state,
//            areEquivalent = { old, new ->
//                old.firstNumber == new.firstNumber
//            }
//        ) {
//            firstChanged(it.firstNumber)
//        }

        // example to use
        state.collectUntilChanged(
            lifecycleOwner = viewLifecycleOwner,
            areEquivalent = { old, new ->
                old.firstNumber == new.firstNumber
            }
        ) {
            firstChanged(it.firstNumber)
        }

//        viewLifecycleOwner.lifecycleScope.launch {
//            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
//                state.distinctUntilChanged { old, new ->
//                    old.firstNumber == new.firstNumber
//                }.collect {
//                    firstChanged(it.firstNumber)
//                }
//            }
//        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                state.distinctUntilChanged { old, new ->
                    old.secondNumber == new.secondNumber
                }.collect {
                    secondChanged(it.secondNumber)
                }
            }
        }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                state.distinctUntilChanged { old, new ->
                    old.thirdNumber == new.thirdNumber
                }.collect {
                    thirdChanged(it.thirdNumber)
                }
            }
        }
    }

    private fun handleSideEffect(sideEffect: FirstViewModel.CalculatorSideEffect) {

    }

    var firstCounter: Int = 0
    fun firstChanged(number: Int) {
        Log.d("rawr", "first ${++firstCounter}")
        binding.first.text = number.toString()
    }

    var secondCounter: Int = 0
    fun secondChanged(number: Int) {
        Log.d("rawr", "second ${++secondCounter}")
        binding.second.text = number.toString()
    }

    var thirdCounter: Int = 0
    fun thirdChanged(number: Int) {
        Log.d("rawr", "third ${++thirdCounter}")
        binding.third.text = number.toString()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


fun <STATE : Any, SIDE_EFFECT : Any> ContainerHost<STATE, SIDE_EFFECT>.observe(
    lifecycleOwner: LifecycleOwner,
    lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
    state: ((state: StateFlow<STATE>) -> Unit)? = null,
    sideEffect: (suspend (sideEffect: SIDE_EFFECT) -> Unit)? = null
) {
    state?.let { state(container.stateFlow) }
    lifecycleOwner.lifecycleScope.launch {
        lifecycleOwner.lifecycle.repeatOnLifecycle(lifecycleState) {
            sideEffect?.let { launch { container.sideEffectFlow.collect { sideEffect(it) } } }
        }
    }
}

//fun <T> LifecycleOwner.collectUntilChanged(
//    state: StateFlow<T>,
//    lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
//    areEquivalent: (old: T, new: T) -> Boolean,
//    onCollect: (state: T) -> Unit
//) {
//    this.lifecycleScope.launch {
//        this@collectUntilChanged.lifecycle.repeatOnLifecycle(lifecycleState) {
//            state.distinctUntilChanged { old, new ->
//                areEquivalent(old, new)
//            }.collect {
//                onCollect(it)
//            }
//        }
//    }
//}

fun <T> StateFlow<T>.collectUntilChanged(
    lifecycleOwner: LifecycleOwner,
    lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
    areEquivalent: (old: T, new: T) -> Boolean,
    onCollect: (state: T) -> Unit
) {
    lifecycleOwner.lifecycleScope.launch {
        lifecycleOwner.lifecycle.repeatOnLifecycle(lifecycleState) {
            this@collectUntilChanged.distinctUntilChanged { old, new ->
                areEquivalent(old, new)
            }.collect {
                onCollect(it)
            }
        }
    }
}

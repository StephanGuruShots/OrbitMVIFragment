package com.example.myapplication

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import org.orbitmvi.orbit.ContainerHost
import org.orbitmvi.orbit.syntax.simple.intent
import org.orbitmvi.orbit.syntax.simple.reduce
import org.orbitmvi.orbit.viewmodel.container

class FirstViewModel :
    ContainerHost<FirstViewModel.CalculatorState, FirstViewModel.CalculatorSideEffect>,
    ViewModel() {

    override val container = container<CalculatorState, CalculatorSideEffect>(CalculatorState())

    init {
        intent {
            while (true) {
                reduce {
                    state.copy(firstNumber = state.firstNumber + 1)
                }
                delay(2000)
            }
        }
        intent {
            while (true) {
                reduce {
                    state.copy(secondNumber = state.secondNumber + 1)
                }
                delay(4000)
            }
        }
        intent {
            while (true) {
                reduce {
                    state.copy(thirdNumber = state.thirdNumber + 1)
                }
                delay(6000)
            }
        }
    }


    data class CalculatorState(
        val total: Int = 0,
        val firstNumber: Int = 0,
        val secondNumber: Int = 0,
        val thirdNumber: Int = 0,
    )

    sealed class CalculatorSideEffect {
        data class Toast(val text: String) : CalculatorSideEffect()
    }
}
package com.example.excersie1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {
            //val = value or var = variable
            val car_price = editTextCarPrice.text.toString().toInt()
            val down_payment = editTextDownPayment.text.toString().toInt()
            val loan_period = editTextLoanPeriod.text.toString().toInt()
            val interest_rate = editTextInterestRate.text.toString().toFloat()

            if(car_price.length == 0)

            //TODO : Continue your calculation here
            //TODO : Find the locale of the use and display currency sign

            val loan = car_price - down_payment
            val interest = loan * interest_rate * loan_period
            val monthlyRepayment = ( loan + interest ) / loan / 12

            textViewLoan.text = getString(R.string.loan) + "${loan}"
            textViewInterest.text = getString(R.string.interest) + "${interest}"
            textViewMonthlyRepayment.text = getString(R.string.monthly_repayment) + "${monthlyRepayment}"
        }
    }

    fun resetInputs(view: View) {
        //TODO : reset all input and ouputs

        editTextCarPrice.setText("")
        editTextDownPayment.setText("")
        editTextInterestRate.setText("")
        editTextLoanPeriod.setText("")

        textViewLoan.setText(R.string.loan)
        textViewInterest.setText(R.string.interest)
        textViewMonthlyRepayment.setText(R.string.monthly_repayment)
    }
}

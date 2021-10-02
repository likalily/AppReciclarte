package reciclarte.com.br.reciclarte.view.config.creditcard


import android.os.Bundle
import android.view.View
import com.santalu.maskedittext.MaskEditText
import kotlinx.android.synthetic.main.fragment_config_new_credit_card.*
import reciclarte.com.br.reciclarte.R
import reciclarte.com.br.reciclarte.util.isValidCNPJ
import reciclarte.com.br.reciclarte.util.isValidCPF
import reciclarte.com.br.reciclarte.view.config.ConfigFormFragment


class FormCreditCardFragment :
    ConfigFormFragment(),
    View.OnFocusChangeListener{

    override fun title()
        = R.string.config_credit_cards_tab_new

    override fun getLayoutResourceID()
        = R.layout.fragment_config_new_credit_card

    override fun onActivityCreated( savedInstanceState: Bundle? ) {
        super.onActivityCreated( savedInstanceState )

        updateFlFormToFullFreeScreen()

        bt_add_credit_card.setOnClickListener{
            /*
             * O método mainAction() é invocado no lugar
             * de callPasswordDialog(), pois aqui não há
             * necessidade de dialog de senha para a
             * adição de cartão de crédito.
             * */
            mainAction()
        }

        et_credit_card_security_code.setOnEditorActionListener( this )

        met_credit_card_owner_reg.setOnFocusChangeListener( this )
    }

    override fun onFocusChange(
        view: View,
        hasFocus: Boolean) {

        var mask = "" /* Sem máscara. */
        val editText = view as MaskEditText

        /*
         * Garantindo que o conteúdo em teste terá apenas
         * números.
         * */
        val pattern = Regex("[^0-9 ]")
        val content = editText
            .text
            .toString()
            .replace( pattern, "" )

        if( !hasFocus ){
            if( content.isValidCPF() ){
                /* Máscara CPF. */
                mask = "###.###.###-##"
            }
            else if( content.isValidCNPJ() ){
                /* Máscara CNPJ. */
                mask = "##.###.###/####-##"
            }
        }

        /*
         * Aplicando a nova máscara de acordo com a
         * quantidade de números presentes em campo.
         * */
        editText.mask = mask

        /*
         * Para que a nova máscara seja aplicada é preciso
         * forçar uma atualização no campo.
         * */
        editText.setText( content )
    }

    override fun backEndFakeDelay(){
        backEndFakeDelay(
            false,
            getString( R.string.invalid_credit_card )
        )
    }

    override fun blockFields( status: Boolean ){
        met_credit_card_number.isEnabled = !status
        sp_credit_card_enterprise.isEnabled = !status
        et_credit_card_owner_name.isEnabled = !status
        met_credit_card_owner_reg.isEnabled = !status
        sp_credit_card_expiry_month.isEnabled = !status
        et_credit_card_expiry_year.isEnabled = !status
        et_credit_card_security_code.isEnabled = !status
        bt_add_credit_card.isEnabled = !status
    }

    override fun isMainButtonSending( status: Boolean ){
        bt_add_credit_card.text =
            if( status )
                getString( R.string.add_credit_card_going )
            else
                getString( R.string.add_credit_card )
    }
}

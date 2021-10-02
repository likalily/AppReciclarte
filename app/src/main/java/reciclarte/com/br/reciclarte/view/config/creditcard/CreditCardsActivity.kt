package reciclarte.com.br.reciclarte.view.config.creditcard

import reciclarte.com.br.reciclarte.view.config.ConfigFormActivity
import reciclarte.com.br.reciclarte.view.config.ConfigSectionsAdapter

class CreditCardsActivity :
    ConfigFormActivity() {

    override fun getSectionsAdapter()
        = ConfigSectionsAdapter(
            this,
            supportFragmentManager,
            CreditCardsListFragment(),
            FormCreditCardFragment()
        )
}
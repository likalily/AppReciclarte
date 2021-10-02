package reciclarte.com.br.reciclarte.view.config.deliveryaddress

import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_tabs_user_config.*
import reciclarte.com.br.reciclarte.view.config.ConfigFormActivity
import reciclarte.com.br.reciclarte.view.config.ConfigSectionsAdapter


class DeliveryAddressesActivity :
    ConfigFormActivity() {

    override fun getSectionsAdapter()
        = ConfigSectionsAdapter(
            this,
            supportFragmentManager,
            DeliveryAddressHostFragment(),
            FormNewDeliveryAddressFragment()
        )

    override fun onOptionsItemSelected( item: MenuItem ): Boolean {

        if( item.itemId == android.R.id.home ){
            onBackPressed()
            return true
        }

        return super.onOptionsItemSelected( item )
    }

    override fun onBackPressed() {
        val fragmentsInStack = supportFragmentManager.backStackEntryCount

        /*
         * Se houver algum fragmento em pilha de fragmentos
         * e o fragmento atual em tela não for o fragment de
         * formulário de novo endereço de entrega, então o
         * próximo fragmento da pilha de fragmentos é que
         * deve ser apresentado.
         *
         * Caso contrário, volte a atividade anterior via
         * finish().
         * */
        if( fragmentsInStack > 0
            && isNewDeliveryAddressFormNotInScreen() ){
            supportFragmentManager.popBackStack()
        }
        else {
            finish()
        }
    }

    private fun isNewDeliveryAddressFormNotInScreen() : Boolean
        = view_pager.currentItem != FormNewDeliveryAddressFragment.PAGER_POS
}
package reciclarte.com.br.reciclarte.view.config.deliveryaddress


import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_config_list.*
import reciclarte.com.br.reciclarte.R
import reciclarte.com.br.reciclarte.data.DeliveryAddressesDataBase
import reciclarte.com.br.reciclarte.view.config.ConfigListFragment


class DeliveryAddressesListFragment :
    ConfigListFragment() {

    companion object{
        const val TAB_TITLE = R.string.config_delivery_addresses_tab_list
    }

    override fun title() = TAB_TITLE

    override fun backEndFakeDelay() {
        backEndFakeDelay(
            true,
            getString( R.string.delivery_address_removed )
        )
    }

    override fun onActivityCreated( savedInstanceState: Bundle? ) {
        super.onActivityCreated( savedInstanceState )

        tv_empty_list.setText( R.string.delivery_address_list_empty )
    }

    override fun getRecyclerViewAdapter()
        = DeliveryAddressesListAdapter(
            this,
            DeliveryAddressesDataBase.getItems()
        )
}

package reciclarte.com.br.reciclarte.data

import android.content.Context
import reciclarte.com.br.reciclarte.R
import reciclarte.com.br.reciclarte.domain.AccountSettingItem
import reciclarte.com.br.reciclarte.view.config.profile.ProfileActivity
import reciclarte.com.br.reciclarte.view.config.connectiondata.ConnectDataActivity
import reciclarte.com.br.reciclarte.view.config.creditcard.CreditCardsActivity
import reciclarte.com.br.reciclarte.view.config.deliveryaddress.DeliveryAddressesActivity

class AccountSettingsItemsDataBase {

    companion object{

        fun getItems( context: Context )
            = listOf(
                AccountSettingItem(
                    context.getString( R.string.setting_item_profile ),
                    context.getString( R.string.setting_item_profile_desc ),
                    ProfileActivity::class.java
                ),
                AccountSettingItem(
                    context.getString( R.string.setting_item_login ),
                    context.getString( R.string.setting_item_login_desc ),
                    ConnectDataActivity::class.java
                ),
                AccountSettingItem(
                    context.getString( R.string.setting_item_address ),
                    context.getString( R.string.setting_item_address_desc ),
                    DeliveryAddressesActivity::class.java
                ),
                AccountSettingItem(
                    context.getString( R.string.setting_item_credit_cards ),
                    context.getString( R.string.setting_item_credit_cards_desc ),
                    CreditCardsActivity::class.java
                )
            )
    }
}